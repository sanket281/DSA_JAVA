package Stack;
import java.util.Scanner;

class queue1{
    Scanner sc = new Scanner(System.in);
        static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node f = null;
    Node r = null;
    void enqueue(){
       System.out.println("----------------------------------------------------");
       System.out.println("Please enter the data: ");
       int data = sc.nextInt();
       Node new_node = new Node(data);
       if(f == null)
       {
          f = new_node;
          r = new_node;
       }
       else
       {
          r.next = new_node;
          r = new_node;   
       }
    }
    void dequeue(){
        if(f == null)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("Underflow: queue is empty");
        }
        else
        {
            f = f.next;
        }
    }
    void display(){
        Node temp = f;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class queue_ll {
      public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        queue1 q = new queue1();
        int l, d;
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("press 1 to PUSH");
            System.out.println("press 2 to POP");
            System.out.println("press 3 to DISPLAY");
            System.out.println("Enter your choice");
            l= sc.nextInt();
            switch(l){
                case 1:
                q.enqueue();
                break;
                case 2:
                q.dequeue();
                break;
                case 3:
                q.display();
                break;
            }
            System.out.println("----------------------------------------------------");
            System.out.println("Press 0 to go back to main menu or press any other key to exit");
            d = sc.nextInt();
        }while(d == 0);
        System.out.println("----------------------------------------------------");
        System.out.println("Exit Successfully");
    }
}
