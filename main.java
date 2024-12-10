//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            // Menu principal
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Soustraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Puissance (^)");
            System.out.println("6. Racine carrée (√)");
            System.out.println("7. Factorielle (!)");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une opération : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1: // Addition
                    System.out.println("Résultat : " + addition(saisirNombre(), saisirNombre()));
                    break;
                case 2: // Soustraction
                    System.out.println("Résultat : " + soustraction(saisirNombre(), saisirNombre()));
                    break;
                case 3: // Multiplication
                    System.out.println("Résultat : " + multiplication(saisirNombre(), saisirNombre()));
                    break;
                case 4: // Division
                    double denominateur = saisirNombre();
                    if (denominateur == 0) {
                        System.out.println("Erreur : Division par zéro !");
                    } else {
                        System.out.println("Résultat : " + division(saisirNombre(), denominateur));
                    }
                    break;
                case 5: // Puissance
                    System.out.print("Entrez le nombre de puissance  : ");
                    double puiss = scanner.nextInt();
                    System.out.println("Résultat : " + puissance(saisirNombre(), puiss));
                    break;
                case 6: // Racine carrée
                    double nombre = saisirNombre();
                    if (nombre < 0) {
                        System.out.println("Erreur : Impossible de calculer la racine carrée d'un nombre négatif !");
                    } else {
                        System.out.println("Résultat : " + racineCarree(nombre));
                    }
                    break;
                case 7: // Factorielle
                    int entier = (int) saisirNombre();
                    if (entier < 0) {
                        System.out.println("Erreur : La factorielle d'un nombre négatif n'existe pas !");
                    } else {
                        System.out.println("Résultat : " + factorielle(entier));
                    }
                    break;
                case 8: // Quitter
                    continuer = false;
                    System.out.println("Merci d'avoir utilisé la calculatrice !");
                    break;
                default:
                    System.out.println("Erreur : Choix invalide !");
            }
        }
        scanner.close();
        }
    // Fonctions spécifiques pour chaque opération
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double soustraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
    public static double puissance(double a, double b) {
        return Math.pow(a, b);
    }
    public static double racineCarree(double a) {
        return Math.sqrt(a);
    }



}