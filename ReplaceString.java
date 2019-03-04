package com.BridgeLabs.Functional;
import java.util.Scanner;

public class ReplaceString  {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.nextLine();
	Username(name);
	
}
		
	

 public static void Username(String name)
{
	
	if(name.length()>=3){
		System.out.print("Hello" + name + "How was your day");
	}else
	System.out.print("invalid name");
	
}

}

