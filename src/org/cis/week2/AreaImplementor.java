/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class AreaImplementor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of circle
		Circle circle = new Circle(5);
		
		// object of square
		
		Square square = new Square(4);
		
		// object of rectangale
		
		Rectangale rectangale = new Rectangale(7,5);
		
		// Call the interface methods defined within each class
		
		circle.CalculateArea();
		square.CalculateArea();
		rectangale.CalculateArea();
		
		// Using interface as a proxy object 
		// This is useful and acts like as if classes are subscribed to the Area interface
		// Allows the area interface to broadcast a message to classes.
		
		Area a1 = new Circle(10);
		a1.CalculateArea();

	}

}
