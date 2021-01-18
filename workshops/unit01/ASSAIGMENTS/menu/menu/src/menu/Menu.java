/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // TODO code application logic here
    Scanner input = new Scanner (System.in);
    boolean mainLoop = true;
    int option ;
    
    do{
        System.out.println("===Calculator===");
        System.out.println("1. ->area of ​​a square ");
        System.out.println("2. ->area of ​​a area of ​​a rhomboid ");
        System.out.println("3. ->area of ​​a rectangle");
        System.out.println("4. ->Exit");
    
    System.out.println("Enter your menu option --> ");
    option = input.nextInt();
    
     switch (option){
          
         case 1:
             int addend1;
             int addend2;
             int addend3 = 0;                                               
             int mult;
             System.out.println("enter addend 1 -> ");
             addend1 = input.nextInt();
             System.out.println("enter addend 2 -> ");
             addend2 = input.nextInt();
             mult = (addend1 * addend2 );
             System.out.println(" Area of ​​a square is-->" + mult);
             break;
       
         case 2:
             int base3 ;
             int base4;
             int mult3;                                               
            
             System.out.println("enter addend 1 -> ");
             addend1 = input.nextInt();
             System.out.println("enter addend 2 -> ");
             addend2 = input.nextInt();
             mult3 = (addend1 * addend2 );
             System.out.println("area of ​​a area of ​​a rhomboid-->"+mult3);
             break;
         case 3:
             int base5;
             int base6;
             int mult4;                                               
            
             System.out.println("enter addend 1 -> ");
             addend1 = input.nextInt();
             System.out.println("enter addend 2 -> ");
             addend2 = input.nextInt();
             mult4 = (addend1 * addend2 );
             System.out.println("Area of ​​a square is-->"+mult4);
             System.out.println("area of ​​a rectangle ");
             break;
         case 4:
             System.out.println("Good Bye my friend ");
             System.exit(0);
             break;
         default:
             System.out.println("Invalid option\n\n\n");
             break;
             
             
             
     
         
     
    
    
              }
           } while (option!= 5);
        }
    
    
    
    
}
