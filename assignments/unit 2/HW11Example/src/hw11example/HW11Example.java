/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11example;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW11Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
System.out.println("enter the number: ");
int number1 = leer.nextInt();
System.out.println("the factorial is "+number1+" is: "+theCalcularFactorial(number1));
    }
    public static int theCalcularFactorial(int number1){
        int theCalcularFactorial =1;
        for (int i =1; i <= number1; i++){
            theCalcularFactorial =theCalcularFactorial * i;
        }
    return theCalcularFactorial;
        
    }
}
