package Stack;
import java.util.Scanner;

class Queue2{
    int f = -1;
    int r = -1;
    int n=10;
    int q[] = new int[n];
    Scanner sc = new Scanner(System.in);
    void enqueue(){
        if(f == (r+1)%n)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("Overflow: Queue is full");
        }
        else
        {   
            System.out.println("----------------------------------------------------");
            System.out.println("Please enter the number: ");
            int i = sc.nextInt();
            if(f == -1 && r == -1)
            {
                f = 0;
                r = 0;
                q[r] = i;
            }
            else
            {
                r = (r+1)%n;
                q[r] = i;
            }
        }
       
    }
    void dequeue(){
        if( f == -1 && r == -1)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("Underflow: The Queue is empty");
        }
        else
        {
            if(f == r)
            {
                f = -1;
                r = -1;
            }
            else
            {
                f = (f+1)%n;
            }
        }
    }
    void display(){
      System.out.println("----------------------------------------------------");  
      for(int j = f; j!=r+1; j=(j+1)%n){
        System.out.println(q[j]);
      }
    }
}
public class queue_circular {
        public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        Queue2 q = new Queue2();
        int l, d;
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("press 1 to Enqueue");
            System.out.println("press 2 to Dequeue");
            System.out.println("press 3 to DISPLAY");
            System.out.println("Enter yout choice");
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
