package factories;

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

    public static Map<Integer, Integer[]> createConnectedComponentsCountGraph() {
        final Map<Integer, Integer[]> result = new HashMap<>();
        result.put(3, new Integer[]{});
        result.put(4, new Integer[]{6});
        result.put(6, new Integer[]{4,5,7,8});
        result.put(8, new Integer[]{6});
        result.put(7, new Integer[]{6});
        result.put(5, new Integer[]{6});
        result.put(1, new Integer[]{2});
        result.put(2, new Integer[]{1});
        return result;
    }

    public static Map<Integer, Integer[]> createConnectedComponentsCountGraph2() {
        final Map<Integer, Integer[]> result = new HashMap<>();
        result.put(0, new Integer[]{8, 1, 5});
        result.put(1, new Integer[]{0});
        result.put(5, new Integer[]{0, 8});
        result.put(8, new Integer[]{0, 5});
        result.put(2, new Integer[]{3, 4});
        result.put(3, new Integer[]{2, 4});
        result.put(4, new Integer[]{3, 2});
        return result;
    }

    public static Map<Integer, Integer[]> createConnectedComponentsCountGraph3() {
        final Map<Integer, Integer[]> result = new HashMap<>();
        result.put(1, new Integer[]{2});
        result.put(2, new Integer[]{1, 8});
        result.put(6, new Integer[]{7});
        result.put(9, new Integer[]{8});
        result.put(7, new Integer[]{6, 8});
        result.put(8, new Integer[]{9, 7, 2});
        return result;
    }

    public static Map<Integer, Integer[]> createLargestComponentGraph() {
        final Map<Integer, Integer[]> result = new HashMap<>();
        result.put(0, new Integer[]{8, 1, 5});
        result.put(1, new Integer[]{0});
        result.put(5, new Integer[]{0, 8});
        result.put(8, new Integer[]{0, 5});
        result.put(2, new Integer[]{3, 4});
        result.put(3, new Integer[]{2, 4});
        result.put(4, new Integer[]{3, 2});
        return result;
    }
}
