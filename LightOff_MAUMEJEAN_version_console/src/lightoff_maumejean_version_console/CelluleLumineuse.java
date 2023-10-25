/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maumejean_version_console;

/**
 * La classe qui va définir l'état de la cellule lumineuse 
 * @author MAUMEJEAN DENIS
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * Constructeur par défaut, initialise l'état à éteinte (false)
     */
    public CelluleLumineuse() {
        etat = false;
    }


    /**
     * Méthode pour activer la cellule en inversant son état
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * Méthode pour éteindre la cellule (la met dans l'état éteinte)
     */
    public void eteindreCellule() {
        etat = false;
    }


    /**
     * Méthode pour vérifier si la cellule est éteinte
     * @return
     */
    public boolean estEteint() {
        return !etat;
    }


    /**
     * Méthode pour obtenir l'état actuel de la cellule (true si allumée, false si éteinte)
     * @return
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * définition de la méthode toString pour afficher l'état de la cellule
     * @return
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}

