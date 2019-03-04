package com.BridgeLabs.Functional;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		int n=3,i;
		double sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}
		System.out.println("nsum="+sum);
	}

}
