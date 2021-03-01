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
public class ToapantaKevinQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
    int i;
        i = 0;
 System.out.println("Multiplication Tables : 1");
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
        int top=12;
        int product=0;
        int table = 12;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            switch  {
        }
        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> TABLA1");
            System.out.println("2. -> TABLA2 2");
            System.out.println("3. -> TABLA3 3");
            System.out.println("4. -> TABLA 4");
            System.out.println("5. -> TABLA 5");
            System.out.println("6. -> TABLA2 6");
            System.out.println("7. -> TABLA3 7");
            System.out.println("8. -> TABLA 8");
            System.out.println("9. -> TABLA9");
            System.out.println("10. -> TABLA 10");
            System.out.println("11. -> EXIT");
             System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
             case 1:
                    int addend1;
                    int addend2;
                    int mult;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    mult = addend1 * addend2;
                   System.out.println("1 * " + j + " = " + product);
                    break;
             
     
         
     
    
    
            