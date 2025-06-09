import argparse
from tools import TableCodeGenerator

def generate_library(json_path):
    # Génération du code à partir du fichier JSON
    generator = TableCodeGenerator(json_path)
    generated_code = generator.generate_code()

    # Écriture du code généré dans un fichier Python
    with open("generated_table.py", "w") as f:
        f.write(generated_code)
    
    print("La librairie a été générée avec succès dans 'generated_table.py'.")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Générer la librairie de données")
    parser.add_argument("json_path", help="Chemin vers le fichier JSON de schéma")
    args = parser.parse_args()

    # Générer la librairie en utilisant le fichier JSON
    generate_library(args.json_path)
