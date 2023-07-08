package com.aurionpro.test;

public class NumberCount {

	public static void main(String[] args) {
		int[] arr = {10,20,20,10,30,30,30,40};
		int i=0;
			while(i < arr.length) {
				int c = 0;
				for (int j = 0; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						c++;
					}
				}
				System.out.println(arr[i]+" : "+c);
				i++;
			}
	}
}
