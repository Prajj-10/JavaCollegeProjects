/**
 * 
 */
package org.cis.week1;
import java.util.Scanner;
/**
 * 
 */
public class SearchArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits [] = new String []{"Apple", "Banana", "Mango", "Kiwi", "Watermelon"};
		Scanner sc = new Scanner(System.in);
		int found = 0;
		System.out.println("Enter a fruit's name : ");
		String userFruit = sc.nextLine();
		for(int i = 0; i<fruits.length; i++) {
			if(fruits[i].equals(userFruit)) {
				//System.out.println(userFruit + " is in the fruits array !!");
				found++;
			}
			
		}
		if(found > 0) {
			System.out.println(userFruit + " is in the fruits array !!");
		}
		else {
			System.out.println(userFruit + " is not in the fruits array.");
		}
		sc.close();

		
	}

}
