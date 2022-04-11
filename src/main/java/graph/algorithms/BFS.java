package graph.algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
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

    public static int shortestPathGraph(Map<Character, Character[]> graph, char source, char destination) {
        var queue = new ConcurrentLinkedQueue<NodeDistancePair>();
        var visited = new HashSet<Character>();
        var initialPosition = 0;
        var result = -1;

        queue.add(new NodeDistancePair(source, initialPosition));

        while(!queue.isEmpty()) {
            var currentPair = queue.poll();
            if(currentPair.getNode() == destination) {
                result = currentPair.getDistance();
                break;
            } else {
                if(!visited.contains(currentPair.getNode())) {
                    visited.add(currentPair.getNode());
                    var newDistance = currentPair.getDistance() + 1;
                    for(char c : graph.get(currentPair.getNode())) {
                        if(!visited.contains(c)) queue.add(new NodeDistancePair(c, newDistance));
                    }
                }
            }
        }
        return result;
    }

    @AllArgsConstructor
    @Getter
    private static class NodeDistancePair {
        private char node;
        private int distance;
    }
}
