/** File: EmployeeUse.java
 * -----------------------
 * This program uses implementation 
 * of the employee class.
 */

package Section5;

import acm.program.*;
import Section5.Employee;

public class EmployeeUse extends ConsoleProgram {
	public void run() {
		Employee emp1 = new Employee("Ebenezer Scrooge", "161803399");
		Employee emp2 = new Employee("Jacob Marley", "271828182");
		Employee emp3 = new Employee("Bob Cratchit", "314159265");
		emp1.setJobTitle("CEO");
		emp1.setActive(true);
		emp1.setSalary(1000);
		
		println(emp1.toString() + ", " + emp1.getJobTitle() + ", " + emp1.getActive() + ", £" + emp1.getSalary());
		emp1.setSalary(emp1.getSalary() * 2);
		println(emp1.toString() + ", " + emp1.getJobTitle() + ", " + emp1.getActive() + ", £" + emp1.getSalary());
		
	}

}
