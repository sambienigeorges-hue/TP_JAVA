/*Exo6: Ecrire un programme en java qui declare 3 notes et calcule la moyenne, puis affiche "Admis" si la moyenne est supérieure ou égale à 10, sinon affiche "Ajourné"*/

public class Exo_6_CalculDeMoyenne {

    public static void main(String[] args) {
        double note1 = 12.5;
        double note2 = 8.0;
        double note3 = 15.0;

        double moyenne = (note1 + note2 + note3) / 3;

        System.out.println("La moyenne est: " + moyenne);

        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }
    }
}
