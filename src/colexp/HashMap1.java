package colexp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, EmployeePojo> hm =new HashMap<String, EmployeePojo>();
		hm.put("GL101", new EmployeePojo("Anchal", "1"));
		hm.put("GL102", new EmployeePojo("Apoorv", "2"));
		hm.put("GL103", new EmployeePojo("Divyam", "3"));
		
		for(Entry<String, EmployeePojo> e: hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue().getEmpName()+" "+e.getValue().getEmpId());
		}
		Iterator<Entry<String, EmployeePojo>> iter = hm.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, EmployeePojo> e = iter.next();
			System.out.println("Key: "+ e.getKey() + " Employee Name: "
							+ e.getValue().getEmpName()+" Employee ID: "
							+e.getValue().getEmpId());
		}
	}
}
