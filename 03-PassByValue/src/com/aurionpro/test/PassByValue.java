package com.aurionpro.test;

public class PassByValue {

	public static void main(String[] args) {
		int no=10;
		System.out.println("before increment : "+no);
		no = incrementByOne(number);
		System.out.println("after increment : "+no;
	}
	private static int incrementByOne(int x) {
		++x;
		return x;
	}

}
