/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author HP-LAPTOP-14
 */
public class BasicTax {
    
    public static float computeIVA(float basePrice, float percentageValue){
        float iva; 
        iva =basePrice * percentageValue / 100;
        return iva;
    }
}
