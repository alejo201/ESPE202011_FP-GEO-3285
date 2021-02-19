/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

/**
 *
 * @author Kevin Toapanta
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        String[] groundTransportationMeans = {"Car", "Skate","Train","bicycle","Scooter"};

        String[] meansOfTransportByAir = {"Plane", "hot air balloon", "helicopter"};
        
        String[] meansOfTransportBySea = {"cruise", "submarine", "Boat"};
        

        System.out.println("ground Transportation Mean");
        for (String meansTransportationn : groundTransportationMeans) {
            System.out.println("ground Transportation Mean -->  " + meansTransportationn);
        }

        System.out.println("");
        System.out.println("means of transport by air");
        for (String meansTransportation : meansOfTransportByAir) {
            System.out.println("means of transport by air -->  " + meansTransportation);
        }
        System.out.println("means of transport by sea");
        for (String meansTransportationn :meansOfTransportBySea ) {
            System.out.println("ground Transportation Mean -->  " + meansTransportationn);
    }

 }
}

  

       