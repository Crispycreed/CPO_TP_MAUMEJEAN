/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_maumejean;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP2_Bieres_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        //BouteilleBiere uneBiere2 = new BouteilleBiere() ;
        //BouteilleBiere uneBiere3 = new BouteilleBiere() ;
        
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
    
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false ;
    
        //uneBiere3.nom = "Leffe";
        //uneBiere3.degreAlcool = 6.6 ;
        //uneBiere3.brasserie = "Abbaye de Leffe" ;
        
        //uneBiere.lireEtiquette();
        
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        
        BouteilleBiere uneBiere3  = new BouteilleBiere("Sampe", 8.3 ,"Mas Du Pas De Loche") ;

        System.out.println(uneBiere) ;
        
        uneBiere3.Décapsuler();
        System.out.println(uneBiere3) ;
    }
    
}
