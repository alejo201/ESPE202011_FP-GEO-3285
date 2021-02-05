/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.changes.the.verbs;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class WS11ChangesTheVerbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner (System.in); 
       int number1;
       int number2; 
       int multiplication; 
       int table1; 
       int tabla2; 
       char option;
       int sum; 
       float divisions; 
       int mod; 
       
do {
System.out.print("Enter the operation 1-->"); 
number1 = scanner.nextInt (); 
scanner.nextLine();
System.out.print("Enter the operator 2-->"); 
number2 = scanner.nextInt(); 
scanner.nextLine();

if ( number1 % 2 == 0 && number2 % 2 == 0 )
        {
            System.out.println( "It's even" );
        }
        else
        {
            System.out.println( "It's odd" );
        }

if(number1 % 2 == 0 && number2 % 2 == 0) {
   ShowMutiplication(number1, number2);
    
} else if (number1 % 3 == 0 && number2 % 3 == 0){
   ShowAddition(number1, number2);
  
} else if (number1 % 7 == 0 && number2 % 7 == 0){
   ShowModulo(number1, number2);

} else if (number1 % 11 == 0 && number2 % 11 == 0){
   ShowMultiplicationTable(number1, number2);

} else if (number1 % 13 == 0 && number2 % 13 == 0){
   ShowDivision(number1, number2);

   
   
   
} else{
System.out.println("the error");
}
System.out.println("retry (0) -->");
option = scanner.nextLine().charAt(0); 
    
     }while (option != 'n'); 
System.out.println("Thanks");
        
    }

    private static void ShowDivision(int Operation1, int Operation2) {
        float divisions;
        divisions = Operation1 / Operation2;
        System.out.println("The division of --> " + Operation1 + "/" + Operation2 + " = " + divisions);
    }

    private static void ShowModulo(int Operation1, int Operation2) {
        int mod;
        mod = Operation1 * Operation2;
        System.out.println("The module of -->" + Operation1 + "%" + Operation2 + "-" + mod);
    }

    private static void ShowAddition(int Operation1, int Operation2) {
        int sum;
        sum = Operation1 + Operation2;
        System.out.println("The sum of -->" + Operation1 + " + " + Operation2 + " = " + sum);
    }

    private static void ShowMutiplication(int Operation1, int Operation2) {
        int multiplication;
        multiplication =Operation1 * Operation2;
        System.out.println("The multiplication of -->" + Operation1 + "*" + Operation2 + " = " + multiplication);
    }

    private static void ShowMultiplicationTable(int Operation1, int Operation2) {
        int tablenum1;
        int tablenum2;
        for (int i = 1; i <= 12; i++) {
            tablenum1 = Operation1 * i;
            System.out.println (Operation1 + ":*" + i + " = " + tablenum1 + "\n");
            
        } System.out.println("----------------------------------");
         System.out.println("----------------------------------");
        for (int j = 1; j <= 12; j++) {
            tablenum2 = Operation2 * j;
            System.out.println(Operation2 + " * " + j + " = " + tablenum2 + "\n");
        }   }
}