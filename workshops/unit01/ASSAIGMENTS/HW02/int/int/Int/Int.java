/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Int ;



/**
 *
 * @author Kevin Toapanta 
 */
public class Int    {

    private static int  stand;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int  stand1;
   int  stand2;
   int  stand3;
   

   //¿You want to know the money collected in the 3 toll booths throughout the year ?
   
   
   stand1=24000 ; //money raised in a month
   stand2 =31235 ;//money raised in a month
   stand3 =45773 ;//money raised in a month
   
   

  System.out.println("Money raised throughout the year " + ((12*stand1+12*stand2+12*stand3)));
}
}