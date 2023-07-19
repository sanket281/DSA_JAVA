package Tree_Graph;
import java.util.Scanner;


public class tree_creation {
    static Node create()
    {
        int data;
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter value");
        data = sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        root = new Node(data);
        System.out.print("Enter the left child of" + root.data);
        root.left = create();
        System.out.print("Enter the right child of" + root.data);
        root.right = create();
        return root;

    }

    public static void main(String args[])
    {
        Node root = create();
    }
}

class Node
{
    Node left, right;
    int data;
    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
