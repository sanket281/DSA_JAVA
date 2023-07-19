package Tree_Graph;
import java.util.Scanner;

public class tree_traversal {
    static Node create(){
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

    static void inorder(Node root) //LNR
    {
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right); 
    }
    static void preorder(Node root) //NLR
    {
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right); 
    }
    static void postorder(Node root) //LRN
    {
        inorder(root.left);
        inorder(root.right); 
        System.out.print(root.data + " ");
    }

    public static void main(String args[]){
        Node root = create();
        System.out.println("----------------------------------------------------");
        inorder(root);
        System.out.println("----------------------------------------------------");
        preorder(root);
        System.out.println("----------------------------------------------------");
        postorder(root);
    }
}

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
