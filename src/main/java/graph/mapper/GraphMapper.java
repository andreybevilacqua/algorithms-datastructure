package graph.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GraphMapper {

    public static Map<Character, List<Character>> mapEdgePathToGraph(List<List<Character>> edge) {
        final Map<Character, List<Character>> result = new HashMap<>();
        for(List<Character> list : edge) {
            for (Character c : list) {
                if (!result.containsKey(c)) result.put(c, new ArrayList<>());
                result
                    .get(c)
                    .addAll(
                        list
                            .stream()
                            .filter(letter -> letter != c)
                            .toList()
                    );
            }
        }
        return result;
    }

    public static Map<Character, Character[]> mapGraphWithListToGraphWithArray(Map<Character, List<Character>> origin) {
        var result = new HashMap<Character, Character[]>();
        origin
            .forEach((key, value) -> {
                var array = new Character[value.size()];
                for(int i = 0; i < value.size(); i++) {
                    array[i] = value.get(i);
                }
                result.put(key, array);
            });
        return result;
    }
}
