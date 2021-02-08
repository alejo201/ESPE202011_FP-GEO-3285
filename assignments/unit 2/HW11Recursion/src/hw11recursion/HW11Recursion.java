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
            System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
            System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
            System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");  
            System.out.println(" ========= PEGAZUS =======");
            System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
            System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
            System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
            System.out.println("1. -> Perimeter of  Plot ");
            System.out.println("2. -> Area of Surface");
            System.out.println("3. -> Magnitude of an Earthquake");
            System.out.println("4. -> Tidal Range");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
         
       
           
            switch (option) {

                case 1:
                     ThePerimeterOfPlot(input);
                    break;
                
                case 2:
                    double equivalentdistances;
                    double bandwidth;
                    double area;
                    theAreaOfSurface(input);
                    break;
               
                case 3:
                    float amplitude;
                    float timevariation;
                    float magnitude;
                    magnitudeOfAnEarthquake(input);
                    break;
               
                case 4:
                    float tallheight;
                    float lowheight;
                    float amplitude1;
                    waveRange(input);
                    break;
               
                case 5:
                    System.out.println(" THANKKS  ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
        
        
    }

    private static void waveRange(Scanner input) {
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

    private static void magnitudeOfAnEarthquake(Scanner input) {
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
