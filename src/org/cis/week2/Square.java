/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class Square implements Area{
	
	int length;
	
	public Square(int length) {
		this.length = length;
	}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		int area = length * length;
		System.out.println("The area of the square is : " + area);
		
	}

}
