/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh19;

import java.util.Scanner;

/**
 *
 * @author Kevin Toapanta 
 */
public class WS21Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
        
        double celsius;
        double temperature = 0;
        double finalSpeed;
        double initialVelocity;
        double time;
        double aceleration = 0;
        
        
        Scanner input = new Scanner(System.in);

        boolean mainLoop = true;
        int option;

        do {
            option = readOptionfromMenu();

            switch (option) {

                
                  
                case 1:
                    System.out.println(" insert temperature in °C -> ");
                    celsius = input.nextDouble();
                    temperature = calculateTheKitchenTemperature(celsius);
                    System.out.println(" the kitchen temperature in Kelvin is " + temperature + " °k ");
                    break;
                case 2:
                    System.out.println(" valve pressure velocity -> " + " m/s ");
                    finalSpeed = input.nextFloat();
                    System.out.println(" Enter the Velocity inicial  -> " + " m/s ");
                    initialVelocity = input.nextFloat();
                    System.out.println(" Enter the time -> " + " s ");
                    time = input.nextFloat();
                    aceleration = calculateAccelerationTheGas(finalSpeed, initialVelocity, time);
                    System.out.println(" the acceleration of the gas until it reaches the kitchen is" + aceleration + " m/s^2 ");
                    break;
               
                case 3:
                    System.out.println(" thakns");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 4);

   
    }

    private static double calculateTheKitchenTemperature(double celsius
            ) {
        double temperature;

        temperature = celsius + 273.15;
       return temperature;
    }

    public static double calculateAccelerationTheGas(double finalSpeed, double initialVelocity,
            double time) {
        double aceleration;
        aceleration = (finalSpeed - initialVelocity) / time;

        return aceleration;
    }

   private static int readOptionfromMenu() {
        int option;
        Scanner input = new Scanner(System.in);
        printMenu();
        option = input.nextInt();
        return option;
    }

    private static void printMenu() {
        
        System.out.println("1. -> enter the temperature of a kitchen");
        System.out.println("2. -> calculate the speed at which the gas reaches the kitchen valve ");
        System.out.println("3. -> calcule el peso de un tanque de gas ");
        System.out.println("4. -> Exit");
        System.out.println(" Enter your menu option --> ");
    }

}   