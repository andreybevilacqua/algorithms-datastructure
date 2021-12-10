import algorithms.BFS;
import graphs.GraphFactory;
import org.junit.Test;

import java.util.Arrays;

public class BFSTest {

    @Test
    public void bfsCharGraphTest() {
        var graph = GraphFactory.createFirstGraph();
        var sourceNode = GraphFactory.getFirstGraphSourceNode();
        var result = BFS.bfsCharGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }
}
