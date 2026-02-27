/*Exo: Ecrire un programme de mini-calculatrice qui permet de faire des opérations simples (addition, soustraction, multiplication, division) sur deux nombres saisis par l'utilisateur. */

import java.util.Scanner;

public class Mini_cal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Saisissez le premier nombre : ");
            double num1 = sc.nextDouble();
            System.out.print("Saisissez le deuxième nombre : ");
            double num2 = sc.nextDouble();
            System.out.print("Saisissez l'opération (+, -, *, /) : ");
            char operation = sc.next().charAt(0);
            double result;

            switch (operation) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Résultat : " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Résultat : " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Résultat : " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Résultat : " + result);
                    } else {
                        System.out.println("Erreur : Division par zéro !");
                    }
                }
                default ->
                    System.out.println("Opération invalide !");
            }
        }
    }
}
