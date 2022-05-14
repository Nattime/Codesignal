package main;

import resources.ListNode;

public class FindMiddleElement{
    int solution(ListNode<Integer> l){
        ListNode<Integer> mid = l;
        while(l != null && l.next != null){
            l = l.next;
            mid = mid.next;
            if(l != null){
                l = l.next;
            }
        }
        return mid.value.intValue();
    }
}
