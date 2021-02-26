/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfuncitions;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class HW16MatrixFuncitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
     System.out.println("           Kevin Toapanta                  ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
     System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
        
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        int A[][];
        int B[][];
        int C[][];
        
        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
       
        System.out.println("enter matrix dimension ");
        System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
         System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
        System.out.println("Row -->");
        System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
        n = input.nextInt();
        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
        System.out.println("Column -->");
        System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");
        m = input.nextInt();
        System.out.println(" ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
        System.out.println("enter values : " + n + "  row   " + m + " column ");
        System.out.println(" ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ↑ ");

        A = new int[n][m];
        readMatrixElements(n, m, A, input);

        System.out.println("enter values ​​for matrix B : " + n + " in row and  " + m + " in column");
       
        B = new int[n][m];
        
       readMatrixElementss(n, m, B, input);
        
        

        C = productTwoMatrix(n, m, A, B);
          resultOfTheMatrix(n, m, C);
        System.out.println("");
    }

    public static int[][] productTwoMatrix(int n, int m, int[][] A, int[][] B) {
        int[][] C;
        C = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void readMatrixElementss(int n, int m, int[][] B, Scanner input) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = input.nextInt();
            }
        }
    }

    public static void resultOfTheMatrix(int n, int m, int[][] C) {
        System.out.println(" the result of the matrix A + B = ");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print("\t " + C[i][j]);

            }
        }
    }

    public static void readMatrixElements(int n, int m, int[][] A, Scanner input) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = input.nextInt();
            }
        }
    }

}
