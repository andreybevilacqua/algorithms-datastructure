package algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static algorithms.BFS.charGraph;
import static algorithms.BFS.hasPathGraph;
import static graphs.GraphFactory.*;

public class BFSTest {

    @Test
    public void bfsCharGraphTest() {
        var graph = createFirstGraph();
        var sourceNode = getFirstGraphSourceNode();
        var result = charGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void bfsHasPathGraphTest() {
        var graph = createHasPathGraph();
        var source = 'f';
        var destination = 'k';
        Assert.assertTrue(hasPathGraph(graph, source, destination));

        source = 'j';
        destination = 'f';
        Assert.assertFalse(hasPathGraph(graph, source, destination));
    }
}
