package com.lti.demos;

public class Calculator {
	
	public String sayHello() {
		return "Hello World";
	}
	
	public int addNum(int x,int y) {
		return x+y;
	}
	
	public int subNum(int x, int y) {
		return x-y;
	}
	
	public void searchEmp(int empId)
	{
		if (empId==0)
		{
			throw new ArithmeticException("u entered zero");
		}
		else
		{
			System.out.println("do something");
		}
	}
}
