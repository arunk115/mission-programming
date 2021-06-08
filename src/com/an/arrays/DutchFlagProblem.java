package com.an.arrays;

//segregate 0s,1s and 2s
public class DutchFlagProblem {

	public static void main(String[] args) {
		int[] arr = {0,1,0,1,2,2,2,1,0,1,2,1,0,0,0,2,1};
		segregateNumbers(arr);
	}

	private static void segregateNumbers(int[] arr) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(mid <= high) {
			int temp=0;
			switch (arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				break;
			}
		}
		for(int ele : arr) {
			System.out.println(ele);
		}
	}

}
