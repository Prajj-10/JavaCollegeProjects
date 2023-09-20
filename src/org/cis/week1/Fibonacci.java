/**
 * 
 */
package org.cis.week1;
import java.util.Scanner;

/**
 * 
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int nextnum;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("How many numbers for Fibonacci? : ");
    	int n = sc.nextInt();
    	// System.out.print(n1);
    	System.out.print(n2 + " ");
    	for(int i=2;i<n;i++)
    	{
    		nextnum= n1+n2;
    		System.out.print(nextnum + " ");
    		n1=n2;
    		n2=nextnum;
    	}
    	sc.close();

	}

}
