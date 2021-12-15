package graphs;

import java.util.HashMap;
import java.util.Map;

public final class GraphFactory {

    public static Map<Character, Character[]> createFirstGraph() {
        final Map<Character, Character[]> result = new HashMap<>();
        result.put('a', new Character[]{'c','b'});
        result.put('b', new Character[]{'d'});
        result.put('c', new Character[]{'e'});
        result.put('d', new Character[]{'f'});
        result.put('e', new Character[]{});
        result.put('f', new Character[]{});
        return result;
    }
    public static char getFirstGraphSourceNode() { return 'a'; }

    public static Map<Character, Character[]> createHasPathGraph() {
        final Map<Character, Character[]> result = new HashMap<>();
        result.put('f', new Character[]{'g', 'i'});
        result.put('g', new Character[]{'h'});
        result.put('h', new Character[]{});
        result.put('i', new Character[]{'g', 'k'});
        result.put('j', new Character[]{'i'});
        result.put('k', new Character[]{});
        return result;
    }
}
