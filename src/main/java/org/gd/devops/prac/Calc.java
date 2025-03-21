package org.gd.devops.prac;

public class Calc {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myCalc=new Calc();
		System.out.println("Sum = "+myCalc.sum(15, 5));
		System.out.println("Difference = "+myCalc.subtract(15, 5));
	}

}
