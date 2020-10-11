package com.an.sort;

public class SelectionSort {
	
	  public static void main(String[] args) { int[] arr = {9,8,12,1,4,3,7};
	  
	  for(int i=0;i<arr.length;i++) {
	  System.out.println("value of i outer->>>"+i+"----"+arr[i]);
	  System.out.println("-----------------"); for(int j=i+1;j<arr.length;j++) {
	  System.out.println("value of i inner->>>"+i+"----"+arr[i]);
	  System.out.println("value of j inner->>>"+j+"----"+arr[j]);
	  System.out.println("-----------------"); int temp = arr[i]; if(arr[i] >
	  arr[j]) { arr[i] = arr[j]; arr[j] = temp; } } }
	  
	  for(int i : arr) { System.out.println(i); }
	  
	  }
	 
	
}
