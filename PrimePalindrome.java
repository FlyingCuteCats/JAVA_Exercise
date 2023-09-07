// Write a java program that takes in a number N and finds the smallest palindrome prime greater than or equal to N.

import java.util.Scanner;
public class PrimePalindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		System.out.println("The next prime palindrome is " + primePalin(num));
		sc.close(); // always a good practice to end Scanner
	}

	public static int primePalin(int para) {
		while (isPrime(para) == false | isPalindrome(para) == false) {
			para++;
		}
		return para;
	}

	public static boolean isPrime(int para) {
		int ind = 1; // in case para is 3 
		while (ind * ind < para) {
			ind++;
			if (para % ind == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int para) {
		String str = Integer.toString(para);
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.chatAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
