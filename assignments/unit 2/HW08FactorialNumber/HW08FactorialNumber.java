/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toapanta.kevin.q11;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial= 1;
        int number = 0;
        int stop=15;
        int product =0;
        
                do{
            
         System.out.println("enter a value to know your factorial: ");
         System.out.println("0 (zero) to exit  --> ");
         System.out.println("it is not allowed to enter values ​​greater than 16--> to exit ");
         
         Scanner input=new Scanner (System.in);
         number=input.nextInt();
         
         factorial=1;
         while(number  !=0)
         {
             factorial *=number ;
              number --;       
         }
        System.out.println("the factorial numero es "  +  factorial);
        
    }while (factorial !=0);
    number   = 0;
    System.out.println("good bye");
} 

}