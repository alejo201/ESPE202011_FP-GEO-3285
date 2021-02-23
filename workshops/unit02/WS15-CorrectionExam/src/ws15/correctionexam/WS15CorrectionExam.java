/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15.correctionexam;

import java.util.Scanner;

/**
 *
 * @author HP-LAPTOP-14
 */
public class WS15CorrectionExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int totalPlayers = 0;
        String[] players;
        float[] goalAverages;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("PLEASE ENTER THE AMOUNT OF PLAYERS YOU WANT TO RECORD: ");
        totalPlayers = scanner.nextInt();
        
        players = new String[totalPlayers];
        goalAverages = new float[totalPlayers];

        for (int i = 0; i < totalPlayers; i++) {
            scanner.nextLine();
            System.out.println("PLEASE ENTER THE NAME OF PLAYER #" + i + " --> ");
            players[i] = scanner.nextLine();
            System.out.println("PLEASE ENTRER " + players[i] + " GOALS AVERAGE --> ");
            goalAverages[i] = scanner.nextFloat();
        }
        
        for (int i = 0; i < totalPlayers; i++) {
            System.out.println(players[i] + " --> \t" + goalAverages[i]);

        }

    }


}