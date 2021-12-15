package algorithms;

import graphs.GraphFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BFSTest {

    @Test
    public void bfsCharGraphTest() {
        var graph = GraphFactory.createFirstGraph();
        var sourceNode = GraphFactory.getFirstGraphSourceNode();
        var result = BFS.charGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void bfsHasPathGraphTest() {
        var graph = GraphFactory.createHasPathGraph();
        var source = 'f';
        var destination = 'k';
        Assert.assertTrue(BFS.hasPathGraph(graph, source, destination));

        source = 'j';
        destination = 'f';
        Assert.assertFalse(BFS.hasPathGraph(graph, source, destination));
    }
}
