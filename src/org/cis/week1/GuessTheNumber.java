/**
 * 
 */
package org.cis.week1;
import java.util.Scanner;

/**
 * 
 */
public class GuessTheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int randomNumber = 20;
		int guessNumber = 0;
		do{
			System.out.println("Enter a number : ");
			guessNumber = sc.nextInt();
		}while (guessNumber != randomNumber);
		System.out.println(randomNumber + " is the correct number !");
		sc.close();
	}
}
