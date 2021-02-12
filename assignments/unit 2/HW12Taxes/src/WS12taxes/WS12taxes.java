/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package ggg;

import java.util.Scanner;

/**
 *
 * @author Kevin Toapanta
 */
public class WS12taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        System.out.println("????????????????????????????????????????");
        System.out.println("?????????????????????????????????????????");       
        System.out.println("<<<<<<<<<KEVIN TOAPANTA<<<<<<<<<<< ");
        System.out.println("?????????????????????????????????????????");
        System.out.println("?????????????????????????????????????????"); 
        
        
        
        
        
        do {
            System.out.println("?????????????????????????????????????????“");
            System.out.println("| 1.- Income tax         |");
            System.out.println("?????????????????????????????????????????");
            System.out.println("| 2.- Value added tax |");
            System.out.println("?????????????????????????????????????????");
            System.out.println("| 3.- Currency tax         |");
            System.out.println("?????????????????????????????????????????");
            System.out.println("| 0.- exit                      |");
            System.out.println(" =================================");
            System.out.print(" --------> ");
            option = input.nextInt();
            switch (option) {
                    case 1:
                    int rest;
                    float taxIncome;
                    float porcent;
                    int value;
                    System.out.println("“?????????????????????????????????????????");
                    System.out.println("|   Enter the amount to calculate   |");
                    System.out.println("?????????????????????????????????????????");
                    System.out.print(" $ ");                    
                    value = input.nextInt();
                    System.out.println(" =================================");
                    
                    taxIncome = showIncomeTax(value);
                    System.out.println(" ?????????????????????????????????????????");
                    System.out.println(" The amount to pay is -> " + taxIncome );
                    System.out.println(" ?????????????????????????????????????????"+ "\n");
                    break;
                case 2:
                    float value2;
                    float taxIVA;
                    float iva;
                    System.out.println(" ?????????????????????????????????????????");
                    System.out.println("|   Enter the value to calculate  |");
                    System.out.println("?????????????????????????????????????????");
                    System.out.print(" $ ");
                    value2 = input.nextInt();
                    System.out.println(" =================================");
                    showIVA(value2);
                    break;
                case 3:
                    float value3;
                    float taxISD;
                    System.out.println(" ?????????????????????????????????????????");
                    System.out.println("|    Enter the value to calculate   |");
                    System.out.println("?????????????????????????????????????????");
                    System.out.print(" $ ");
                    value3 = input.nextInt();
                    System.out.println(" =================================");
                    taxISD = showCurrencyOutflowTax(value3);
                    System.out.println(" The value to cancel is -> $ " + taxISD );
                    System.out.println(" ================================="+ "\n");
                    break;
            }
        } while (option != 0);
        System.out.println("???????????????“ ");
        System.out.println(" see you baby ");
        System.out.println("???????????????");
    }

    private static float showCurrencyOutflowTax(float value) {
        float tax;
        if (value > 1200) {
            tax = (float) (value * 0.05);
            return tax;
        }
        return 0;
    }

    private static void showIVA(float value) {
        float iva;
        float taxIVA;
        iva = (float) (value * 0.12);
        taxIVA = value - iva;
        System.out.println(" the iva is -> $ " + iva);
        System.out.println(" The price of the product without VAT is -> $ " + taxIVA );
        System.out.println(" ================================="+ "\n");
    }

    private static float showIncomeTax(int value) {
        int rest;
        float porcent;
        float tax;
        if (value > 11212 && value < 14285) {
            rest = (value - 11212);
            porcent = (float) (rest * 0.05);
            tax = porcent;
            return tax;
        } else {
            if (value > 14285 && value < 17854) {
                rest = (value - 14285);
                porcent = (float) (rest * 0.1);
                tax = porcent + 154;
                return tax;
            } else {
                if (value > 17854 && value < 21442) {
                    rest = (value - 17854);
                    porcent = (float) (rest * 0.12);
                    tax = porcent + 511;
                    return tax;
                } else {
                    if (value > 21442 && value < 42874) {
                        rest = value - 21442;
                        porcent = (float) (rest * 0.15);
                        tax = porcent + 941;
                        return tax;
                    } else {
                        if (value > 42874 && value < 64297) {
                            rest = value - 42874;
                            porcent = (float) (rest * 0.2);
                            tax = porcent + 4156;
                            return tax;
                        } else {
                            if (value > 64297 && value < 85729) {
                                rest = value - 64297;
                                porcent = (float) (rest * 0.25);
                                tax = porcent + 8440;
                                return tax;
                            } else {
                                if (value > 85729 && value < 114288) {
                                    rest = value - 85729;
                                    porcent = (float) (rest * 0.30);
                                    tax = porcent + 13798;
                                    return tax;
                                } else {
                                    if (value > 115140) {
                                        rest = (value - 115140);
                                        porcent = (float) (rest * 0.35);
                                        tax = porcent + 22366;
                                        return tax;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
