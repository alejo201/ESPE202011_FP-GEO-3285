/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15.correctionexam;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class ToapantakevinQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
 Scanner sn = new Scanner(System.in);
        boolean leave = false;
        int option;
        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println("           Kevin Toapanta                  ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
        
        while (!leave) {
            System.out.println("1. Suma los elementos de una matriz de 5 enteros");
            System.out.println("2. average of 3 items entered");
            System.out.println("3. the array{12,23,34,98,87,65,0}");
           
            try {
 
                System.out.println(" the options");
                option = sn.nextInt();
                   
                switch (option) {
                  
                    
                    
                    
                    case 1:
                         System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                          System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                         System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                        System.out.println("Enter the integer 1-> ");
                        int whole1= sn.nextInt();
                        System.out.println("Enter the integer 2-> ");
                        int whole2= sn.nextInt();
                        System.out.println("Enter the integer 3-> ");
                        int whole3= sn.nextInt();
                        System.out.println("Enter the integer 4-> ");
                        int whole4= sn.nextInt();
                        System.out.println("Enter the integer 5-> ");
                        int whole5= sn.nextInt();
                        
                        int sum= number(whole1,whole2,whole3,whole4,whole5);
                                                
                        System.out.println("The sum of the array is-> "+sum);
                        break;
         case 2:
                         System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
                        System.out.println("Enter the float 1-> ");
                        String n1= sn.next();
                        float float1=  Float.parseFloat(n1);
                        
                        System.out.println("Enter the float-> ");
                        String n2= sn.next();
                        float float2=  Float.parseFloat(n2);
                        System.out.println("Enter the float-> ");
                        String n3= sn.next();
                        float float3=  Float.parseFloat(n3);
                        
                        float promed= averagenumber(float1,float2,float3);
                        System.out.println("The proemd of the arrangement is-> "+promed);
        
                        break;
                    case 3:
                        System.out.println("Enter the integer to search-> ");
                        int enterob= sn.nextInt();
                        findArray(enterob);
                                             
                        
                        
                        break;
                    
                    case 4:
                        System.out.println("coming out...");
                        leave = true;
                        break;
                    
                    default:
                        System.out.println("Only numbers between 1 and 3");
                }
            } catch 
                System.out.println(e.getMessage());
                sn.next();
            }
          System.out.println(" ");
        
        }
 
    }
    static int number(int entero1,int entero2,int entero3,int entero4,int entero5)
    {
        int [] array= {entero1,entero2,entero3,entero4,entero5};
                        int sum=0;
                        for(int i=0;i<array.length;i++)
                        {
                            sum= sum+array[i];
                        }
                        return sum;
    }
    static float averagenumber(float float1,float float2,float float3)
    {
        float [] arrf= {float1,float2,float3};
                        float promed;
                        float sum1=0;
                        for(int i=0;i<arrf.length;i++)
                        {
                            sum1= sum1+arrf[i];
                            
                        }
                        promed=sum1/3;
                        return promed;
    }
    static void findArray(int enterob)
    {
        int [] arrb= {12,23,34,98,87,65,0};
                        
                        for(int i=0;i<arrb.length;i++)
                        {
                            if(arrb[i]==enterob)
                            {
                                System.out.println( EL ENTERO -> "+arrb[i]);
                                
                            }
                           
                            
                            
                        }
                        
    }
   }