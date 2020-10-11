package com.an.string;

//Check if two string rotation of each other
//e.g. "dabc" is a rotation of "abcd" but "dbac" is not.
public class TwoStringRotated {
	public static void main(String[] args) {
		String strOne = new String("kill");
		String strTwo = new String("kill");
		System.out.println(findRotated(strOne,strTwo));
	}

	private static boolean findRotated(String strOne, String strTwo) {
		boolean result = false;
		int nStrOne = strOne.length();
		int nStrTwo = strTwo.length();
		if(nStrOne != nStrTwo) {
			return result;
		} else if(strOne.equals(strTwo)) {
			return !result;
		}
		
		else {
			char[] charSeq = strOne.toCharArray();
			
			for(int i=0;i<charSeq.length;i++) {
				char tempChar = charSeq[0];
				for(int j=0;j<charSeq.length-1;j++) {
					charSeq[j] = charSeq[j+1];
				}
				charSeq[charSeq.length-1] = tempChar;
				String strTemp = new String(charSeq);
				if(strTemp.equals(strTwo)) {
					return !result;
				}
			}
		}
		return result;
	}
}
