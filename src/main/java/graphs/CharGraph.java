package graphs;

import java.util.HashMap;
import java.util.Map;

public class CharGraph {

    private final Map<Character, Character[]> firstGraph;
    private final Map<Character, Character[]> hasPathGraph;

    public CharGraph() {
        firstGraph = new HashMap<>();
        firstGraph.put('a', new Character[]{'c','b'});
        firstGraph.put('b', new Character[]{'d'});
        firstGraph.put('c', new Character[]{'e'});
        firstGraph.put('d', new Character[]{'f'});
        firstGraph.put('e', new Character[]{});
        firstGraph.put('f', new Character[]{});

        hasPathGraph = new HashMap<>();
        hasPathGraph.put('f', new Character[]{'g', 'i'});
        hasPathGraph.put('g', new Character[]{'h'});
        hasPathGraph.put('h', new Character[]{});
        hasPathGraph.put('i', new Character[]{'g', 'k'});
        hasPathGraph.put('j', new Character[]{'i'});
        hasPathGraph.put('k', new Character[]{});
    }

    public Map<Character, Character[]> getFirstGraph() { return firstGraph; }
    public Map<Character, Character[]> getHasPathGraph() { return hasPathGraph; }

    public char getFirstGraphSourceNode() { return 'a'; }
}
