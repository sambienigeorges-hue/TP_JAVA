/*Exo8: Ecrire un programme en java qui lit deux nombres et effectue une opération arithmétique (addition, soustraction, multiplication, division) selon le choix de l'utilisateur*/
import java.util.Scanner;

public class Exo_8_Mini_Calculatrice {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre: ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choisissez une opération: +, -, *, /");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+' ->
                    result = num1 + num2;
                case '-' ->
                    result = num1 - num2;
                case '*' ->
                    result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Erreur: Division par zéro n'est pas autorisée.");
                        return;
                    }
                }
                default -> {
                    System.out.println("Opération invalide.");
                    return;
                }
            }

            System.out.println("Le résultat de " + num1 + " " + operation + " " + num2 + " est: " + result);
        }
    }
}
