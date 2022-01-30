package com.an.leet;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("IM"));
	}

	public static int romanToInt(String s) {
		int sum = 0;
		int prevVal = 1000;
		int curVal = 0;
		for (char ch : s.toCharArray()) {
			switch (ch) {
			case 'I':
				curVal = 1;
				break;
			case 'V':
				curVal = 5;
				break;
			case 'X':
				curVal = 10;
				break;
			case 'L':
				curVal = 50;
				break;
			case 'C':
				curVal = 100;
				break;
			case 'D':
				curVal = 500;
				break;
			case 'M':
				curVal = 1000;
				break;
			}
			sum += curVal;
			if (prevVal < curVal) {
				sum -= 2 * prevVal;
			}
			prevVal = curVal;
		}
		return sum;
	}

}
