package colexp;

import java.util.*;

public class ComparableEx {

	public static void main(String args[]) {
		
		SalaryManagement salaryManagement = new SalaryManagement();
		ArrayList<EmployeePojo> arrList = salaryManagement.getEmployeeList();		
		Collections.sort(arrList);
		for(EmployeePojo ep: arrList)
			System.out.println(ep.getEmpName()+" "+ep.getAge()+" "+ep.getEmpId());
	}
}
