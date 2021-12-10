package algorithms;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS {

    /* Char Graph:
       a: ['b', 'c']
       b: ['d']
       c: ['e']
       d: ['f']
       e: []
       f: []
    */

    public static Character[] bfsCharGraph(Map<Character, Character[]> graph, char sourceNode) {
        var queue = new ConcurrentLinkedQueue<Character>();
        queue.add(sourceNode);

        var result = new Character[graph.size()];
        var index = 0;
        while(!queue.isEmpty()) {
            var currentNode = queue.poll();
            result[index] = currentNode;
            index++;
            queue.addAll(
                List.of(graph.get(currentNode))
            );
        }
        return result;
    }
}
