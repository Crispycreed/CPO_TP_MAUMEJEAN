// Maumejean Denis
// TDB1 25/09/23 
// exo 1

package exo.pkg1;

import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
nb=5;
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
}
    
}


