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
        
        
    }
    
}
