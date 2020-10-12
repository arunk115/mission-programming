package com.an.arrays;

//Input - [-4,-1,0,3,10]
//Output - [0,1,9,16,100]
//square each number and sort in ascending order
public class SquareAndDescend {

	public static void main(String[] args) {
		int[] arr = {-9,-2,-1,0,1,2,10};
		findSquareAndDescend(arr);
	}

	private static void findSquareAndDescend(int[] arr) {
		int[] finalArr=new int[arr.length];
		
		int i=0;
		int j=0;
		int k = finalArr.length-1;
		
		for(;i<arr.length;) {
			int leftPtr = arr[i]*arr[i];
			int rightPtr = arr[arr.length-1-j]*arr[arr.length-1-j];
			if(leftPtr < rightPtr) {
				finalArr[k]=rightPtr;
				j++;
				k--;
			}
			else {
				finalArr[k]=leftPtr;
				i++;
				k--;
			}
			if(k==0) {
				break;
			}
		}
		
//		for(int data : finalArr) {
//			System.out.println(data);
//		}
	}

}
