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

    /* Has Path Graph:
       f: ['g', 'i']
       g: ['h']
       h: []
       i: ['g', 'k']
       j: ['i']
       k: []
    */

    /* Undirected Edge Path
        i: [j, k],
        j: [i],
        k: [i, m, l],
        l: [k],
        m: [k],
        n: [o],
        o: [n]
     */

    public static Character[] charGraph(Map<Character, Character[]> graph, char sourceNode) {
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

    public static void charGraphRecursive(Map<Character, Character[]> graph, char sourceNode, List<Character> result) {
        result.add(sourceNode);
        Arrays
            .asList(graph.get(sourceNode))
            .forEach(neighbor -> charGraphRecursive(graph, neighbor, result));
    }

    public static boolean hasPathGraph(Map<Character, Character[]> graph, char source, char destination) {
        var stack = new ArrayDeque<Character>();
        stack.push(source);

        var result = false;
        while(!stack.isEmpty()) {
            var currentNode = stack.pop();
            if(currentNode == destination) {
                result = true;
                break;
            }
            else {
                List
                    .of(graph.get(currentNode))
                    .forEach(stack::push);
            }
        }
        return result;
    }
}
