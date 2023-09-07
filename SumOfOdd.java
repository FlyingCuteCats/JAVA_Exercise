/*  Write a Java program that will:

    Create a 2D array of a size that is decided by user input - the first number being the number of rows and the second number being the number of columns.
    Allow the user to fill the array with integers of their choice.
    Print to the screen the total number of odd numbers in the array. See the sample output for the format.
    Print the sum of all of the odd numbers in the array. See the sample output for the format.

*/

import java.util.Scanner;
public class SumOfOdd {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt(), column = sc.nextInt();
		int [][] array = new int [row][column];
		int count = 0, sum = 0;
    
// calculate the number of odd numbers and their sum
		for (int [] item:array) {
			for (int value:item) {
				value = sc.nextInt(); // this does NOT assign anything to the array!
				count = (value % 2 == 0) ? count : count + 1;
				sum = (value % 2 == 0) ? sum : sum + value;
			}
		}
		System.out.println("Odd number count = " + count);
		System.out.println("Sum of odd numbers = " + sum);
	}
}
