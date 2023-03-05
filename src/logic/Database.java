package logic;

import java.util.ArrayList;

public class Database {
	private static ArrayList<Employee> employees;
	
	public Database() {
		employees = new ArrayList<Employee>();
	}
	
	public Employee getEmployeeById(int id) {
		for(Employee e: employees) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	
	public Employee getEmployeeByIndex(int index) {
		return employees.get(index);
	}
	
	public boolean addEmployee(Employee e) {
		if(getEmployeeById(e.getId())==null) {
		employees.add(e);
		return true;
		}
		return false;
	}
	
	
	public boolean removeEmployeeById(int id) {
		Employee e = getEmployeeById(id);
		if(e!=null) {
			employees.remove(e);
			return true;
		}
		return false;
	}
	
	public ArrayList<String> getAllEmployeeDescriptions(){
		/* FILL CODES*/
		ArrayList<String> employeeDecriptionList = new ArrayList<String>();
		for(Employee employee: employees) {
			employeeDecriptionList.add(employee.getDescription());
		}
		return employeeDecriptionList;
	}
	
	public int calculateAllSalary() {
		/* FILL CODES*/
		int totalEmployeeSalary = 0;
		for(Employee employee: employees) {
			totalEmployeeSalary += employee.computeSalary();
		}
		return totalEmployeeSalary;
	}
	
	public int getTotalEmployeeCount() {
		return employees.size();
	}
}
