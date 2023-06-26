package Stack;

import java.util.Scanner;

class stack{
    int top = -1;
    int n=10;
    int a[] = new int[n];
    Scanner sc = new Scanner(System.in);
    void push(){
        if(top == (n-1))
        {
            System.out.println("Overflow: Stack is full");
        }
        else
        {
            System.out.println("Enter data to enter in stack: ");
            int p = sc.nextInt();
            top = top+1;
            a[top] = p;
            System.out.println("item inserted");
        }
    }
    void pop(){
        if(top == -1)
        {
            System.out.println("Underflow: Stack is empty");
        }
        else
        {

            top = top - 1;
            System.out.println("item deleted");
        }
    }
    void display(){
       System.out.println("items are: ");
       for(int j=top; j>=0; j--){
            System.out.println(a[j]);
       } 
    }
}

public class stack_array {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int l, d;
        do{
            System.out.println("press 1 to PUSH");
            System.out.println("press 2 to POP");
            System.out.println("press 3 to DISPLAY");
            System.out.println("Enter yout choice");
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

