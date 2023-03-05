package logic;

public class OfficeWorker extends Employee {
	private String department;

	public OfficeWorker(String name, int id, String department) {
		super(name, id, 30);
		this.department = department;
	}

	@Override
	public int computeSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
