import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {

        Scanner scans = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("");

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");

        double choice = scans.nextDouble();

        if (choice == 1) {

            System.out.println("1. Enter Celsius Value");
            double choiceone = scans.nextDouble();
            System.out.println("");
            double Fahrenheit = choiceone * 9 / 5 + 32;

            System.out.println("The Converted Celcius is equal to " + Fahrenheit + " Fahrenheit");

        } else if (choice == 2) {

            System.out.println("2. Enter Fahrenheit Value");
            double choicetwo = scans.nextDouble();
            System.out.println("");
            double Celsius = (choicetwo - 32) * 5 / 9;

            System.out.println("The Converted Fahrenheit is equal to " + Celsius + " Celsius");

        } else if (choice == 3) {

            System.out.println("3. Enter Celsius Value");
            double choicetree = scans.nextDouble();
            System.out.println("");
            double Kelvin = choicetree + 273.5;

            System.out.println("The Converted Celsius is equal to " + Kelvin + " Kelvin");

        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

    }
}
