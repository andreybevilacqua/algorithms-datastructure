package algorithms;

import org.junit.Test;

import java.util.Arrays;

import static algorithms.BFS.*;
import static factories.EdgeFactory.createUndirectedEdgePath;
import static factories.EdgeFactory.createdShortestPathEdgePath;
import static factories.GraphFactory.*;
import static mapper.GraphMapper.mapEdgePathToGraph;
import static mapper.GraphMapper.mapGraphWithListToGraphWithArray;
import static org.junit.Assert.*;

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
        assertTrue(hasPathGraph(graph, source, destination));

        source = 'j';
        destination = 'f';
        assertFalse(hasPathGraph(graph, source, destination));
    }

    @Test
    public void bfsShortestPathGraphTest() {
        var edge = createdShortestPathEdgePath();
        var graphWithList = mapEdgePathToGraph(edge);
        var graph = mapGraphWithListToGraphWithArray(graphWithList);
        var source = 'w';
        var destination = 'z';

        assertEquals(2, shortestPathGraph(graph, source, destination));

        graph = createHasPathGraph();
        source = 'f';
        destination = 'h';
        assertEquals(2, shortestPathGraph(graph, source, destination));
        destination = 'j';
        assertEquals(-1, shortestPathGraph(graph, source, destination));

        edge = createUndirectedEdgePath();
        graphWithList = mapEdgePathToGraph(edge);
        graph = mapGraphWithListToGraphWithArray(graphWithList);
        source = 'i';
        destination = 'm';
        assertEquals(2, shortestPathGraph(graph, source, destination));
        destination = 'j';
        assertEquals(1, shortestPathGraph(graph, source, destination));
        destination = 'a';
        assertEquals(-1, shortestPathGraph(graph, source, destination));
    }
}
