package com.an.leet;

public class MergeSortedLL {

	public static void main(String[] args) {
		ListNode list1 = ListNode.arrayToList(new int[] {2,4,7,9});
		ListNode list2 = ListNode.arrayToList(new int[] {1,3,4});
		ListNode.printList(list1);
		ListNode.printList(list1);
		ListNode.printList(list2);
		ListNode.printList(mergeTwoLists(list1, list2));
		int nums[] ={1,3,2};
		System.out.println(nums[nums.length-1]);
        System.out.println(nums[nums.length-2]);
	}
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(-1);
        ListNode head = mergedList;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }
        if(list1 != null) {
            while(list1 != null) {
                mergedList.next = list1;
                list1 = list1.next;
                mergedList = mergedList.next;
            }
        } 
        if(list2 != null) {
            while(list2 != null) {
                mergedList.next = list2;
                list2 = list2.next;
                mergedList = mergedList.next;
            }
        }
        head = head.next;
        return mergedList.next;
    }
}
