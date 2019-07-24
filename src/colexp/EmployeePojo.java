package colexp;

import java.util.Date;

public class EmployeePojo implements Comparable<EmployeePojo> {

	private String empName;
	private String empId;
	private int age;
	private Date dob;
	
	public EmployeePojo() {
		
	}
	public EmployeePojo (String name, String empId) {
		this.empName = name;
		this.empId = empId;
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean equals(Object obj) {
		if(((EmployeePojo) obj).empName==this.empName)
			return true;
		return false;
	}
	public int hashCode() {
		System.out.println("hash code is called");
		return this.empName.hashCode();
	}
	public int compareTo(EmployeePojo ep) {
		if(age == ep.age)
			return 0;
		else if(age>ep.age)
			return 1;
		else
			return -1;
	}
}
