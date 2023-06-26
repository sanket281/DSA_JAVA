//linkedlist function for insertion

package LinkedList;

import java.util.Scanner;

public class insertion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void creation(){
        int data, n, p, s;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter 1 to add data at begining, 2 for entering at end and 3 to add at a specific position");
            p = sc.nextInt();
            System.out.println("Enter data to add in Linked list: ");
            data = sc.nextInt();
            System.out.println("----------------------------------------------------");
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
            }
            else{
                
                switch(p){
                    case 1:
                    new_node.next = head;
                    head = new_node;
                    break;
                    case 2:
                    Node temp = head;
                    while(temp.next!=null){
                        temp = temp.next;
                    }
                    temp.next = new_node;
                    break;
                    case 3:
                    System.out.println("Enter the position you want to enter the element: ");
                    s = sc.nextInt();
                    Node temp1 = head;
                    for(int i = 0; i<s-1; i++){
                        temp1 = temp1.next;
                    }
                    new_node.next = temp1.next;
                    temp1.next = new_node;
                    break;


                }
            }
            System.out.println("If you want to continue then type 0: ");
            n = sc.nextInt();
            System.out.println("----------------------------------------------------");
        }
        while(n==0);
    }
    public void traverser(){
        Node temp = head;
        if(temp == null){
          System.out.println("Linked list does not exist");
          System.out.println("----------------------------------------------------");
        }
        else{
           while(temp != null){
              System.out.println(temp.data);
              temp = temp.next;
           } 
        }
    }
    public static void main(String args[]){
        insertion ll = new insertion();
        ll.creation();
        ll.traverser();
    }
}
