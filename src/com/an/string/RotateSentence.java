package com.an.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//input = i.like.tea
//output = tea.like.i
public class RotateSentence {

	public static void main(String[] args) {
		String sentence = "i.like.the.tea.very.much";
		rotateSentence(sentence);
		
	}

	private static void rotateSentence(String sentence) {
		String[] arrStr = sentence.split("\\.");
		String finalStr = "";
		for(int i=arrStr.length-1;i>=0;i--) {
			finalStr+=arrStr[i];
			if(i!=0) {
				finalStr+=".";
			}
		}
		System.out.println(finalStr);
		
	}
}
