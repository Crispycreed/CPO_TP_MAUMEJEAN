/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maumejean_version_console;

/**
 * classe qui offre des fonctionnalités pour générer, activer, éteindre et 
 * afficher l'état de ces cellules de manière structurée.
 * @author MAUMEJEAN DENIS
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

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

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    // Ajoutez ici les autres méthodes selon vos spécifications.

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbLignes; i++) {
            result.append("| ");
            for (int j = 0; j < nbColonnes; j++) {
                result.append(matriceCellules[i][j].getEtat() ? "X" : "O");
                result.append(" | ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}

