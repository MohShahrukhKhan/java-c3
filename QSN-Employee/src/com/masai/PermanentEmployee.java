package com.masai;

public class PermanentEmployee extends Employee {
private double	basicPay;

public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}





	
	
	

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double PFamount=basicPay*0.12;
		double salary = basicPay - PFamount;
	}

}
