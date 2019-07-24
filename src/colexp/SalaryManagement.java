package colexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalaryManagement {

	void displayEmployee() {
		
		List<EmployeePojo> empList = getEmployeeList();
		Iterator<EmployeePojo> iter = empList.iterator();
		while(iter.hasNext()) {
			EmployeePojo ep = iter.next();
			System.out.println(ep.getEmpName()+" "+ep.getAge()+" "+ep.getEmpId());
		}
	}
	public ArrayList<EmployeePojo> getEmployeeList(){
		
		EmployeePojo ep1 = new EmployeePojo();
		ep1.setEmpName("Anchal");
		ep1.setAge(22);
		
		EmployeePojo ep2 = new EmployeePojo();
		ep2.setEmpName("Chandler");
		ep2.setAge(24);
		
		EmployeePojo ep3 = new EmployeePojo();
		ep3.setEmpName("Joey");
		ep3.setAge(21);
		ep3.setEmpId("GL103");
		
		ArrayList<EmployeePojo> empList = new ArrayList<EmployeePojo>();
		empList.add(ep1);
		empList.add(ep2);
		empList.add(ep3);
		
		return empList;
	}
}
