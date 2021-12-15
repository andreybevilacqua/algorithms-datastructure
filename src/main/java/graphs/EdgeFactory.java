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
}
