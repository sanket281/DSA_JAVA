//Linked list function for deletion

package LinkedList;

import java.util.Scanner;

public class deletion {
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
     
        int aa = 1;
        int data;
        Scanner sc = new Scanner(System.in);
     
        while(aa==1)
        {
            System.out.println("hello");
            System.out.println("Enter element to add in Linkedlist: ");
            data = sc.nextInt();
            
          

                Node new_node = new Node(data);
                if(head==null){
                    head = new_node;
                }
                else{
                    new_node.next = head;
                    head = new_node;
                }
               System.out.println("Enter 1 if you want to add element to the list: ");
               aa = sc.nextInt();
        }

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
    public void delete(){
        Node temp = head;
        Node pot = head.next;
        int a, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to delete from the start, 2 to delete from the end, 3 to delete from specific position:  ");
        a = sc.nextInt();
        switch(a){
            case 1:
            head = head.next;
            break;
            case 2:
            while(pot.next!=null){
                temp = temp.next;
                pot = pot.next;
            }
            temp.next = null;
            break;
            case 3:
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
        deletion ll = new deletion();
        ll.creation();
        ll.traverser();
        ll.delete();
        ll.traverser();
        
    }
}
