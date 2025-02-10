package com.tnsif.exceptionhandling;

public class Division {
	public static void divide() {
	int a=6 , b=0 , c;
	try {
		System.out.println("helloooo");
		c=a/b;
		System.out.println("division "+c);
	}
	catch(ArrayIndexOutofBoundException e) {
		System.out.println("exception caught "+ d.getMessage());
	}
	catch(IndexOutofBoundException d) 
	{
		System.out.println("exception caught "+ d.getMessage());
	}
	catch(Exception j)
	{
		System.out.println("j.getMessage())";
	}
	}
	}
