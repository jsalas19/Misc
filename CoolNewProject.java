import java.util.Scanner;
import java.io.*;
public class CoolNewProject {
    /*For this project I want to create a platform similar to Steam or CoolMathGames.com where users can choose
    * and interact with a few games contained in this project.
    * We start by creating the games themselves and their rules, from there we can then put them all together in
    * a list/menu area.
    * Next we create a GUI to help the user choose and interact with the games.
    * Next we make it accessible via the internet as a single-player experience and finally a multiplayer experience.
    */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String [] games = {"1. The Snake Game","2. Tic Tac Toe"};
        System.out.println("Choose from the list below");
        for (int i = 0; i < games.length; i++){
            System.out.println("\t" + games[i]);
        }
        int userChoice = scnr.nextInt();
        if (userChoice == 1){
            TicTacToe newGame = new TicTacToe();
        }
    }

    public void game(int)
}

/**The objective of this game is to get 3 in a row of "X" or "O" in a diagonal, vertical,or horizontal line
 * Rules:
 *  1. you cannot place a marker where there is already a similar or opposing marker
 *  2. you can only make a winning line with 3 of the same marker
 *  3. must stay within the 3 X 3 square*/
class TicTacToe{
    String[][] grid = new String[3][3];


    boolean Diagonal(String[][] grid){

        for (int i = 0; i < ; i++){
            if(grid[i][i].equals(grid[2][2])){

            }
        }
    }

 }