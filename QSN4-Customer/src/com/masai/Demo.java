package com.masai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Customer user=new Customer();
System.out.println("Enter the User Name");
String userName=sc.next();

if(Pattern.matches("[a-zA-z]{3,8}", userName)) {
	user.setUsername(userName);
	System.out.println("Enter the User Password:");
	
	String userPassword=sc.next();
	if(Pattern.matches("[a-zA-z\\d]{3,8}", userPassword)) {
		user.setPassword(userPassword);
		
		System.out.println("Enter the User  mobileNumber:");
		String mobileNumber=sc.next();
		if(Pattern.matches("[6789]{1}[\\d]{9}", mobileNumber)) {
			user.setMobileNumber(mobileNumber);
			
			System.out.println("Enter the User E-mail Id");
			String email=sc.next();
			
			if(Pattern.matches("[^a-zA-z\\d]", email)) {
				System.out.println("valid");
				user.setEmail(email);
				
				System.out.println(user.getUsername());
				System.out.println(user.getPassword());
				System.err.println(user.getMobileNumber());
				System.out.println(user.getEmail());
				
			}else {
				System.out.println("invalid Email");
			}
			
		}else {
			System.out.println("invalid Mobile Number");
		}
	}else{
		System.out.println("invalid Password");
	}
}else {
	System.out.println("invalid User Name");
}

	}

}
