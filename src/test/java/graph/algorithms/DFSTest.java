package graph.algorithms;

import graph.algorithms.DFS;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static graph.algorithms.DFS.*;
import static factories.EdgeFactory.createUndirectedEdgePath;
import static factories.GraphFactory.*;
import static factories.MatrixFactory.*;
import static graph.mapper.GraphMapper.mapEdgePathToGraph;
import static graph.mapper.GraphMapper.mapGraphWithListToGraphWithArray;
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

    @Test
    public void dfsIslandCount() {
        var matrix = createIslandCountMatrix();
        assertEquals(4, islandCount(matrix));

        matrix = createIslandCountMatrix2();
        assertEquals(3, islandCount(matrix));

        matrix = createIslandCountMatrix3();
        assertEquals(4, islandCount(matrix));

        matrix = createIslandCountMatrix4();
        assertEquals(1, islandCount(matrix));

        matrix = createIslandCountMatrix5();
        assertEquals(0, islandCount(matrix));
    }

    @Test
    public void dfsMinimumIsland() {
        var matrix = createIslandCountMatrix();
        assertEquals(1, minimumIsland(matrix));

        matrix = createIslandCountMatrix2();
        assertEquals(2, minimumIsland(matrix));

        matrix = createIslandCountMatrix3();
        assertEquals(1, minimumIsland(matrix));

        matrix = createIslandCountMatrix4();
        assertEquals(9, minimumIsland(matrix));

        matrix = createIslandCountMatrix5();
        assertEquals(-1, minimumIsland(matrix));
    }
}
