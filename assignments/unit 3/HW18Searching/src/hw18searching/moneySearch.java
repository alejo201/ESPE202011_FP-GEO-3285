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
class moneySearch {
    
public static int money(int[] money, int left, int right, int elementToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (money[mid] == elementToSearch) {
                return mid;
            } else if (money[mid] > elementToSearch) {
                return money(money, left, mid - 1, elementToSearch);
            }
            return money(money, mid + 1, right, elementToSearch);
        }
        return -1;
    }
}
