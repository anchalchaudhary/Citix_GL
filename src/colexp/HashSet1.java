package colexp;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String args[]) {
		EmployeePojo ep1 = new EmployeePojo();
		ep1.setEmpName("Anchal");
		ep1.setAge(22);
		
		EmployeePojo ep2 = new EmployeePojo();
		ep2.setEmpName("Chandler");
		ep2.setAge(23);
		
		EmployeePojo ep3 = new EmployeePojo();
		ep3.setEmpName("Joey");
		ep3.setAge(24);
		//ep3.setEmpId("GL103");
		
		HashSet<EmployeePojo> hs = new HashSet<EmployeePojo>();
		hs.add(ep1);
		hs.add(ep2);
		hs.add(ep3);
		System.out.println("Size: "+hs.size());
		Iterator<EmployeePojo> i=hs.iterator();  
        while(i.hasNext()) {  
        	EmployeePojo ep = i.next();
        	System.out.println(ep.getEmpName()+" "+ep.getAge()+" "+ep.getEmpId());
        	System.out.println(ep.hashCode());
        } 
	}
}
