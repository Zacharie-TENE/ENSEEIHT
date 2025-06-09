import json
import pandas as pd
import os

class TableCodeGenerator:
    def __init__(self, json_schema_path: str):
        with open(json_schema_path, 'r') as f:
            self.schema = json.load(f)
        self.table_name = self.schema["Tableau"]["name"].replace(" ", "_")
        self.columns = self.schema["Tableau"]["colonnes"]
        self.colonne_reference = self.schema["Tableau"].get("colonneReference", {})
        
    def generate_table_class(self) -> str:
        code = f"""
import pandas as pd
import os

class {self.table_name}:
    def __init__(self):
        self.data = pd.DataFrame()
        self.auto_calculate = False
        self.columns = {self._generate_columns()}
        self.schema={self.schema}
        

    def import_csv(self, filepath: str):
        if not os.path.exists(filepath):
            raise FileNotFoundError(f"Ressource {{filepath}} n'est pas valide")

     
        raw_data = pd.read_csv(filepath)

        final_data = pd.DataFrame()

       
        reference_col = self.schema["Tableau"]["colonneReference"]["name"]
        #reference_col_id = self.schema["Tableau"]["colonneReference"]["id"]
        reference_col_id = None
        for col in self.schema["Tableau"]["colonnes"]:
            if col["name"] == reference_col and isinstance(col.get("colonneType"), dict):
                reference_col_id = col["colonneType"].get("idColonne")
                break
        
        if reference_col_id not in raw_data.columns:
            raise ValueError(f"Reference  {{reference_col_id}} non trouvé dans le fichier csv")

        final_data[reference_col] = raw_data[reference_col_id]

     
        for col in self.schema["Tableau"]["colonnes"]:
            col_name = col["name"]
            col_type = col["type"]
            col_id = col["colonneType"].get("idColonne") if "colonneType" in col else None

            if col_id and col_id in raw_data.columns:
               
                final_data[col_name] = raw_data[col_id]
            elif "colonneType" in col and "colonneIN" in col["colonneType"]:
              
                final_data[col_name] = None
            else:
              
                final_data[col_name] = None

        self.data = final_data

                
    def export_csv(self, filepath: str):
        \"\"\"on exporte les données courante au format CSV\"\"\"
        self.data.to_csv(filepath, index=False)
        
 
    def get_schema_columns(self) -> list:
        return {[col["name"] for col in self.columns]}

    def verify_constraints(self) -> dict:
        \"\"\"on verifie les contrainte et les violations\"\"\"
        violations = {{}}
        
{self._generate_constraint_checks()}
        
        return violations
        
    def calculate_derived_columns(self):
        \"\"\"Calculate all derived columns\"\"\"
        
{self._generate_derived_calculations()}

    def toggle_auto_calculate(self, enabled: bool):
        \"\"\"Enable/disable automatic calculation of derived columns\"\"\"
        self.auto_calculate = enabled
        if enabled:
            self.calculate_derived_columns()

    def is_derived_column(self, column_key: str) -> bool:
        column = self.columns[column_key]
        return "colonneType" in column and "colonneIN" in column["colonneType"]

    def validate_column_value(self, column: str, value):
        \"\"\"Valide la valeur donnée pour une colonne spécifique.\"\"\"
        if column not in self.columns:
            raise ValueError(f"Colonne {{column}} non trouvée.")

        col_type = self.columns[column]['type']
        try:
            if col_type == "float":
                value = float(value)
            elif col_type == "int":
                value = int(value)
        except ValueError:
            raise ValueError(f"La valeur {{value}} n'est pas valide pour le type {{col_type}}.")

        constraints = self.columns[column].get('constraints', [])
        if "DOIT_ETRE_POSITIF" in constraints and value < 0:
            raise ValueError(f"La valeur {{value}} doit être positive.")
        if "DOIT_ETRE_NEGATIF" in constraints and value > 0:
            raise ValueError(f"La valeur {{value}} doit être négative.")
        if "NON_NUL" in constraints and value is None:
            raise ValueError("La valeur ne peut pas être nulle.")

        return value
        

    def edit_data(self, index: int, column: str, value):
        \"\"\"Edit data at a specific index and column\"\"\"
        if column not in self.data.columns:
            raise ValueError(f"Colonne {{column}} non trouvé dans le schema de table")
        if index not in self.data.index:
            raise IndexError(f" Aucun Index {{index}} correspondant dans la table")
        value = self.validate_column_value(column, value)
        self.data.at[index, column] = value
    

    # def add_row(self, row_data: dict):
    #     \"\"\"Add a new row of data\"\"\"
    #     missing_cols = set(self.get_schema_columns()) - set(row_data.keys())
    #     for col in missing_cols:
    #         row_data[col] = None
    #     new_row = pd.DataFrame([row_data])
    #     self.data = pd.concat([self.data, new_row], ignore_index=True)


    def add_row(self, row_data: dict):
        validated_row = {{}}

        for col in self.schema["Tableau"]["colonnes"]:
            col_name = col["name"]

            if col_name in self.get_derived_columns():
                # Colonnes dérivées : Ignorées et initialisées à None
                continue
            else:
                if col_name not in row_data or row_data[col_name] is None or pd.isnull(row_data[col_name]):
                    raise ValueError(f"La colonne '{{col_name}}' doit être renseignée pour les colonnes non dérivées.")
                # Valider la valeur pour les colonnes non dérivées
                validated_row[col_name] = self.validate_column_value(col_name, row_data[col_name])
        new_row = pd.DataFrame([validated_row])
        self.data = pd.concat([self.data, new_row], ignore_index=True)

        # validated_row = {{col: self.validate_column_value(col, val) for col, val in row_data.items()}}
        # new_row = pd.DataFrame([validated_row])
        # self.data = pd.concat([self.data, new_row], ignore_index=True)

    def delete_row(self, index: int):
        \"\"\"Delete a row of data by index\"\"\"
        if index is None:
            return
        if index not in self.data.index:
            raise IndexError(f" Aucun Index {{index}}  correspondant dans la table")
        self.data = self.data.drop(index).reset_index(drop=True)

    def get_derived_columns(self) -> list:
        \"\"\"Retourne la liste des colonnes dérivées\"\"\"
        return [col for col in self.columns if self.is_derived_column(col)]

    def calculate_selected_columns(self, selected_columns: list):
        \"\"\"Calculate only the selected derived columns\"\"\"
        for col in selected_columns:
            if col in self.columns and self.is_derived_column(col):
                col_type = self.columns[col]["colonneType"]
                if "colonneIN" in col_type:
                    input_cols = [c["name"] for c in col_type["colonneIN"]]
                    if "algorithm" in col_type and col_type["algorithm"] != {{"NULL": "null"}}:
                        algo = col_type["algorithm"]
                        script_path = [item["path"] for item in algo if item["name"] == "path"][0]
                        if os.path.exists(script_path):
                            import importlib.util
                            spec = importlib.util.spec_from_file_location('custom_calculation', script_path)
                            custom_calculation = importlib.util.module_from_spec(spec)
                            spec.loader.exec_module(custom_calculation)
                            self.data[col] = custom_calculation.calcul(*[self.data[inp] for inp in input_cols])
                        else:
                            raise FileNotFoundError(f"le fichier  {{script_path}} n'a pas été trouvé")
                    else:
                        raise ValueError(f"Aucun algorithme defini pour  {{col}}")
                else:
                    raise ValueError(f"Aucune  colonne d'entree defini pour {{col}}")

"""
        return code
    

    def _generate_columns(self) -> str:
        code = "{\n"
        for col in self.columns:
            code += f"            '{col['name']}': {{'type': '{col['type']}', 'id': '{col['id']}'"
            if "contraintes" in col and col["contraintes"] != {"NULL": "null"}:
                code += f", 'constraints': {col['contraintes']}"
            if "colonneType" in col and col["colonneType"] != {"NULL": "null"}:
                code += f", 'colonneType': {col['colonneType']}"
            if "documentation" in col and col["documentation"] != {"NULL": "null"}:
                code += f", 'documentation': {col['documentation']}"
            code += "},\n"
        # if 'colonneReference' not in [col['name'] for col in self.columns]:
        #     code += f"            'colonneReference': {{'type': 'int', 'id': 'unique_index'}},\n"
        # code += "        }\n\n"
           # Ajout de la colonneReference
        if self.colonne_reference:
            code += f"            'colonneReference': {{'name': '{self.colonne_reference['name']}', 'type': '{self.colonne_reference['type']}', 'id': '{self.colonne_reference['id']}'}},\n"
        code += "        }\n\n"
    
        return code

    def _generate_constraint_checks(self) -> str:
        checks = []
        indent = " " * 8
        
        for col in self.columns:
            if col["contraintes"] == {"NULL": "null"}:
                continue
                
            col_name = col["name"]
            constraints = col["contraintes"] if isinstance(col["contraintes"], list) else []
            
            check_code = [f"{indent}# Checking constraints for {col_name}"]
            check_code.append(f"{indent}violations['{col_name}'] = []")
            
            for constraint in constraints:
                if constraint == "DOIT_ETRE_POSITIF":
                    check_code.append(f"{indent}if (self.data['{col_name}'] < 0).any():")
                    check_code.append(f"{indent}    violations['{col_name}'].append('Doit etre positif')")
                    
                elif constraint == "DOIT_ETRE_NEGATIF":
                    check_code.append(f"{indent}if (self.data['{col_name}'] > 0).any():")
                    check_code.append(f"{indent}    violations['{col_name}'].append('Doit etre negatif')")
                    
                elif constraint == "NON_NUL":
                    check_code.append(f"{indent}if self.data['{col_name}'].isnull().any():")
                    check_code.append(f"{indent}    violations['{col_name}'].append('Ne peut pas etre null')")
                    
                elif constraint == "CUSTOM":
                    if col.get("constraints") and col["constraints"] != {"NULL": "null"}:
                        for constraint_item in col["constraints"]:
                            if "path" in constraint_item:
                                script_path = constraint_item["path"]
                                check_code.append(f"{indent}# Custom constraint from {script_path}")
                                

                           

            checks.extend(check_code)
            
        return "\n".join(checks)

    def _generate_derived_calculations(self) -> str:
        calcs = []
        indent = " " * 8
        
        for col in self.columns:
            if col["colonneType"] == {"NULL": "null"}:
                continue
            
            col_type = col["colonneType"]
            if "colonneIN" in col_type:  # colonne importation algo
                col_name = col["name"]
                input_cols = [c["name"] for c in col_type["colonneIN"]]
                
                if "algorithm" in col_type and col_type["algorithm"] != {"NULL": "null"}:
                    algo = col_type["algorithm"]
                    script_path = [item["path"] for item in algo if item["name"] == "path"][0]
                    
                    calcs.append(f"{indent}# Calculer {col_name}")
                    calcs.append(f"{indent}if os.path.exists('{script_path}'):")
                    calcs.append(f"{indent}    import importlib.util")
                    calcs.append(f"{indent}    spec = importlib.util.spec_from_file_location('custom_calculation', '{script_path}')")
                    calcs.append(f"{indent}    custom_calculation = importlib.util.module_from_spec(spec)")
                    calcs.append(f"{indent}    spec.loader.exec_module(custom_calculation)")
                    calcs.append(f"{indent}    self.data['{col_name}'] = custom_calculation.calcul({', '.join([f'self.data[\"{inp}\"]' for inp in input_cols])})")
                else:
                    calcs.append(f"{indent}# Aucun algorithme défini pour {col_name}")
            
        return "\n".join(calcs)
   
    def generate_code(self) -> str:
        return self.generate_table_class()
