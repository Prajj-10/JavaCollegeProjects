/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class SuperStudent extends SuperPerson {
	
	String schoolname;
	String classname;
	String section;

	public SuperStudent(int id, String name, String address, String contact, String schoolname,
			String classname, String section) {
		super(id, name, address, contact);
		this.schoolname = schoolname;
		this.classname = classname;
		this.section = section;
	}
	/**
	 * @return the schoolname
	 */
	public String getSchoolname() {
		return schoolname;
	}

	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

}
