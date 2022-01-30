package com.an.leet;


public class P2LLAddTwoNumbers {
	public static void main(String[] args) {
		System.out.println(13/10);
		System.out.println(13%10);
	}
	//solution
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(0);
	        ListNode p = l1,q=l2, current = dummy;
	        int carry = 0;
	        while(p!= null || q != null) {
	            int x = p != null ? p.val : 0;
	            int y = q != null ? q.val : 0;
	            int sum = x+y+carry;
	            carry = sum /10;
	            current.next = new ListNode(sum%10);
	            current = current.next;
	            if(p != null)  p = p.next;
	            if(q != null)  q = q.next;
	        }
	        if(carry > 0)
	            current.next = new ListNode(carry);
	        return dummy.next;
	    }
}
