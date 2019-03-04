package com.BridgeLabs.Functional;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int y=sc.nextInt();
		if(y>999)
		if(y % 100==0){
			if(y % 400==0)
				System.out.println("it is a leap year");
			else
				System.out.println("it is not a leap year");
			
		}
		
	}

}
