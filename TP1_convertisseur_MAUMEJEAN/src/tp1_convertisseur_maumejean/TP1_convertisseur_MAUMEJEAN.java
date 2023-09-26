/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_maumejean;

import java.util.Scanner;

/**
 *
 * @author MAUMEJEAN DENIS
 */
public class TP1_convertisseur_MAUMEJEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
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
                        double kelvin = CelciusVersKelvin(temperature);
                        System.out.println(temperature + " degre Celsius est égal à " + kelvin + " degre Kelvin.");
                        break;
                    case 2:
                        double celsius = KelvinVersCelcius(temperature);
                        System.out.println(temperature + " degre Kelvin est égal à " + celsius + " degre Celsius.");
                        break;
                    case 3:
                        double fahrenheitToCelsius = FarenheitVersCelcius(temperature);
                        System.out.println(temperature + " degre Fahrenheit est égal à " + fahrenheitToCelsius + " degre Celsius.");
                        break;
                    case 4:
                        double celsiusToFahrenheit = CelciusVersFarenheit(temperature);
                        System.out.println(temperature + " degre Celsius est égal à " + celsiusToFahrenheit + " degre Fahrenheit.");
                        break;
                    case 5:
                        double fahrenheitToKelvin = FarenheitVersKelvin(temperature);
                        System.out.println(temperature + " degre Fahrenheit est égal à " + fahrenheitToKelvin + " degre Kelvin.");
                        break;
                    case 6:
                        double kelvinToFahrenheit = KelvinVersFarenheit(temperature);
                        System.out.println(temperature + " degre Kelvin est égal à " + kelvinToFahrenheit + " degre Fahrenheit.");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }

                scanner.close();
            }

            public static double CelciusVersKelvin(double tCelcius) {
                return tCelcius + 273.15;
            }

            public static double KelvinVersCelcius(double tKelvin) {
                return tKelvin - 273.15;
            }

            public static double FarenheitVersCelcius(double tFarenheit) {
                return (tFarenheit - 32) * 5 / 9;
            }

            public static double CelciusVersFarenheit(double tCelcius) {
                return (tCelcius * 9 / 5) + 32;
            }

            public static double FarenheitVersKelvin(double tFarenheit) {
                double celsius = FarenheitVersCelcius(tFarenheit);
                return CelciusVersKelvin(celsius);
            }

            public static double KelvinVersFarenheit(double tKelvin) {
                double celsius = KelvinVersCelcius(tKelvin);
                return CelciusVersFarenheit(celsius);
            }
        }
