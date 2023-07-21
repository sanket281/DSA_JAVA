package Tree_Graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph_dfs {
    private LinkedList<Integer> adjacency[];
    public graph_dfs(int v){
        adjacency = new LinkedList[v];
        for(int i =0; i<v ; i++){
            adjacency[i] = new LinkedList<Integer>();
        }
    }
    public void insertedge(int s, int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }

    public void dfs(int source)
    {
        boolean visited_notes[] = new boolean[adjacency.length];
        int parent_node[] = new int[adjacency.length];
        Stack<Integer> q = new Stack<Integer>();
        q.add(source);
        visited_notes[source] = true;
        parent_node[source] = -1;
        while(!q.isEmpty())
        { 
            int p = q.pop();
            System.out.println(p);
            for(int i:adjacency[p])
            {
                if(visited_notes[i] != true)
                {
                    visited_notes[i] = true;
                    q.add(i);
                    parent_node[i] = p;
                }
            }

        }

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        graph_dfs g = new graph_dfs(v);
        System.out.println("Enter edges");
        for(int i=0; i<e; i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s,d);
    
        }
        System.out.println("Enter the source of bfs");
        int source = sc.nextInt();
        g.dfs(source);
    }
}
