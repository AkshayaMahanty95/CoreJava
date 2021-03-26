package com.ojas.poc;

import java.util.Scanner;

public class EmployeeHighestSalary {
	// highest salary check
	public static int highestSalary(int salary[]) {
		int highSal = salary[0];
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > highSal) {
				highSal = salary[i];
			}
		}
		return highSal;
	}

	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Employee");
		try {
			int size = sc.nextInt();
			// salary input
			System.out.println("Enter Salary...");
			int salary[] = new int[size];
			for (int i = 0; i < salary.length; i++) {
				salary[i] = sc.nextInt();
			}
			System.out.println("Highest Salary: " + highestSalary(salary));
		} catch (java.util.InputMismatchException e) {
			System.out.println(e+": Please Enter a number");
		}
	}

}
