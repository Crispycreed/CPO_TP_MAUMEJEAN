/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_maumejean;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP3_Heroic_Fantasy_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arme Epee1 = new Epee ("Excalibur", 7, 5) ;
        Arme Epee2 = new Epee ("Durandal", 4, 5) ;
        
        Arme Baton1 = new Baton ("Chene", 4, 5) ;
        Arme Baton2 = new Baton ("Charme", 5, 6) ;
        
        
        ArrayList<Arme> liste = new ArrayList<Arme>();
        
        liste.add(Epee1);
        liste.add(Epee2);
        
        liste.add(Baton1);
        liste.add(Baton2);
        
        int taille = liste.size();
        System.out.println("Taille du vecteur : " + taille);
        
        for (int i = 0; i < liste.size(); i++) {
            Arme arme = liste.get(i);
            System.out.println("Arme : " + arme.getNom());
            System.out.println("Degats : " + arme.getAttaque());
            System.out.println();
        }

    }
    
}
