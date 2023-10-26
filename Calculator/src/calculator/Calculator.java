/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1 : Afficher les options à l'utilisateur
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // 2 : Récupérer l'opérateur saisi par l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int operateur = scanner.nextInt();

        // 3 : Faites le test de l'opérateur erroné AVANT de demander les opérandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Invalid operator. Please choose between 1 and 5.");
        } else {
            // 4 : Demander la première opérande à l'utilisateur
            System.out.println("Please enter the first number:");
            int operande1 = scanner.nextInt();

            // 5 : Demander la deuxième opérande à l'utilisateur
            System.out.println("Please enter the second number:");
            int operande2 = scanner.nextInt();

            // 6 : Calculer le résultat en fonction de l'opérateur
            int resultat = 0;
            switch (operateur) {
                case 1:
                    resultat = operande1 + operande2;
                    break;
                case 2:
                    resultat = operande1 - operande2;
                    break;
                case 3:
                    resultat = operande1 * operande2;
                    break;
                case 4:
                    resultat = operande1 / operande2;
                    break;
                case 5:
                    resultat = operande1 % operande2;
                    break;
            }

            // Étape 7 : Afficher le résultat
            System.out.println("The result is: " + resultat);
        }

        // Fermer le scanner
        scanner.close();
    }
}