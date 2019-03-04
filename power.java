package com.BridgeLabs.Functional;

import java.util.Scanner;

public class power {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		 int i=0;
		int power=1;
		if(n<31){
		while(i<=n){
			System.out.println(i +" " +power);
			power=power*2;
			i=i+1;
		}
		
	}
		else
			System.out.println("not a valid number");

}
}