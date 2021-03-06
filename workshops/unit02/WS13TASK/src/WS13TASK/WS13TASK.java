/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 * 
 */
public class WS13TASK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner data = new Scanner(System.in);
         boolean mainLoop = true;
        int option;
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");       
        System.out.println("    <<<<<<<<<KEVIN TOAPANTA<<<<<<<<<<< ");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        
        
        System.out.println("RHOMBUS AREA: ");
        System.out.println("Enter the major diagonal (cm): ");
        float majorDiagonal = data.nextInt();
        System.out.println("Enter the minor diagonal (cm): ");
        float minorDiagonal = data.nextInt();
        float rhrombusArea;
        rhrombusArea = showRhombusArea(majorDiagonal, minorDiagonal);
        System.out.println("The rhombus area is: " + rhrombusArea + " cm² \n");
        
        System.out.println("CIRCLE AREA: ");
        System.out.println("Enter radio (cm): ");
        float radio = data.nextInt();
        float circleArea;
        circleArea = showCircleArea(radio);
        System.out.println("The circle area is: " + circleArea + " cm² \n");
        
        System.out.println("CONE AREA: ");
        System.out.println("Enter radio (cm): ");
        float radio1 = data.nextInt();
        System.out.println("Enter the aperture (cm): ");
        float aperture = data.nextInt();
        float coneArea;
        coneArea = showConeArea(radio, aperture);
        System.out.println("The circle area is: " + coneArea + " cm² \n");
        
        System.out.println("POSITION FORMULA: ");
        System.out.println("Enter initial position (m): ");
        float initialPosition = data.nextInt();
        System.out.println("Enter the time (s) : ");
        float time = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration = data.nextInt();
        System.out.println("Enter initial speed (m/s): ");
        float initialSpeed = data.nextInt();
        float position;
        position = Formula(initialPosition, time, acceleration, initialSpeed);
        System.out.println("The position is: " + position + " m \n");
        
        System.out.println(" FORMULA: ");
        System.out.println("Enter mass (kg): ");
        float mass = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration1 = data.nextInt();
        float force;
        force = Formula2(mass, acceleration1);
        System.out.println("The force is: " + force + " N \n");
        
        System.out.println("KINETIC ENERGY: ");
        System.out.println("Enter mass (kg): ");
        float mass1 = data.nextInt();
        System.out.println("Enter speed (m/s): ");
        float speed = data.nextInt();
        float kineticEnergy;
        kineticEnergy = showKineticEnergyFormula(mass1, speed);
        System.out.println("The kinetic energy is: " + kineticEnergy + " J");
        
        

    }
//Area geometric figures:

    public static float showRhombusArea(float majorDiagonal, float minorDiagonal) {
        float rhrombusArea = 0.00F;
        rhrombusArea = (majorDiagonal * minorDiagonal) / 2;
        return rhrombusArea;
    }

    public static float showCircleArea(float radio) {
        float pi = 3.141592654F;
        float areaCircle = 0.00F;
        areaCircle = pi * radio * radio;
        return areaCircle;
    }

    public static float showConeArea(float radio, float aperture) {
        float pi = 3.141592654F;
        float coneArea = 0.00F;
        coneArea = pi * radio * (radio + aperture);
        return coneArea;
    }
//Physics formulas

    public static float Formula(float initialPosition, float time, float acceleration, float initialSpeed) {
        float position = 0.00F;
        position = initialPosition + initialSpeed * time + (acceleration * time * time) / 2;
        return position;
    }

    public static float Formula2(float mass, float acceleration) {
        float force = 0.00F;
        force = mass * acceleration;
        return force;
    }

    public static float showKineticEnergyFormula(float mass, float speed) {
        float kineticEnergy = 0.00F;
        kineticEnergy = (mass * speed * speed) / 2;
        return kineticEnergy;
    }

}