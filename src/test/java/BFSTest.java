import algorithms.BFS;
import graphs.CharGraph;
import org.junit.Test;

import java.util.Arrays;

public class BFSTest {

    @Test
    public void bfsCharGraphTest() {
        var charGraph = new CharGraph();
        var graph = charGraph.getFirstGraph();
        var sourceNode = charGraph.getFirstGraphSourceNode();
        var result = BFS.bfsCharGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }
}
