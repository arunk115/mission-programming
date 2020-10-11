package com.an.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2] . There is one pair of color 1 and one of color 2. 
There are three odd socks left, one of each color. The number of pairs is 2.
 */
public class SocksSales {

	public static void main(String[] args) {
		int[] arr = {2,4};
		findPairsOfSocks(2,arr);
	}
	private static void findPairsOfSocks(int n,int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				Integer value = hm.get(arr[i]);
				value++;
				hm.put(arr[i], value);
			}else {
				hm.put(arr[i], 1);
			}
		}
		 Iterator itr = hm.entrySet().iterator();
		 
		 while(itr.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) itr.next();
			 int key = (int) mapElement.getKey();
			 int value = (int) mapElement.getValue();
			 
			 System.out.println(key+"----"+value/2);
			 
		 }
	}


}
