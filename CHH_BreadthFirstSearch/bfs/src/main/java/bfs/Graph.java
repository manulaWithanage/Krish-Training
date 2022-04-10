import java.util.*;

public class Graph {
  private int vertex;
  private LinkedList<Integer> adj[];

  Graph(int v) {
    vertex = v;
    adj = new LinkedList[v];
    
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  void BFS(int start) {

    boolean visited[] = new boolean[vertex];
    LinkedList<Integer> queue = new LinkedList();

    visited[start] = true;
    queue.add(start);

    while (queue.size() != 0) {
      start = queue.poll();
      System.out.print(start + " ");

      Iterator<Integer> i = adj[start].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    g.BFS(2);
  }
}