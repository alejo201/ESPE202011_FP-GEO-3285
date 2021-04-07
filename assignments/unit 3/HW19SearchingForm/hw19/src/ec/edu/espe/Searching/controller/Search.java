/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Searching.controller;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Search {
    public static int SearchString(String[] courses, String searchElement) {
        for (int x = 0; x < courses.length; x++) {
            if (courses[x].equals(searchElement)) {
                return x;
            }
        }
        return -1;
    }
}
    

