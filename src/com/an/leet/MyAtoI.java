package com.an.leet;

public class MyAtoI {

	public static void main(String[] args) {
		System.out.println(myAtoi("words and 42"));
	}

	 public static int myAtoi(String s) {
			int num = 0;
			int sign = 1;
			boolean nums = true;
			for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
	                nums = false;
	                if(num > Integer.MAX_VALUE / 10 || 
	                  (num == Integer.MAX_VALUE / 10 && 
	                   s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
	                    num = sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	                    return num;
	                }
	                num = (num * 10) + (s.charAt(i) - '0');
	            } else if (nums && s.charAt(i) == ' ') {
	                continue;
				} else if (nums && (s.charAt(i) == '-'  || s.charAt(i) == '+')) {
					nums = false;
	                sign = s.charAt(i) == '-' ? -1 : 1;
				} else {
	                break;
	            }
			}
		    num = sign * num;
			return num;
		}
}
