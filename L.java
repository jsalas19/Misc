//L-shape project
import java.util.Scanner;
import java.util.Random;
public class L{
	public static void main(final String[] args) throws Exception {
		final Scanner scnr = new Scanner(System.in);
		//final String letter = " ";

		int chances = 0;
		while (chances <= 2) {
			System.out.println("Enter a number for the size of the array (must be even to work ex: 2x2, 4x4): ");
			final int userInput = scnr.nextInt();
			if (userInput % 2 == 0) {
				final int[] x = new int[2];
				Coordinates(x, userInput);
				PrintGrid(x, userInput);
				chances = 3;
			} else if (chances < 2) {
				System.out.println("Please enter a valid number.");
				chances++;
			} else {
				System.out.println("You've used all your chances to input a valid number.");
				break;
			}
		}
		scnr.close();
	}

	/*
	 * This entire method is dedicated to getting the coordinates of the "X" from
	 * the user. It also acts as a sort of filter for valid inputs meaning the user
	 * MUST input proper coordinates.
	 */
	public static int[] Coordinates(final int[] x, final int userInput) {
		final Scanner scr = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter coordinates between " + userInput + " and " + userInput);
		boolean valid = false;
		while (valid != true) {
			System.out.println("Enter a x-coordinate for the x to be placed at:");
			x[0] = scr.nextInt();
			if (x[0] > userInput) {
				System.out.println("Please input a valid number.");
				System.out.println();
				valid = false;
			} else {
				System.out.println("Enter a y-coordinate for the x to be placed at:");
				x[1] = scr.nextInt();
				if (x[1] > userInput) {
					System.out.println("Please input a valid number and repeat step one.");
					System.out.println();
					valid = false;
				} else {
					valid = true;
				}
			}
		}
		scr.close();
		return x;
	}

	/*
	 * The following method is meant to create the grid of letter L-shapes in a
	 * 2D-array and return a 2D-array.
	 */
	public static char[][] randomGenerator(char c, final int userInput, final int[] x) {
		final Random r = new Random();
		// nees this to create L-shapes use a temp variable? maybe another for-loop?
		// maybe another method?
		final char[][] grid = new char[userInput][userInput];
		for (int i = 0; i < grid.length; i++) {
			c = (char) (r.nextInt('X' - 'A') + 'A');
			for (int j = 0; j < grid[i].length; j++) {
				if (j == x[0] - 1 && i == x[1] - 1) {
					grid[i][j] = 'X';
				} else {
					grid[i][j] = c;
				}
			}
		}

		return grid;
	}

	/*
	 * And this method is meant to print out the 2D-array with the L-shapes.
	 */
	public static void PrintGrid(final int[] x, final int userInput) {
		final char c = ' ';
		final char[][] gridArray = randomGenerator(c, userInput, x);
		
		for(int i = 0; i < gridArray.length; i++){
			for(int j = 0; j < gridArray[i].length; j++){
					System.out.print(gridArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}