/**
 * 
 */
package org.cis.week1;
import java.util.Scanner;
/**
 * 
 */
public class Factorial {

	/**
	 * @param args
	 */
	int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1 && n==2)
		{
			return n;
		}
		else 
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		Factorial f = new Factorial();
		int result=f.factorial(num);
		System.out.println("The factorial of " + num + " is : " + result);
		sc.close();

	}

}
