package algorithms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DFS {

    /* Char Graph:
       a: ['b', 'c']
       b: ['d']
       c: ['e']
       d: ['f']
       e: []
       f: []
    */

    public static Character[] dfsCharGraph(Map<Character, Character[]> graph, char sourceNode) {
        var stack = new ArrayDeque<Character>();
        stack.push(sourceNode);

        var result = new Character[graph.size()];
        var index = 0;
        while(!stack.isEmpty()) {
            var currentNode = stack.pop();
            result[index] = currentNode;
            index++;
            Arrays
                .asList(graph.get(currentNode))
                .forEach(stack::push);
        }
        return result;
    }

    public static void dfsCharGraphRecursive(Map<Character, Character[]> graph, char sourceNode, List<Character> result) {
        result.add(sourceNode);
        Arrays
            .asList(graph.get(sourceNode))
            .forEach(neighbor -> dfsCharGraphRecursive(graph, neighbor, result));
    }
}
