package graphs;

import java.util.LinkedList;

public class IntGraph {

    private final int numberOfNodes;
    LinkedList<Integer>[] adjacencyList;

    public IntGraph(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        adjacencyList = new LinkedList[numberOfNodes];

        for(int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int edge) {
        adjacencyList[v].add(edge);
    }

    public int getNumberOfNodes() { return numberOfNodes; }

    public static IntGraph initializeGraph() {
        var g = new IntGraph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        return g;
    }
}
