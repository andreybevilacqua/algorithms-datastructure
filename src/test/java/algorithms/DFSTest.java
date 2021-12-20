package algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static algorithms.DFS.*;
import static graphs.EdgeFactory.createUndirectedEdgePath;
import static graphs.GraphFactory.*;
import static mapper.GraphMapper.mapGraphWithListToGraphWithArray;
import static mapper.GraphMapper.mapEdgePathToGraph;
import static org.junit.Assert.*;

public class DFSTest {

    @Test
    public void dfsCharGraphTest() {
        var graph = createFirstGraph();
        var sourceNode = getFirstGraphSourceNode();
        var result = charGraph(graph, sourceNode);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void dfsCharGraphRecursiveTest() {
        var graph = createFirstGraph();
        var sourceNode = getFirstGraphSourceNode();
        var result = new ArrayList<Character>(graph.size());
        DFS.charGraphRecursive(graph, sourceNode, result);
        System.out.println(result);
    }

    @Test
    public void dfsHasPathGraphTest() {
        var graph = createHasPathGraph();
        var source = 'f';
        var destination = 'k';
        assertTrue(hasPathGraph(graph, source, destination));

        source = 'j';
        destination = 'f';
        assertFalse(hasPathGraph(graph, source, destination));
    }

    @Test
    public void dfsUndirectedEdgePathTest() {
        var edge = createUndirectedEdgePath();
        var graph = mapGraphWithListToGraphWithArray(mapEdgePathToGraph(edge));
        var source = 'i';
        var destination = 'k';
        assertTrue(hasPathGraph(graph, source, destination));
        assertTrue(hasPathGraphRecursiveWithVisitControl(graph, source, destination, new HashSet<>()));

        destination = 'o';
        assertFalse(hasPathGraphWithVisitControl(graph, source, destination));
    }

    @Test
    public void dfsCountConnectedComponentsTest() {
        var graph = createConnectedComponentsCountGraph();
        assertEquals(3, countConnectedComponents(graph));

        graph = createConnectedComponentsCountGraph2();
        assertEquals(2, countConnectedComponents(graph));

        graph = createConnectedComponentsCountGraph3();
        assertEquals(1, countConnectedComponents(graph));
    }

    @Test
    public void dfsLargestComponentTest() {
        var graph = createLargestComponentGraph();
        assertEquals(4, largestComponentWithVisitControl(graph));

        graph = createConnectedComponentsCountGraph();
        assertEquals(5, largestComponentWithVisitControl(graph));
    }
}
