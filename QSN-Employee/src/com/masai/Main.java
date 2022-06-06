package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loan loan=new Loan();
loan.calculateLoanAmount(new TemporaryEmployee(0, null, 0, 0));
loan.calculateLoanAmount(new PermanentEmployee(0, null, 0));
loan.calculateLoanAmount(null);
	}

}
