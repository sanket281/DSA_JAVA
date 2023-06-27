package Stack;
import java.util.Scanner;

class stack1{
    Scanner sc = new Scanner(System.in);
        static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(){
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if(top==null)
        {
            top = new_node;
        }
        else
        {
            new_node.next = top;
            top = new_node;
        }
    }
    void pop(){
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top = top.next;
        }
    }
    void display(){
        Node temp = top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class stack_ll {
      public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        stack1 s = new stack1();
        int l, d;
        do{
            System.out.println("press 1 to PUSH");
            System.out.println("press 2 to POP");
            System.out.println("press 3 to DISPLAY");
            System.out.println("Enter your choice");
            l= sc.nextInt();
            switch(l){
                case 1:
                s.push();
                break;
                case 2:
                s.pop();
                break;
                case 3:
                s.display();
                break;
            }
            System.out.println("Press 0 to go back to main menu or press any other key to exit");
            d = sc.nextInt();
        }while(d == 0);
        System.out.println("Exit Successfully");
    }
}
