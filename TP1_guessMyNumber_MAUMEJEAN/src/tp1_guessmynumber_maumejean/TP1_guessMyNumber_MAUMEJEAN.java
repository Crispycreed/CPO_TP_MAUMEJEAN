/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_maumejean;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP1_guessMyNumber_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        int min, max, nombreAleatoire, nombreDevine, essais = 0;

        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (0-100, nombre illimité d'essais)");
        System.out.println("2) Normal (0-100, 10 essais)");
        System.out.println("3) Difficile (0-100, 5 essais)");
        System.out.println("4) Cauchemar (0-100, 5 essais avec des indications trompeuses)");

        int choixDifficulte = scanner.nextInt();

        switch (choixDifficulte) {
            case 1:
                min = 0;
                max = 100;
                essais = 999999999;
                break;
            case 2:
                min = 0;
                max = 100;
                essais = 10;
                break;
            case 3:
                min = 0;
                max = 100;
                essais = 5;
                break;
            case 4:
                min = 0;
                max = 100;
                essais = 5;
                break;
            default:
                System.out.println("Choix de difficulte invalide. Sélectionnez une option valide.");
                return;
        }

        nombreAleatoire = generateurAleat.nextInt(max - min + 1) + min;
        System.out.println("Devinez le nombre entre " + min + " et " + max + ".");

        while (essais >= 0) {
            System.out.print("Entrez votre proposition : ");
            nombreDevine = scanner.nextInt();

            if (nombreDevine < min || nombreDevine > max) {
                System.out.println("Le nombre doit etre entre " + min + " et " + max + ".");
                continue;
            }

            essais--;

            if (nombreDevine == nombreAleatoire) {
                System.out.println("Bravo, vous avez trouve le nombre " + nombreAleatoire + " en " + (10 - essais) + " essais.");
                break;
            } else {
                if (essais == 0) {
                    System.out.println("Vous avez epuise tous vos essais. Le nombre etait " + nombreAleatoire + ".");
                    break;
                } else {
                    if (choixDifficulte == 4 && generateurAleat.nextDouble() < 0.3) {
                        System.out.println("Trop petit (mais en fait trop grand) !");
                    } else if (nombreDevine < nombreAleatoire) {
                        System.out.println("Trop petit !");
                    } else {
                        System.out.println("Trop grand !");
                    }
                    System.out.println("Il vous reste " + essais + " essais.");
                }
            }
        }

        scanner.close();
    }
}
