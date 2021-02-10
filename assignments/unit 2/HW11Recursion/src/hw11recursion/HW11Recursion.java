/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
                    double number1;
                    double number2;
                    double number3;
                    double perimeter;

             do {
            theProgramCover();
            theMenu();

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
         
       
           
            switch (option) {

                case 1:
                     ThePerimeterOfPlot(input);
                    break;
                
                case 2:
                    theAreaOFSurface(input);
                    break;
               
                case 3:
                    theSeismicWave(input);
                    break;
               
                case 4:
                    waveRange(input);
                    break;
               
                case 5:
                     Goodbyemessage();
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
        
        
    }

    public static void theMenu() {
        System.out.println("option 1. -> Perimeter of  Plot ");
        System.out.println("option 2. -> Area of Surface");
        System.out.println("option 3. -> Magnitude of an Earthquake");
        System.out.println("option 4. -> Tidal Range");
        System.out.println("option 5. -> Exit");
    }

    public static void theProgramCover() {
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ========= PEGAZUS =======");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    public static void  Goodbyemessage() {
        System.out.println(" THANKKS  ");
        System.exit(0);
    }

    public static void waveRange(Scanner input) {
        float Tallheight;
        float Lowheight;
        float Amplitude1;
        WaveRange(input);
    }

    public static void theSeismicWave(Scanner input) {
        float Amplitude;
        float Variation;
        float Magnitude;
        theSeismicwave(input);
    }

    public static void theAreaOFSurface(Scanner input) {
        double Distances;
        double Bandwidth;
        double Area;
        theAreaOfSurface(input);
    }

    private static void WaveRange(Scanner input) {
        float tallheight;
        float lowheight;
        float amplitude1;
        calculateWaveRange(input);
    }

    public static void calculateWaveRange(Scanner input) {
        float tallheight;
        float lowheight;
        float amplitude1;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("   Tallheight -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        tallheight = input.nextFloat();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Lowheight -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        lowheight = input.nextFloat();
        amplitude1= tallheight - lowheight;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Tidal Range " + amplitude1);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    private static void theSeismicwave(Scanner input) {
        float amplitude;
        float timevariation;
        float magnitude;
        calculateTheSeismicWave(input);
    }

    public static void calculateTheSeismicWave(Scanner input) {
        float amplitude;
        float timevariation;
        float magnitude;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Amplitude -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        amplitude = input.nextFloat();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Time of varation -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        timevariation = input.nextFloat();
        magnitude = (float)(Math.log10(amplitude)+ 3 * Math.log10(8 * timevariation)-2.85);
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Magnitude of an Earthquake " + magnitude);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    private static void theAreaOfSurface(Scanner input) {
        double equivalentdistances;
        double bandwidth;
        double area;
        calculateTheAreaOfSurface(input);
    }

    public static void calculateTheAreaOfSurface(Scanner input) {
        double equivalentdistances;
        double bandwidth;
        double area;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Enter Equivalentdistances -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        equivalentdistances = input.nextFloat();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Enter Bandwidth -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        equivalentdistances = input.nextFloat();
        bandwidth = input.nextFloat();
        area = equivalentdistances*bandwidth ;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Area of Surface -->" + area);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    private static void  ThePerimeterOfPlot (Scanner input) {
        double number1;
        double number2;
        double number3;
        double perimeter;
        calculateThePerimeterOfPlot(input);
    }

    public static void calculateThePerimeterOfPlot(Scanner input) {
        double number1;
        double number2;
        double number3;
        double perimeter;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Enter Side1 -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        number1 = input.nextFloat();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Enter Side2 -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        number2 = input.nextFloat();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Enter Side3 -> ");
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        number3 = input.nextFloat();
        perimeter = number1 + number2 + number3;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" Perimeter of  Plot is --> " + perimeter);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }
    
}
