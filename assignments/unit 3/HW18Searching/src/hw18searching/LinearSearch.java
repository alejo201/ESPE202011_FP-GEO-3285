/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw177;

/**
 *
 * @author HP-LAPTOP-14
 */
class LinearSearch {
    
public static int search(int[] moneyy, int elementToSearch) {
        int n = moneyy.length;
        for (int i = 0; i < n; i++) {
            if (moneyy[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}
