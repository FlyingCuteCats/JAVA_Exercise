/* Write a Java program that prompts the user to input ten decimal point numbers into an array. 
The program should add every number entered to the previous number entered and print the calculation to the screen to 2 decimal places. 
For example: If the numbers entered are:
4.5, 5.5, 6.56, 8.56, -4.53, 9.67, 432.9, 98.56, 3.5, 6.54
the output should be (note the arrangement of the numbers):
5.5 + 4.5 = 10.0
6.56 + 5.5 = 12.06
8.56 + 6.56 = 15.12 
... */

import java.util.Scanner;
public class AddElements {
  public static void main(String[] args) {
    double [] array = new double [10];
    double sum = 0.0;
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i < 10; i++) {
      array[i] = sc.nextDouble();
      if (i > 0) {
        sum = (double)Math.round((array[i] + array[i - 1]) * 100) / 100; // this is to make sure the sum be rounded to 2 decimal places
        System.out.println(array[i] + " + " + array[i - 1] + " = " + sum);
      }
    }
  }
}
