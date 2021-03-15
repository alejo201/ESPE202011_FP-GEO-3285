/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularity;

import Utils.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class modularClaculater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float operand1;
        float operand2;
        float result;
        
        System.out.println("-Enter two numbers-");
        Scanner input= new Scanner(System.in);
        operand1=input.nextFloat();
        operand2=input.nextFloat();
        
       
        System.out.println("---ADIDITION-----");
         result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 +"=" +result);
        
         System.out.println("---subtration-----");
         result = BasicOperation.subtracTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 +"=" +result);
        
        System.out.println("---Multiplication-----");
         result = BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 +"=" +result);
        
         System.out.println("---Divition-----");
         result = BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 +"=" +result);
        
        
        
        
    }
    
}
