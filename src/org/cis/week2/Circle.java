/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class Circle implements Area{
	
	int radius;
	
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * (radius*radius);
		System.out.println("The area of the circle is : " + area);
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	
	

}
