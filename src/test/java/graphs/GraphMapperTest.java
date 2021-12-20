package graphs;

import org.junit.Test;

import java.util.List;

import static graphs.EdgeFactory.createUndirectedEdgePath;
import static mapper.GraphMapper.mapEdgePathToGraph;
import static org.junit.Assert.assertTrue;

public class GraphMapperTest {

    @Test
    public void shouldMapUndirectedEdgePathToGraph() {
        var edge = createUndirectedEdgePath();
        var result = mapEdgePathToGraph(edge);
        assertTrue(result.get('i').containsAll(List.of('j', 'k')));
        assertTrue(result.get('j').contains('i'));
        assertTrue(result.get('k').containsAll(List.of('i', 'm', 'l')));
        assertTrue(result.get('l').contains('k'));
        assertTrue(result.get('m').contains('k'));
        assertTrue(result.get('n').contains('o'));
        assertTrue(result.get('o').contains('n'));
        System.out.println(result);
    }
}
