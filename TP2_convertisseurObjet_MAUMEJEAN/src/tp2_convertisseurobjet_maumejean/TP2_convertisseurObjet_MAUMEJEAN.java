/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_maumejean;

import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP2_convertisseurObjet_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Convertisseur convertion1 = new Convertisseur() ;
        
        
                Scanner scanner = new Scanner(System.in);

                System.out.println("Bonjour, saisissez une valeur :");
                double temperature = scanner.nextDouble();

                System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
                System.out.println("1) De Celcius vers Kelvin");
                System.out.println("2) De Kelvin vers Celcius");
                System.out.println("3) De Farenheit vers Celcius");
                System.out.println("4) De Celcius vers Farenheit");
                System.out.println("5) De Kelvin vers Farenheit");
                System.out.println("6) De Farenheit vers Kelvin");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        double kelvin = convertion1.CelciusVersKelvin(temperature) ;
                        System.out.println(temperature + " degre Celsius est egal a " + kelvin + " degre Kelvin.");
                        break;
                    case 2:
                        double celsius = convertion1.KelvinVersCelcius(temperature);
                        System.out.println(temperature + " degre Kelvin est egal a " + celsius + " degre Celsius.");
                        break;
                    case 3:
                        double fahrenheitToCelsius = convertion1.FarenheitVersCelcius(temperature);
                        System.out.println(temperature + " degre Fahrenheit est egal a " + fahrenheitToCelsius + " degre Celsius.");
                        break;
                    case 4:
                        double celsiusToFahrenheit = convertion1.CelciusVersFarenheit(temperature);
                        System.out.println(temperature + " degre Celsius est egal a " + celsiusToFahrenheit + " degre Fahrenheit.");
                        break;
                    case 5:
                        double fahrenheitToKelvin = convertion1.FarenheitVersKelvin(temperature);
                        System.out.println(temperature + " degre Fahrenheit est egal a " + fahrenheitToKelvin + " degre Kelvin.");
                        break;
                    case 6:
                        double kelvinToFahrenheit = convertion1.KelvinVersFarenheit(temperature);
                        System.out.println(temperature + " degre Kelvin est egal a " + kelvinToFahrenheit + " degre Fahrenheit.");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }

                scanner.close();
   

    }
    
}
