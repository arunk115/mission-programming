package com.an.leet;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) { 
    	this.val = val; 
    }
    ListNode(int val, ListNode next) { 
    	this.val = val; this.next = next; 
    }
    
    public static ListNode arrayToList(int[] arr) {
    	if(arr.length > 0) {
	    	ListNode node = new ListNode(arr[0]);
	    	ListNode head = node;
	    	for(int i=1;i<arr.length;i++) {
	    		node.next = new ListNode(arr[i]);
	    		node = node.next;
	    	}
	    	return head;
    	} else {
    		return null;
    	}
    }
    
    public static void printList(ListNode list) {
    	while(list != null) {
    		System.out.print(list.val + "--->");
    		list = list.next;
    	}
    	System.out.println();
    }
}
