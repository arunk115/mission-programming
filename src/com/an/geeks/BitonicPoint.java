package com.an.geeks;

/*
 * Given an array arr of n elements which is first increasing and then may be decreasing, find the maximum element in the array.
Note: If the array is increasing then just print then last element will be the maximum value.
 */
/*
 * Input: 
	n = 9
	arr[] = {1,15,25,45,42,21,17,12,11}
	Output: 45
	Explanation: Maximum element is 45.
 */
public class BitonicPoint {
	class Solution {
	    int findMaximum(int[] arr, int n) {
	        int median = n / 2;
	        int leftPointer = arr[median-1] > arr[median] ? 0 : median;
	        int rightPointer = arr[median-1] > arr[median] ? median : n-1;
	        int maxElement = 0;
	        for(int i=leftPointer;i<=rightPointer;i++) {
	            if(arr[i] > maxElement) {
	                maxElement = arr[i];
	            }
	        }
	        return maxElement;
	    }
	}
}
