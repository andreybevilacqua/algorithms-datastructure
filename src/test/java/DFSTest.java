import algorithms.DFS;
import graphs.GraphFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DFSTest {

    @Test
    public void dfsCharGraphTest() {
        var graph = GraphFactory.createFirstGraph();
        var sourceNode = GraphFactory.getFirstGraphSourceNode();
        var result = DFS.dfsCharGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void dfsCharGraphRecursiveTest() {
        var graph = GraphFactory.createFirstGraph();
        var sourceNode = GraphFactory.getFirstGraphSourceNode();
        var result = new ArrayList<Character>(graph.size());
        DFS.dfsCharGraphRecursive(graph, sourceNode, result);
        System.out.println(result);
    }

    @Test
    public void dfsHasPathGraphTest() {
        var graph = GraphFactory.createHasPathGraph();
        var source = 'f';
        var destination = 'k';
        Assert.assertTrue(DFS.dfsHasPathGraph(graph, source, destination));

        source = 'j';
        destination = 'f';
        Assert.assertFalse(DFS.dfsHasPathGraph(graph, source, destination));
    }
}
