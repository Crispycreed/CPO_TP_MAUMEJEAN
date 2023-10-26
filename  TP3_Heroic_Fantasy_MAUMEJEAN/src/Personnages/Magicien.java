/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class Magicien extends Personnages {
    boolean confirmer;    
    
    public Magicien (String nom, int pdv, boolean a){
        super(nom , pdv);
        confirmer=a;
        
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        if (confirmer == true){
            chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie confirme");
            return chaine_a_retourner;
        }
        else {
            chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie debutant");
            return chaine_a_retourner; 
        }
    }
}
