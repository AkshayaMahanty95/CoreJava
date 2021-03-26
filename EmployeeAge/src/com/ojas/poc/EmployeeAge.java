package com.ojas.poc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeAge {
	
	
	public static void sortAge(int age[]) {
		int temp =0;
		for(int i = 0;i < age.length;i++) {
			for(int j = (i+1);j < age.length;j++) {
				if(age[i] > age[j]) {
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}//if
			}//for
		}//outerfor
		for(int x:age) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
/*		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(22);
		l.add(11);
		l.add(34);
		l.add(26);
		
		Collections.sort(l);
		System.out.println(l);
	*/	
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of Employee ");
		// try and catch block
		try {
			int empSize = sc.nextInt();
			System.out.println("Enter Age details");
			int age[] = new int[empSize];
			
			for (int i = 0; i < age.length; i++) {
			age[i] = sc.nextInt();
			
			}
			sortAge(age);
		}
		catch(InputMismatchException e) {
			System.out.println("please Enter Age only..");
		}
	}
			
}
