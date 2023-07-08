package com.aurionpro.test;

public class PassByArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println("array value : "+arr);
		System.out.println("before incrementing : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		incrementArrayByOne(arr);
		System.out.println("after incrementing : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void incrementArrayByOne(int[] x) {
		for(int i=0; i<x.length; i++) {
			x[i]++;
		}
		
	}
}
