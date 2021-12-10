package graphs;

import java.util.HashMap;
import java.util.Map;

public class CharGraph {

    private final Map<Character, Character[]> graph;

    public CharGraph() {
        graph = new HashMap<>();
        graph.put('a', new Character[]{'c','b'});
        graph.put('b', new Character[]{'d'});
        graph.put('c', new Character[]{'e'});
        graph.put('d', new Character[]{'f'});
        graph.put('e', new Character[]{});
        graph.put('f', new Character[]{});
    }

    public Map<Character, Character[]> getGraph() { return graph; }

    public char getSourceNode() { return 'a'; }
}
