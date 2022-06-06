package com.masai;

public class TemporaryEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		int salary = hoursWorked * hourlyWages;
		
	}
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	

}
