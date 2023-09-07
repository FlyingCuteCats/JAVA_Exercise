/*  Write a java program which will print to the screen the largest "clump" that appears in an array. A "clump" in an array is a sequence of 2 or more adjacent elements with the same value. The size of the array is decided by user input and the elements are also decided by user input.

For example:

    [1, 2, 2, 3, 4, 4] → 2 (Biggest Clump Size: 2)
    [1, 1, 2, 1, 1] → 2 (Biggest Clump Size: 2)
    [1, 1, 1, 1, 1] → 1 (Biggest Clump Size: 5)
    [3, 3, 3, 1, 1, 2, 4, 4, 4] → 3 (Biggest Clump Size: 3) */

import java.util.Scanner;
public Class Clumps {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int length = sc.nextInt(), count = 1, max = 1;
		int [] array = new int [length];
		for (int i = 0; i < length; i++) {
			if (array[i] == array[i - 1]) {
				count++;
			}
			else {
				max = (count > max) ? count : max;
				count = 1;
			}
		}
		System.out.println("Biggest Clump Size: " + max);
	}
}
