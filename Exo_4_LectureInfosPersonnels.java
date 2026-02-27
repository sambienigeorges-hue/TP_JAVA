/*Exo4: Ecrire un programme en java qui lit les informations personnelles d'une personne (prenom, age) et affiche "Bienvenue prenom, vous avez age ans"*/
import java.util.Scanner;

public class Exo_4_LectureInfosPersonnels {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez votre prénom: ");
            String prenom = scanner.nextLine();

            System.out.print("Entrez votre âge: ");
            int age = scanner.nextInt();

            System.out.println("Bienvenue " + prenom + ", vous avez " + age + " ans.");
        }
    }
}
