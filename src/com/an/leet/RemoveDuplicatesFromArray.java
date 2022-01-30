package com.an.leet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1};
		System.out.println(removeDuplicates(arr));

	}
	public static int removeDuplicates(int[] arr) {
		int index=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[index++] = arr[i+1]; 
			}
		}
		return index; //this index represents the original array length after removing duplicates
	}
}
