/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class InheritanceTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Student std = new Student();
		 * 
		 * std.setId(1); std.setName("Prajjwal"); std.setAddress("Kirtipur");
		 * std.setContact("9808201266"); std.setClassname("Bsc. CSSE");
		 * std.setSchoolname("PCPS"); std.setSection("A");
		 * 
		 * System.out.println("Hello " + std.getName());
		 * System.out.println("Your ID is : " + std.getId());
		 * System.out.println("You study at " + std.getSchoolname());
		 */
		

		SuperStudent std = new SuperStudent(007, "Prajjwal Veer Basnet", "Kirtipur", "9808201266",
				"PCPS", "Bsc. CSSE", "A");
		System.out.println("Hello " + std.getName());
		System.out.println("Your ID is : " + std.getId());
		System.out.println("You study at " + std.getSchoolname());
		System.out.println(std.getClassname());
		
		
		
		
	}

}
