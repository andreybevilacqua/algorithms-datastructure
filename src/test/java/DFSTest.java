import graphs.CharGraph;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSTest {

    @Test
    public void dfsCharGraphTest() {
        var charGraph = new CharGraph();
        var graph = charGraph.getFirstGraph();
        var sourceNode = charGraph.getFirstGraphSourceNode();
        var result = Algorithms.dfsCharGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void dfsCharGraphRecursiveTest() {
        var charGraph = new CharGraph();
        var graph = charGraph.getFirstGraph();
        var sourceNode = charGraph.getFirstGraphSourceNode();
        var result = new ArrayList<Character>(graph.size());
        Algorithms.dfsCharGraphRecursive(graph, sourceNode, result);
        System.out.println(result);
    }

    @Test
    public void bfsCharGraphTest() {
        var charGraph = new CharGraph();
        var graph = charGraph.getFirstGraph();
        var sourceNode = charGraph.getFirstGraphSourceNode();
        var result = Algorithms.bfsCharGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }
}
