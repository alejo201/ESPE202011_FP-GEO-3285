/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularityCalculator;

import java.util.Scanner;

public class HW17MatrixLibraries  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        int n;
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;

     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println("           Kevin Toapanta                  ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
        System.out.println("");
        System.out.println(" enter the dimension of the matrix ");

        n = input.nextInt();

        System.out.println("enter values ​​for matrix A ");

        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print("matrix A" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("enter values ​​for matrix b ");

        matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("--ROW Numbers--" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print("matrix B" + " [ " + (i + 1) + " ] [ " + (j + 1) + " ] --> ");
                matrixB[i][j] = input.nextInt();
            }
        }

        System.out.println("");
        System.out.println("------Matrix A------ ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {

                System.out.print("\t" + "[ " + matrixA[i][j] + " ] ");
            }

        }
        System.out.println("");

        System.out.println("");
        System.out.println("------Matrix B------");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {

                System.out.print("\t" + "[ " + matrixB[i][j] + " ] ");
            }

        }
        matrixC = ArrayBasicOperation.matrixAddition(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Addition ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

        matrixC = ArrayBasicOperation.matrixSubtraction(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Subtraction ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

        matrixC = ArrayBasicOperation.matrixMultiplication(n, matrixA, matrixB);
        System.out.println("");
        System.out.println("");

        System.out.println("Multiplication ");

        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + "[ " + matrixC[i][j] + " ] ");

            }
        }

    }
}