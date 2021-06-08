package com.an.arrays;

import java.util.HashMap;

public class SeatAlex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,0,1,0,0,0,0,0,1};
		findSubArray(arr);
	}
	private static void findSubArray(int[] arr) {
		int curA = 0;
		int curB = 1;
		int distanceBetween = 0;
		HashMap<Integer[],Integer[]> hm = new HashMap<Integer[],Integer[]> ();
		for(int i=0;i<arr.length && curB < arr.length;i++) {
			if(arr[curB]==0) {
				distanceBetween++;
			} else {
				if(distanceBetween==0) {
					curA=curB;
				} else {
					hm.put(new Integer[] {curA, curB,distanceBetween},new Integer[] {arr[curA],arr[curB]});
					System.out.println("curA---"+curA);
					System.out.println("curB---"+curB);
					System.out.println("distanceBetween----"+(distanceBetween));
					System.out.println(arr[curA]+"----"+arr[curB]);
					distanceBetween=0;
					curA=curB;
				}
			}
			curB++;
		}
		if(hm.isEmpty()) {
			System.out.println("No maximum distance");
		} else {
			
		}
	}
}
