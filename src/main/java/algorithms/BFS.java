package algorithms;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS {

    public static Character[] charGraph(Map<Character, Character[]> graph, char sourceNode) {
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

    public static boolean hasPathGraph(Map<Character, Character[]> graph, char source, char destination) {
        var queue = new ConcurrentLinkedQueue<Character>();
        queue.add(source);

        var result = false;
        while(!queue.isEmpty()) {
            var currentNode = queue.poll();
            if(currentNode == destination) {
                result = true;
                break;
            }
            else {
                queue.addAll(
                    List.of(graph.get(currentNode))
                );
            }
        }
        return result;
    }
}
