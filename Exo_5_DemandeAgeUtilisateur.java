/*Exo5: Ecrire un programme en java qui lit l'âge d'un utilisateur et affiche s'il est majeur ou mineur*/

import java.util.Scanner;

public class Exo_5_DemandeAgeUtilisateur {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez votre âge: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Vous êtes majeur.");
            } else {
                System.out.println("Vous êtes mineur.");
            }
        }
    }
}
