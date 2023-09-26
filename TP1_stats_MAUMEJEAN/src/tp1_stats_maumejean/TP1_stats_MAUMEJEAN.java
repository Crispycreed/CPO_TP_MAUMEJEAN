/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_maumejean;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP1_stats_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Créer un tableau de 6 entiers et initialiser chaque cellule à 0
        int[] tableauDeDes = new int[6];

        // Créer un objet Scanner pour la saisie au clavier
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Entrez un nombre entier m : ");
        int m = sc.nextInt();

        // Fermer le scanner
        sc.close();

        // Créer un objet Random pour générer des nombres aléatoires
        Random random = new Random();

        // Effectuer la simulation des lancers de dé
        for (int i = 0; i < m; i++) {
            int resultat = random.nextInt(6); // Générer un nombre aléatoire entre 0 et 5
            tableauDeDes[resultat]++; // Incrémenter la case correspondante du tableau
        }

        // Afficher les résultats sous forme de pourcentages
        System.out.println("Resultats des lancers de de sous forme de pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tableauDeDes[i] * 100 / m;
            System.out.println("Face " + (i) + ": " + pourcentage + "%");
        }
    }
}
