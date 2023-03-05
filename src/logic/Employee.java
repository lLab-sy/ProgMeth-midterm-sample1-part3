package logic;

public abstract class Employee {
	protected String name;
	protected int id;
	protected int baseSalary;
	protected int bonus;
	
	public Employee(String name, int id, int baseSalary) {
		this.name = name;
		this.id = id;
		this.setBaseSalary(baseSalary);
		this.setBonus(0);
	}
	
	abstract public int computeSalary();
	abstract public String getDescription();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = Math.max(0, baseSalary);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = Math.max(0, bonus);
	}
}
