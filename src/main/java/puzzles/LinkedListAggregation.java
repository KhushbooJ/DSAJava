package main.java.puzzles;

import java.util.HashSet;

public class LinkedListAggregation {

    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(6);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(8);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = new Node(2);

        Node union = createUnion(head1, head2);
    }

    private static Node createUnion(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();
        Node unifiedList = null;
        Node tail = null;

        while(head1 != null) {
            if(!set.contains(head1.key)) {
                Node newNode = new Node(head1.key);
                set.add(head1.key);

                if(unifiedList == null) {
                    unifiedList = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }

            }
            head1 = head1.next;
        }
        return unifiedList;

    }
}

class Node {
    int key;
    Node next;

    Node(int key) {
        this.key = key;
        next = null;
    }
}
