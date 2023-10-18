/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_maumejean;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class Personne {
    String nom ;
    String prenom ;
    int nbVoitures ;
    Voiture [] liste_voitures ;
            
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3];
        this.nbVoitures = (0);
    }


@Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }

    
   public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("La voiture a deja un proprietaire, ajout impossible.");
        return false;
    }
    

    if (this.nbVoitures >= 3) {
        System.out.println("La personne possede deja 3 voitures, ajout impossible.");
        return false;
    }
    
    
    voiture_a_ajouter.proprietaire = this;
    
    System.out.println("Voiture ajoutee avec succes.");
    return true;
   }
}