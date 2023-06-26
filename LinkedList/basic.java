//Creation of simple linked list

package LinkedList;

import java.util.Scanner;

public class basic {
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
        int data, n;
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("Enter data to add in Linked list: ");
            data = sc.nextInt();
            System.out.println("----------------------------------------------------");
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
            }
            else{
                new_node.next = head;
                head = new_node;
            }
            System.out.println("If you want to continue then type 1: ");
            n = sc.nextInt();
            System.out.println("----------------------------------------------------");
        }
        while(n==1);
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
        basic ll = new basic();
        ll.creation();
        ll.traverser();
    }
}
