
import tkinter as tk
from tkinter import ttk
from tkinter import filedialog, messagebox, simpledialog
import pandas as pd
import argparse
import os


def import_generated_class():
    
    try:
        import generated_table
        for name, obj in generated_table.__dict__.items():
            if isinstance(obj, type):  
                return obj 
    except Exception as e:
        messagebox.showerror("Erreur", f"Erreur lors de l'importation de la classe générée : {e}")
        return None

class DataProcessorApp:
    def __init__(self, root, table_class):
        self.root = root
        self.root.title("Outil de Manipulation de Données")
        self.table = table_class()
        
        # Conteneur principal
        main_frame = tk.Frame(root)
        main_frame.pack(fill="both", expand=True)

        # Barre horizontale pour les boutons   
        self.button_bar = tk.Frame(main_frame, bg="lightgray", height=50)
        self.button_bar.pack(side="top", fill="x")

        # Contenu principal (tableau et messages)
        self.content_frame = tk.Frame(main_frame)
        self.content_frame.pack(side="top", fill="both", expand=True)
        
        # Boutons de la barre horizontale
        self.import_button = tk.Button(self.button_bar, text="Importer les données", command=self.import_data)
        self.import_button.pack(side="left", padx=10, pady=10)

        self.calculate_button = tk.Button(self.button_bar, text="Lancer le calcul automatique", state="disabled", command=self.show_calculation_options)
        self.calculate_button.pack(side="left", padx=10, pady=10)

        self.verify_button = tk.Button(self.button_bar, text="Vérifier", state="disabled", command=self.verify_data)
        self.verify_button.pack(side="left", padx=10, pady=10)

        self.visualize_button = tk.Button(self.button_bar, text="Visualiser", state="disabled", command=self.visualize_data)
        self.visualize_button.pack(side="left", padx=10, pady=10)

        self.edit_button = tk.Button(self.button_bar, text="Éditer", state="disabled", command=self.edit_data)
        self.edit_button.pack(side="left", padx=10, pady=10)

        self.add_row_button = tk.Button(self.button_bar, text="Ajouter une ligne", state="disabled", command=self.add_row)
        self.add_row_button.pack(side="left", padx=10, pady=10)

        self.delete_row_button = tk.Button(self.button_bar, text="Supprimer une ligne", state="disabled", command=self.delete_row)
        self.delete_row_button.pack(side="left", padx=10, pady=10)

        self.doc_button = tk.Button(self.button_bar, text="Consulter Documentation", command=self.select_column_for_documentation)
        self.doc_button.pack(side="left", padx=10, pady=10)

        self.info_button = tk.Button(self.button_bar, text="Consulter Infos", command=self.select_column_for_info)
        self.info_button.pack(side="left", padx=10, pady=10)

        self.export_button = tk.Button(self.button_bar, text="Exporter", state="disabled", command=self.export_data)
        self.export_button.pack(side="left", padx=10, pady=10)


        # Tableau pour afficher les données
        self.data_frame = None
        self.table_frame = tk.Frame(self.content_frame)
        self.table_frame.pack(pady=10, fill="both", expand=True)

    def select_column_for_documentation(self):
        column_name = simpledialog.askstring("Consulter Documentation", "Entrez le nom de la colonne :")
        if column_name:
            self.show_column_documentation(column_name)

    def select_column_for_info(self):
        column_name = simpledialog.askstring("Consulter Infos", "Entrez le nom de la colonne :")
        if column_name:
            self.show_column_info(column_name)


    def show_column_info(self, column_name):
        if self.data_frame is not None:
            try:
                column_info = self.table.columns.get(column_name, {})
                doc = column_info.get('documentation', 'Aucune documentation disponible.')
                col_type = column_info.get('type', 'Type inconnu')
                col_id = column_info.get('id', 'Identifiant inconnu')

                info_window = tk.Toplevel(self.root)
                info_window.title(f"Informations pour {column_name}")
                info_window.geometry("600x400")

                info_text = tk.Text(info_window, wrap="word")
                info_text.insert("1.0", f"Documentation:\n{doc}\n\nType de données: {col_type}\n\nIdentifiant: {col_id}")
                info_text.pack(expand=True, fill="both")
                info_text.config(state="disabled")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de l'affichage des informations : {e}")


    def show_column_documentation(self, column_name):
        if self.data_frame is not None:
            try:
                doc = self.table.columns[column_name].get('documentation', 'Aucune documentation disponible.')
                doc_window = tk.Toplevel(self.root)
                doc_window.title(f"Documentation pour {column_name}")
                doc_window.geometry("600x400")

                doc_text = tk.Text(doc_window, wrap="word")
                doc_text.insert("1.0", doc)
                doc_text.pack(expand=True, fill="both")
                doc_text.config(state="disabled")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de l'affichage de la documentation : {e}")

    def show_calculation_options(self):
        # je crée une nouvelle fenêtre pour les options de calcul
        self.calc_window = tk.Toplevel(self.root)
        self.calc_window.title("Sélectionner les calculs automatiques")
        self.calc_window.geometry("400x400")

        # j'ajouter des cases à cocher pour chaque colonne dérivée
        self.calc_vars = {}
        for col in self.table.get_derived_columns():
            var = tk.BooleanVar()
            chk = tk.Checkbutton(self.calc_window, text=col, variable=var)
            chk.pack(anchor="w")
            self.calc_vars[col] = var

        # j'ajoute une case à cocher pour "All"
        self.all_var = tk.BooleanVar()
        chk_all = tk.Checkbutton(self.calc_window, text="All", variable=self.all_var, command=self.calculate_derived_columns)
        chk_all.pack(anchor="w")

        # Bouton pour lancer les calculs sélectionnés
        btn_calculate = tk.Button(self.calc_window, text="Lancer", command=self.calculate_selected)
        btn_calculate.pack(pady=20)

    
    def calculate_derived_columns(self):
        if self.data_frame is not None:
            try:
                self.table.calculate_derived_columns()
                self.display_data()
                messagebox.showinfo("Succès", "Les colonnes dérivées ont été calculées.")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors du calcul des colonnes dérivées : {e}")
    

    def calculate_selected(self):
        # Récupérer les colonnes sélectionnées
        selected_columns = [col for col, var in self.calc_vars.items() if var.get()]
        if self.all_var.get():
            selected_columns = self.table.get_derived_columns()

        # Lancer les calculs pour les colonnes sélectionnées
        self.table.calculate_selected_columns(selected_columns)
        self.display_data()
        messagebox.showinfo("Calculs terminés", "Les calculs automatiques ont été effectués.")
        self.calc_window.destroy()

    def import_data(self):
        file_path = filedialog.askopenfilename(filetypes=[("CSV files", "*.csv")])
        if not file_path:
            return
        
        try:
            self.table.import_csv(file_path)
            self.data_frame = self.table.data
            self.display_data()
            # Activer les autres fonctionnalités
            self.calculate_button.config(state="normal")
            self.verify_button.config(state="normal")
            self.visualize_button.config(state="normal")
            self.edit_button.config(state="normal")
            self.add_row_button.config(state="normal")
            self.delete_row_button.config(state="normal")
            self.export_button.config(state="normal")
        except Exception as e:
            messagebox.showerror("Erreur", f"Impossible de charger le fichier CSV : {e}")

       

    def display_data(self):
        for widget in self.table_frame.winfo_children():
            widget.destroy()

        if self.data_frame is not None:
            columns = list(self.data_frame.columns)
            tree = ttk.Treeview(self.table_frame, columns=columns, show="headings")
            tree.pack(fill="both", expand=True)

            # Configurer les colonnes
            for col in columns:
                tree.heading(col, text=col)
                tree.column(col, width=100, anchor="center")
            
            # Ajouter les données
            for idx, row in self.data_frame.iterrows():
                tree.insert("", "end", values=list(row))


    def verify_data(self):
        if self.data_frame is not None:
            try:
                violations = self.table.verify_constraints()
                if any(violations.values()):
                    messagebox.showinfo("Vérification", f"Anomalies détectées : {violations}")
                else:
                    messagebox.showinfo("Vérification", "Aucune anomalie détectée.")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de la vérification des données : {e}")
    
    def visualize_data(self):
        if self.data_frame is not None:
            messagebox.showinfo("Visualisation", "Visualisation des données en cours...")

    def edit_data(self):
        if self.data_frame is not None:
            try:
                index = simpledialog.askinteger("Édition", "Entrez l'index de la ligne à éditer :")
                column = simpledialog.askstring("Édition", "Entrez le nom de la colonne à éditer :")
                value = simpledialog.askstring("Édition", "Entrez la nouvelle valeur :")
                self.table.edit_data(index, column, value)
                self.data_frame = self.table.data  # je met à jour self.data_frame
                self.display_data()
        
                messagebox.showinfo("Succès", "Les données ont été modifiées avec succès.")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de l'édition des données : {e}")

    def add_row(self):
        if self.data_frame is not None:
            try:
                row_data = {}
                for col in self.data_frame.columns:
                    # Vérifier si la colonne est dérivée
                    if not col in self.table.get_derived_columns():
                        # Demander à l'utilisateur une valeur pour les colonnes non dérivées
                        value = simpledialog.askstring("Ajouter une ligne", f"Entrez la valeur pour {col} :")
                        if value is None:  # Si l'utilisateur annule, arrêter l'ajout
                            return  
                        row_data[col] = value
                # Ajouter la ligne dans le tableau
                self.table.add_row(row_data)
                self.data_frame = self.table.data
                self.display_data()
                messagebox.showinfo("Succès", "La ligne a été ajoutée avec succès.")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de l'ajout de la ligne : {e}")


    def delete_row(self):
        if self.data_frame is not None:
            try:
                index = simpledialog.askinteger("Supprimer une ligne", "Entrez l'index de la ligne à supprimer :")
                if index is None:
                    return
                self.table.delete_row(index)
                self.data_frame = self.table.data
                self.display_data()
                messagebox.showinfo("Succès", "La ligne a été supprimée avec succès.")
            except Exception as e:
                messagebox.showerror("Erreur", f"Erreur lors de la suppression de la ligne : {e}")

    def export_data(self):
        file_path = filedialog.asksaveasfilename(defaultextension=".csv", filetypes=[("CSV files", "*.csv")])
        if not file_path:
            return
        
        try:
            self.table.export_csv(file_path)
            messagebox.showinfo("Succès", "Les données ont été exportées avec succès.")
        except Exception as e:
            messagebox.showerror("Erreur", f"Erreur lors de l'exportation des données : {e}")


if __name__ == "__main__":
   

    table_class = import_generated_class()
    
    root = tk.Tk()
    app = DataProcessorApp(root, table_class)
    root.mainloop()
