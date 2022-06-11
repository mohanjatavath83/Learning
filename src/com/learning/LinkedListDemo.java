package com.learning;

public class LinkedListDemo {


    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }


        return prev;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        l1 = reverse(l1);
        l2 = reverse(l2);

        int carry = 0;
        int sum = 0;

        ListNode head = new ListNode(0);
        ListNode last = head;
        int val =0;

        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + carry;
            sum = val >= 10 ? val % 10 : val;
            carry = val / 10;
            last.next = new ListNode(sum);
            last = last.next;

            l1 = l1.next;
            l2 = l2.next;
        }


        while (l1 != null) {
            sum = l1.val + carry;
            last.next = new ListNode(sum % 10);
            last = last.next;
            carry = sum / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + carry;
            last.next = new ListNode(sum % 10);
            last = last.next;
            carry = sum / 10;
            l2 = l2.next;
        }

        head = reverse(head.next);
        print(head);

        return head;
    }

    public static void main(String[] args) {


        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);


        ListNode n2 = new ListNode(5);
        n2.next = new ListNode(6);
        n2.next.next = new ListNode(4);

        addTwoNumbers(n1, n2);


    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;

        }
    }
}
