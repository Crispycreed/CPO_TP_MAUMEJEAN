/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maumejean_version_console;
import java.util.Random;

/**
 * La classe GrilleDeJeu représente une grille de cellules lumineuses.
 * Cette grille est constituée de cellules lumineuses organisées en lignes 
 * et colonnes.
 * classe qui offre des fonctionnalités pour générer, activer, éteindre et 
 * afficher l'état de ces cellules de manière structurée.
 * @author MAUMEJEAN DENIS
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur de la classe GrilleDeJeu.
     *
     * @param p_nbLignes     Le nombre de lignes de la grille.
     * @param p_nbColonnes   Le nombre de colonnes de la grille.
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    
  
    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale de cellules.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choice = random.nextInt(3); // Generates a random number between 0 and 2

        switch (choice) {
            case 0:
                // Activate a random row
                int randomRow = random.nextInt(nbLignes);
                activerLigneDeCellules(randomRow);
                break;
            case 1:
                // Activate a random column
                int randomCol = random.nextInt(nbColonnes);
                activerColonneDeCellules(randomCol);
                break;
            case 2:
                // Activate a random diagonal
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
            default:
                // This should not happen, but you can handle it if needed.
                break;
        }
    }
    
    
    
    /**
     * permet de générer un plateau de cellules lumineuses de manière aléatoire 
     * à partir d’un nombre spécifié de tours
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++) activerLigneColonneOuDiagonaleAleatoire();
    }
    
    
    /**
    * Active toutes les cellules d'une ligne spécifique de la grille.
    * @param idLigne Le numéro de la ligne à activer.
    */
    public void activerLigneDeCellules(int idLigne) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            matriceCellules[idLigne][colonne].activerCellule();
        }
    }

    /**
     * Active toutes les cellules d'une colonne spécifique de la grille.
    * @param idColonne Le numéro de la colonne à activer.
    */
    public void activerColonneDeCellules(int idColonne) {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            matriceCellules[ligne][idColonne].activerCellule();
        }
    }
    
    
    /**
    * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
    */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
    * Active la diagonale montante de la grille en allumant les cellules correspondantes.
    */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }
    
    
    /**
    * Vérifie si toutes les cellules de la grille sont éteintes.
    *
    * @return true si toutes les cellules sont éteintes, false sinon.
    */
    public boolean cellulesToutesEteintes() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                if (matriceCellules[ligne][colonne].estEteint()) {
                    return true; // Si aucune cellule n'est allumée, retourne true
                }
            }
        }
        return false; // Si au moins une cellule est allumée, retourne false
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                sb.append(matriceCellules[i][j].getEtat() ? "X" : "O").append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}