/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_maumejean;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class Epee {
    String Nom ;
    int Finesse;


    public Epee(String Nom, int Attaque) {
        this.Nom = Nom;
        this.Finesse = Finesse;

    @Override
    public String toString() {
        return "Epee{" + "Nom=" + Nom + ", Finesse=" + Finesse +"}";
    }
}