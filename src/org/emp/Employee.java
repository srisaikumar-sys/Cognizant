package org.emp;

import java.util.Scanner;

public class Employee {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		System.out.println("Having Voter ID:");
		boolean ID=s.nextBoolean();
		

		if(age>18) {
			if(ID==true){
				
				System.out.println("You are Eligible for Vote");	
			}else
			{
				System.out.println("Please bring Voter ID");
			}
			
			
		}else
		{
		System.out.println("Not eligible to vote");	
		}
		System.out.println(1234);
		System.out.println(1234);
		System.out.println(1234);
		System.out.println(1234);
		System.out.println(1234);

	}
	
	
	
		
	}

