/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maumejean_version_console;
import java.util.Scanner;

/**
 * La classe Partie représente une partie du jeu LightOff en utilisant une grille de cellules lumineuses.
 * Cette classe facilite l'interaction entre le joueur et la grille, permettant de jouer au jeu LightOff.
 */
public class Partie {
    private GrilleDeJeu grille; // Référence à la grille de jeu
    private int nbCoups; // Nombre de coups joués par le joueur

    /**
     * Constructeur de la classe Partie.
     *
     * @param nbLignes     Le nombre de lignes de la grille.
     * @param nbColonnes   Le nombre de colonnes de la grille.
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
     * Initialise la partie en mélangeant la grille de jeu de manière aléatoire.
     *
     * @param nbTours Le nombre de tours de mélange.
     */
    public void initialiserPartie(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
    }

    /**
     * Lance une partie du jeu LightOff en permettant au joueur d'interagir avec la grille.
     * Le jeu continue tant que toutes les cellules ne sont pas éteintes.
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Etat actuel de la grille :");
            System.out.println(grille.toString());

            System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
            String coup = scanner.nextLine();

            if (coup.length() < 2) {
                System.out.println("Entree invalide. Utilisez un format tel que L2 (Ligne), C3 (Colonne) ou D (Diagonale).");
                return;
            }

            char action = coup.charAt(0);
            int index = Character.getNumericValue(coup.charAt(1));

            switch (action) {
                case 'L':
                    grille.activerLigneDeCellules(index);
                    break;
                case 'C':
                    grille.activerColonneDeCellules(index);
                    break;
                case 'D':
                    if (index == 0) {
                        grille.activerDiagonaleDescendante();
                    } else if (index == 1) {
                        grille.activerDiagonaleMontante();
                    } else {
                        System.out.println("Index de diagonale invalide. Utilisez 0 pour descendante ou 1 pour montante.");
                    }
                    break;
                default:
                    System.out.println("Action invalide. Utilisez L pour ligne, C pour colonne ou D pour diagonale.");
            }
            nbCoups++;
        }

        System.out.println("Toutes les cellules sont éteintes ! Nombre de coups : " + nbCoups);
    }
}
