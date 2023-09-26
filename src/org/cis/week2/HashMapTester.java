/**
 * 
 */
package org.cis.week2;


import java.util.HashMap;
import java.util.Map.Entry;


/**
 * 
 */
public class HashMapTester {
	
	public void printValues(Student std) {
		
		System.out.println("************");
		System.out.println("UserID: " + std.getId());
		System.out.println("User Name: " + std.getName());
		System.out.println("Address: " + std.getAddress());
		System.out.println("Contact: " + std.getContact());
		System.out.println("************");
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Student> students = new HashMap<>();
		
		Student bikash = new Student();
		bikash.setId(1);
		bikash.setName("Bikash Chaudhary");
		bikash.setAddress("Basundhara");
		bikash.setClassname("Bsc. CSSE");
		bikash.setContact("9846845658");
		bikash.setSchoolname("PCPS");
		bikash.setSection("A");
		
		Student ben = new Student();
		
		ben.setId(2);
		ben.setName("Benjamin Ale");
		ben.setAddress("Budhanilkantha");
		ben.setClassname("Bsc. Multimedia");
		ben.setContact("985896038");
		ben.setSchoolname("Islington College");
		ben.setSection("C");
		
		Student sumedha = new Student();
		
		sumedha.setId(3);
		sumedha.setName("Sumedha Shakya");
		sumedha.setAddress("Patan");
		sumedha.setClassname("Bsc. Computer Science");
		sumedha.setContact("980948493");
		sumedha.setSchoolname("Softwarica College");
		sumedha.setSection("B");
		
		students.put("Bikash", bikash);
		students.put("Benjamin", ben);
		students.put("Sumedha", sumedha);
		
		HashMapTester hmt = new HashMapTester();
		
		for(Entry<String,Student>s:students.entrySet()) {
			
			Student studentclass = new Student();
			studentclass = s.getValue();
			hmt.printValues(studentclass);
			
		}
		
		

	}

}
