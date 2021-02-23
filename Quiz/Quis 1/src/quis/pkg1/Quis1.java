/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis.pkg1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Quis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
         int [] candidatesOfThePresidecial;
        String [] Candidates = { "Araus ", "Guillermo Lasso", "Yakku perez","Juan Fernando Velasco ", "Gustavo Celi","Xavier Xervas"};
        float [] Percentage = { 32.7F, 19.7F, 19.3F, 1.7F, 1.1F,0.32F,15.0F};
        Scanner input = new Scanner(System.in);
        int n;
       
        System.out.println("Enter to name of Candidates --> ");
        
        
        
        
        
        n = input.nextInt();
        
        candidatesOfThePresidecial = new int [n];
       
        Percentage = new float [n];
        
        
      for (int i = 0; i < n; i++){
          System.out.print("Enter the number of candidates" + (i+1));
          candidatesOfThePresidecial[i] = input.nextInt();
      }
      
      for (int candidates : candidatesOfThePresidecial){
          System.out.println("candidatos of " + candidates);
      }
       for (int i = 0; i < n; i++){
          System.out.println(" CANDIDATES" + (i+1) + "--> " + candidatesOfThePresidecial[i]);
        
    }
    for (String Cadidates : Candidates) {
             PrintStream println = System.out.println("Candidate name -> " + Arrays.toString(Candidates));
        }
        
        for (int i = 0; i < Percentage.length ; i++) {
            System.out.println("Percentage " + (i + 1) + " -> " + Percentage[i]);
        }
}
    }
        
   