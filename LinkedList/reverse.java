package LinkedList;

import java.util.Scanner;

public class reverse {
    Scanner sc = new Scanner(System.in);
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node temp = head;
    Node tail = head;
    public void creation(){
        int n = 0;
        do{

            System.out.println("Enter 1 to add at the begin, 2 to add at end, 3 to specific index");
            int p = sc.nextInt();
            System.out.println("Enter data to enter inb the linkedList");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            switch(p){
                case 1:
                newNode.next = head;
                head = newNode;
                break;
                case 2:
                temp = head;
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = newNode;
                break;
    
            }
            System.out.println("If you want to continue type 0: ");
            n = sc.nextInt();
        }
        while(n==0);
    }
    public void reverseList(){
       Node head2 = null;
       Node temp2 = null;
       temp = head;
       while(temp!=null){
            if(head2==null)
            {
                Node newNode = new Node(temp.data);
                head2 = newNode;
                temp2 = head2;
                temp = temp.next;
            }
            else
            {
                Node newNode = new Node(temp.data);
                head2 = newNode;
                newNode.next = temp2;
                temp2 = head2;
                temp = temp.next;
            }
       }
       temp = head;
       temp2 = head2;
       while(temp!=null)
       {
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       while(temp2!=null)
       {
           System.out.print(temp2.data + " ");
           temp2 = temp2.next;
       }

    }
    public static void main(String args[])
    {
        reverse ll  = new reverse();
        ll.creation();
        ll.reverseList();
    }
}

