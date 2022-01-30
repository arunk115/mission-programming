package com.an.leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckParentheses {
	
	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
	  public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        Map<Character,Character> map = new HashMap<Character,Character>();
	        map.put('(',')');
	        map.put('{','}');
	        map.put('[',']');
	        for(int i=0;i<s.length();i++) {
	        	Character val = map.get(s.charAt(i));
	            if(val != null) {
	               stack.push(val); 
	            } else {
	                if(stack.empty()) {
	                    return false;
	                } else if(!stack.peek().equals(s.charAt(i))) {
	                    return false;
	                } else {
	                    stack.pop();
	                }
	            }
	        }
	        if(!stack.empty()) {
                return false;
            }
	        return true;
	    }
}
