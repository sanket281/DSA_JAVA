//Doublly Linkedlist creation, insertion and deletion

package LinkedList;

import java.util.Scanner;

public class doubly_ll {
    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);

    public void creation() {
        int data, n;
        do {

            System.out.println("Enter data to add in Linked list: ");
            data = sc.nextInt();
            System.out.println("----------------------------------------------------");
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;

            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;

            }
            System.out.println("If you want to continue then type 1: ");
            n = sc.nextInt();
            System.out.println("----------------------------------------------------");
        } while (n == 1);
    }

    public void traverser() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked list does not exist");
            System.out.println("----------------------------------------------------");
        } else {
            while (temp.next != head) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void insertion() {
        int data, n, p, s;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println( "Enter 1 to add data at begining, 2 for entering at end and 3 to add at a specific position");
            p = sc.nextInt();
            System.out.println("Enter data to add in Linked list: ");
            data = sc.nextInt();
            System.out.println("----------------------------------------------------");
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {

                switch (p) {
                    case 1:
                           head.prev = new_node;
                            new_node.next = head;
                            head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;

                        break;
                    case 3:
                        System.out.println("Enter the position you want to enter the element: ");
                        s = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < s - 1; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        new_node.prev = temp1;
                        temp1.next = new_node;
                        temp1 = temp1.next;
                        temp1.prev = new_node;
                        break;

                }
            }
            System.out.println("If you want to continue then type 0: ");
            n = sc.nextInt();
            System.out.println("----------------------------------------------------");
        } while (n == 0);
    }

    public void deletion() {
        int a, p;
        Node temp, pot;
        System.out.println("Enter 1 to delete from begining, 2 to delete from end, 3 to delete from specific locqtion: ");
        a = sc.nextInt();
        switch (a) {
            case 1:
                head = head.next;
                head.prev = null;
                break;
            case 2:
                tail = tail.prev;
                tail.next = null;
                break;
            case 3:
                temp = head;
                pot = head.next;
                System.out.println("Enter the position from where you want to delete the element: ");
                p = sc.nextInt();
                for (int i = 0; i < p - 2; i++) {
                    temp = temp.next;
                    pot = pot.next;
                }
                temp.next = pot.next;
                pot.next = null;
                pot.prev = null;
                pot = temp.next;
                pot.prev = temp;

                break;
        }
    }

    public static void main(String args[]) {
        doubly_ll ll = new doubly_ll();
        // ll.creation();
        // ll.traverser();
        // ll.deletion();
        ll.insertion();
        ll.traverser();
    }
}
