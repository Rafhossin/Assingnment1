package com.Practice;

public class Assignment1 {
	public static void main(String[] args) {
		
		
		//Q1
		
		
		
		//Q2
		System.out.println("Q2/n");
		int n = 4;
		for(int i = 1;i <=n;i++) {
			for(int j = 1;j<=n; j++) {
				System.out.print(i);
			}System.out.println();
		}
		
		//Q3
		System.out.println("Q3");
		int n1 = 14;
		for(int i = 0;i <n1;i++) {
			for(int j = 0;j< n1; j++) {
				
				if(i==0 || j==0 || i==n1-1 || j==n1-1||
					i+j<=(n1-1)/2  || j-i>=(n1-1)/2.1 )	
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
			
	}
		
		
		//Q4
		System.out.println("Q4");
		int n2 = 14;
		for(int i = 0;i <n2;i++) {
			for(int j = 0;j< n2; j++) {
				
				if(  i==n2-1 || i==n2-2||
					 i-j>=(n2-1)/2  || i+j>=n2+(n2-1)/2.8)	
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
			
		}
		
		//Q5
		System.out.println("Q5");
		int n3 = 14;
		for(int i = 0;i <n3;i++) {
			for(int j = 0;j< n3; j++) {
				
				if(i==0 || j==0 || i==n3-1 || 
					i+j<=(n3-1)/2 || i-j>=(n3-1)/2  )	
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
			
	}
	}

}
