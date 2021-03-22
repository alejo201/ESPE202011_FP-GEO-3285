/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw177;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        int[] money = {320, 400, 410, 415, 418, 423, 426, 428, 433, 436, 450, 455, 460, };
        int elementToSearch;
        int resultBinary;
        int resultLinear;
        int right;
        int mid = 500;
        
        System.out.println("the value to find from the value 320");
        elementToSearch = input.nextInt();

        System.out.println("Welcome User");

        resultLinear = LinearSearch.search(money, elementToSearch);
        System.out.println(elementToSearch + " is found at index: " + resultLinear);

        right = money.length - 1;
        resultBinary = moneySearch.money(money, mid + 1, right, elementToSearch);

        System.out.println("Binary Search");
        System.out.println("Element found at index " + resultBinary);
    }
}