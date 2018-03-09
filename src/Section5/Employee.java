/** File: Employee.java
 * --------------------
 * Class definition that keeps track of the employees.
 * Included: name, tax number, job title, flag indicating
 * is employee is active, annual salary.
 * 	
 */

package Section5;

public class Employee {

/**
 * Creates a new mployee name with specified name and tax number.
 * @param name The employee name as a string.
 * @param tax The employee tax number as a string.
 */
	public Employee(String name, String tax) {
		employeeName = name;
		employeeTax = tax;
	}
	
/**
 * Get the name of this employee.
 * @return Employee name.
 */
	public String getName() {
		return employeeName;
	}
	
/**
 * Get the tax number of this employee.	
 * @return Employee tax number as a String.
 */
	public String getTax() {
		return employeeTax;
	}
	
/**
 * Set the job title for this employee.
 * @param job Job Title as a String.
 */
	public void setJobTitle(String job) {
		employeeJobTitle = job;
	}
	
/**
 * Get job title of this employee.
 * @return Return job title as a String.
 */
	public String getJobTitle() {
		return employeeJobTitle;
	}
	
/**
 * Sets if employee is active or inactive.
 * @param act
 */
	public void setActive(boolean act) {
		employeeActive = act;
	}
	
/**
 * Return info for active or inactive employee.
 * @return Active or inactive as string.
 */
	public String getActive() {
		if (employeeActive) return "ACTIVE";
			return "INACTIVE";
	}
	
/**
 * Set employee anual salary.
 * @param sal Annual salary as int.
 */
	public void setSalary(int sal) {
		employeeSalary = sal;
	}
	
/**
 * Get annual salary
 * @return Returns annual salary pf this employee as string.
 */
	public int getSalary() {
		return employeeSalary;
	}
	
/**
 * Creates a string identifying this employee.
 * @return The string used to display this employee.
 */
	public String toString() {
		return employeeName + ", " + employeeTax;
	}
	
/**
 * Private instance variables
 */
	private String employeeName;
	private String employeeTax;
	private String employeeJobTitle;
	private boolean employeeActive;
	private int employeeSalary;
	
	
}
