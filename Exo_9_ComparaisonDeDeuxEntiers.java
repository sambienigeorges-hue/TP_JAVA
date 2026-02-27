
/* 
 Exo9: Ecrit un programme permettant à l'utilisateur de saisir deus entiers et d'afficher lequel des deux est le plus grand ou s'ils sont égaux.
 */
import java.util.Scanner;

public class Exo_9_ComparaisonDeDeuxEntiers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier entier: ");
            int num1 = scanner.nextInt();

            System.out.print("Entrez le deuxième entier: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " est plus grand que " + num2);
            } else if (num2 > num1) {
                System.out.println(num2 + " est plus grand que " + num1);
            } else {
                System.out.println("Les deux entiers sont égaux.");
            }
        }
    }
}
