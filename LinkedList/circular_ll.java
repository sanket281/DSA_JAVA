//Circular Linked list creation and deletion

package LinkedList;

import java.util.Scanner;

public class circular_ll {
        static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);
    public void creation(){
        int data, n;
        do{

            System.out.println("Enter data to add in Linked list: ");
            data = sc.nextInt();
            System.out.println("----------------------------------------------------");
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else{
                new_node.next = head;
                head = new_node;
                tail.next = head;
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
           while(temp.next != head){
              System.out.println(temp.data);
              temp = temp.next;
           } 
            System.out.println(temp.data);
        }
    }
    public void deletion(){
        int a, p;
        Node temp, pot;
        System.out.println("Enter 1 to delete from begining, 2 to delete from end, 3 to delete from specific locqtion: ");
        a = sc.nextInt();
        switch(a){
            case 1:
            head = head.next;
            tail.next = head;
            break;
            case 2:
            temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            break;
            case 3:
            temp = head;
            pot = head.next;
            System.out.println("Enter the position from where you want to delete the element: ");
            p = sc.nextInt();
            for(int i=0; i<p-2; i++){
                temp = temp.next;
                pot = pot.next;
            }
            temp.next = pot.next;
            break;
        }
    }
    public static void main(String args[]){
        circular_ll ll = new circular_ll();
        ll.creation();
        ll.traverser();
        ll.deletion();
        ll.traverser();
    }
}
