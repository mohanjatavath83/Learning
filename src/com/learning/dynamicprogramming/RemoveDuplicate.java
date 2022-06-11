package com.learning.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {


    public static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.val + "  ");
            head = head.next;
        }

        System.out.println();

    }

    public static ListNode deleteDuplicates(ListNode head) {



        if (head == null || head.next == null)
            return head;

        List<ListNode> list = new ArrayList<>();

        ListNode temp = head;
        ListNode ptr = null;

        while (temp != null) {
            list.add(temp);
            ptr = temp;

            while (ptr.next != null && ptr.val == ptr.next.val)
                ptr = ptr.next;

            temp = ptr.next;
            ptr.next = null;
        }

        ListNode head1 = null;
        ListNode last1 = null;

        for (ListNode first : list) {

            print(first);
            if (first.next == null) {
                if (head1 == null) {
                    head1 = first;
                    last1 = first;
                } else {
                    last1.next = first;
                    last1 = first;
                }

            }

        }

        return head1;


    }

    public static void main(String[] args) {


        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);
        n1.next.next = new ListNode(1);
        n1.next.next.next = new ListNode(2);
        n1.next.next.next.next = new ListNode(3);

        deleteDuplicates(n1);


    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val= val;

        }
    }

}
