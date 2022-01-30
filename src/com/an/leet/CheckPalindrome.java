package com.an.leet;

public class CheckPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(123));

	}

	public static boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int y = 0;
		while (x > y) {
			y = y * 10 + x % 10;
			x = x / 10;
		}
		return y / 10 == x || y == x;
	}
}
