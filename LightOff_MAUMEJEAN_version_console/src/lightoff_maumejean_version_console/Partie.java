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
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        int nbLignes = 10;
        int nbColonnes = 10;
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        int nbCoups = 0;
        grille.melangerMatriceAleatoirement(nbCoups);
    }

    public void lancerPartie() {
        while (!grille.cellulesToutesEteintes()) {
            afficherEtatGrille();
            jouerUnCoup();
            nbCoups++;
        }

        System.out.println("Bravo, vous avez éteint toutes les cellules en " + nbCoups + " coups !");
    }

    private void afficherEtatGrille() {
    }

    private void jouerUnCoup() {
    }

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.initialiserPartie();
        partie.lancerPartie();
    }
}
