package com.an.string;

//Check if two string reverse of each other
//e.g. "dcba" is a reverse of "abcd" but "dbac" is not.
public class TwoStringReversed {

	
	public static void main(String[] args) {
		String strOne = "dcba";
		String strTwo = "abcd";
		System.out.println(findReversed(strOne,strTwo));
	}

	private static boolean findReversed(String strOne, String strTwo) {
		boolean result = false;
		int nStrOne = strOne.length();
		int nStrTwo = strTwo.length();
		if(nStrOne != nStrTwo) {
			return result;
		}else {
			for(int i=0;i<nStrOne;i++) {
				if(strOne.charAt(i) != strTwo.charAt(nStrTwo-1-i)) {
					return result;
				}
			}
		}
		return !result;
	}

}
