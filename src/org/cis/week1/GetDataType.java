package org.cis.week1;

public class GetDataType {

	public static void main(String[] args) {
		
		int number;
		String name;
		
		number = 5;
		name = "Rohit";
		
		System.out.println(number + " is of type" + ((Object)number).getClass().getSimpleName());
		System.out.println(name + " is of type" + ((Object)name).getClass().getSimpleName());

	}

}
