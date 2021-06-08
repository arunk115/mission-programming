package com.an.leet;

import java.util.HashSet;

public class P3LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLongestSubstring("pwwkwe");
	}

	public static int lengthOfLongestSubstring(String s) {
		int pointerOne = 0;
		int pointerTwo = 0;
		HashSet<Character> set = new HashSet<Character>();
		int max = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length;) {
			// System.out.println(i+"----"+charArray[i]);
			if (set.contains(charArray[i])) {
				set.remove(charArray[pointerOne]);
				pointerOne++;

				// System.out.println("One---"+set);
			} else {
				set.add(charArray[i]);
				// System.out.println("Two---"+set);
				pointerTwo++;
				i++;
				if (set.size() > max) {
					max = set.size();
				}
			}
		}
		return max;
	}
}
