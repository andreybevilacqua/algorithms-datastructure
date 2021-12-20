package graphs;

import java.util.List;

public final class EdgeFactory {

    public static List<List<Character>> createUndirectedEdgePath() {
        return List
            .of(
                List.of('i', 'j'),
                List.of('k', 'i'),
                List.of('m', 'k'),
                List.of('k', 'l'),
                List.of('o', 'n')
            );
    }

    public static List<List<Character>> createdShortestPathEdgePath() {
        return List
            .of(
                List.of('w', 'x'),
                List.of('x', 'y'),
                List.of('z', 'y'),
                List.of('z', 'v'),
                List.of('w', 'v')
            );
    }
}
