/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_maumejean_version_console;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class LightOff_MAUMEJEAN_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        System.out.println("Etat initial de la cellule 1 : " + cellule1);
        System.out.println("Etat initial de la cellule 2 : " + cellule2); 

        cellule1.activerCellule();
        System.out.println("Etat de la cellule 1 apres activation : "+ cellule1);
        
        cellule2.getEtat();
        System.out.println("Etat de la cellule 2 inchange est: "+ cellule2);
        
        
        GrilleDeJeu grille = new GrilleDeJeu();
        System.out.println(grille);
        grille.activerLigneDeCellules(1); // Active la première ligne
        System.out.println(grille); // Vérifiez que la ligne est activée
        grille.activerColonneDeCellules(2); // Active la deuxième colonne
        System.out.println(grille); // Vérifiez que la colonne est activée
        grille.activerDiagonaleDescendante(); // Active la diagonale descendante
        System.out.println(grille); // Vérifiez que la diagonale est activée
        grille.activerDiagonaleMontante(); // Active la diagonale montante
        System.out.println(grille); // Vérifiez que la diagonale montante est activée
        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(grille); // Vérifiez que l'une des lignes, colonnes ou diagonales est activée de manière aléatoire



    }
    
}
