package com.an.sort;

//merge two ordered arrays
public class MergeSort {
	
	public static void main(String[] args) {
		 int[] arr = {2,4,1,-1,6,8,5,3,7};
		 //int[] arr = {40,19,56,23,14,81,17,32,12};
		 mergeSort(arr);
	}
	
	private static void mergeSort(int[] arr) {
		int n = arr.length;
		
		if(n<2) {
			return;
		}
		
		int mid = n/2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[n-mid];
		
		for(int i=0;i<=mid-1;i++) {
			leftArr[i] = arr[i];
		}
		for(int i=mid;i<=n-1;i++) {
			rightArr[i-mid] = arr[i];
		}
		
		for(int i : leftArr) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		for(int j : rightArr) {
			System.out.println(j);
		}
		System.out.println("-------------------------");
		mergeSort(leftArr);
		mergeSort(rightArr);
		mergeTwoArr(leftArr,rightArr,arr);
	}
	private static void mergeTwoArr(int leftArr[],int rightArr[],int arr[]) {
		int nL = leftArr.length;
		int nR = rightArr.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<nL && j < nR) {
			if(leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightArr[j];
				k++;
				j++;
			}
		}
		while(i<nL) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<nR) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		System.out.println("==============================");
		System.out.println(i+"----"+j+"----"+k);
		System.out.println("==============================");
		for(int m : arr) {
			System.out.println(m);
		}
	}
}
