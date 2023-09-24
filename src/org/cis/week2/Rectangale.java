/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class Rectangale implements Area {
	int length;
	int width;
	
	public Rectangale(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		int area = length * width;
		System.out.println("The area of the rectangle is : " + area);
		
	}
	
	
	

}
