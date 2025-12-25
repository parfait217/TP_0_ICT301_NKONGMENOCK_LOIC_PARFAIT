# TP ICT-301 : Implémentation des principes SOLID en Java

**NKONGMENOCK LOIC PARFAIT**  
**Matricule : 23U2241**

Ce repository contient l'implémentation complète et pédagogique des **cinq principes SOLID** étudiés en cours.

Chaque principe est démontré avec :
- Le code **avant refactoring** (violation du principe)
- Le code **après refactoring** (respect du principe)
- Des fichiers `Main.java` enrichis avec affichages détaillés, explications claires et conclusions pédagogiques pour comprendre instantanément le problème et la solution
- Diagrammes UML des modèles avant/après (voir le PDF joint)

## Structure du projet
/
├── SRP/                  # Single Responsibility Principle
│   ├── Avant_Refactoring/
│   └── Apres_Refactoring/
├── OCP/                  # Open/Closed Principle
│   ├── Avant_Refactoring/
│   └── Apres_Refactoring/
├── LSP/                  # Liskov Substitution Principle
│   ├── Avant_Refactoring/
│   └── Apres_Refactoring/
├── ISP/                  # Interface Segregation Principle
│   ├── Avant_Refactoring/
│   └── Apres_Refactoring/
├── DIP/                  # Dependency Inversion Principle
│   ├── Avant_Refactoring/
│   └── Apres_Refactoring/
├── model_exemple_principe_solid_23u2241.pdf   # Tous les diagrammes UML
└── README.md             # Ce fichier
text## Comment exécuter le projet

1. **Cloner le repository**
   ```bash
   git clone https://github.com/parfait217/TP_0_ICT301_NKONGMENOCK_LOIC_PARFAIT.git
   cd TP_0_ICT301_NKONGMENOCK_LOIC_PARFAIT

Exécuter un principe (exemple avec SRP)
Pour la version avant refactoring :Bashcd SRP/Avant_Refactoring
javac *.java
java Main
Pour la version après refactoring :Bashcd ../../SRP/Apres_Refactoring
javac *.java
java Main
Répétez la même procédure pour OCP, LSP, ISP et DIP en changeant le dossier correspondant.→ Les sorties console sont très détaillées : elles expliquent le problème, les valeurs, et la solution pour chaque cas.
Consulter les diagrammes UML
Ouvrez le fichier TP_SOLID_UML_Diagrammes_NKONGMENOCK_LOIC_PARFAIT.pdf pour voir tous les modèles de classes avant et après refactoring.


Merci d'avoir pris le temps de corriger ce travail.
Joyeux Noël 🎄
Bonne et heureuse année 2026 ✨
Et surtout : bonne correction ! 🍀
NKONGMENOCK LOIC PARFAIT
