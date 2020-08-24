package com.an.leet;

public class P1TwoSum {

	public static void main(String[] args) {
		int[] result = twoSum(new int[] {0,4,3,0},0);	
		for(int i : result) {
			System.out.println("i--"+i);
		}
	}
	public static int[] twoSum(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;(j<nums.length) && (i!=j);j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No Solution Found");
	}
	//using hashmap

}
