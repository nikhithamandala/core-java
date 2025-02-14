package com.tnsif.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s="SACHIN";  // literals
		s.concat("TENDULKAR");
		
		System.out.println(s);
		s=s.concat("TENDULKAR");
		System.out.println(s);
	}
	

}
