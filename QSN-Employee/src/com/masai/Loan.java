package com.masai;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
		
			
			double result=(employeeObj.getSalary()/12);
					return result;
	
		}else if(employeeObj instanceof TemporaryEmployee) {

			
			double result=(employeeObj.getSalary()/10);
					return result;
		}else {
			return 00;
		}

		
	}
}
