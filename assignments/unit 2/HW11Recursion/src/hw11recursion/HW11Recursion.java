/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
      String nombre,especie;
        int weight, w= 0;
       
        Animal animales []= new Animal [100];
        while (w<100){
            System.out.println("Ingrese la categoria del animal");
            nombre=entrada.nextLine();
            System.out.println("Ingrese la especie");
            especie= entrada.nextLine();
            System.out.println("ingrese su peso");
            weight = entrada.nextInt();
            
            if (weight>10){
                animales[w]=new Animal( nombre,especie,weight);
                w=w+1;
            }
        }
        for (int i =0; i<100; i++);
        int i = 0;
        animales[i].mostrarAnimal();