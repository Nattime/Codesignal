package main;

import resources.ListNode;

public class IsListPalindrome{
    boolean solution(ListNode<Integer> l){
        if(l != null && l.next != null){
            ListNode<Integer> fast = l.next;
            ListNode<Integer> rev = l;
            l = l.next;
            rev.next = null;
            int count = 2;
            while(fast != null && fast.next != null){
                count++;
                fast = fast.next;
                if(fast.next != null){
                    count++;
                    ListNode<Integer> temp = l;
                    l = l.next;
                    temp.next = rev;
                    rev = temp;
                    fast = fast.next;
                }
            }
            // System.out.println(count + " " + rev.value + " " + l.value);
            if(count % 2 != 0){
                l = l.next;
            }
            // System.out.println(count + " " + rev.value + " " + l.value);
            while(l != null){
                if(!rev.value.equals(l.value)){
                    // System.out.println(rev.value + " " + l.value);
                    return false;
                }
                rev = rev.next;
                l = l.next;
            }
        }
        return true;
    }
}
