package algorithms;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DFS {

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

    public static boolean hasPathGraphWithVisitControl(Map<Character, Character[]> graph, char source, char destination) {
        var stack = new ArrayDeque<Character>();
        var visited = new HashSet<Character>();
        stack.push(source);

        var result = false;
        while(!stack.isEmpty()) {
            var currentNode = stack.pop();
            if(!visited.contains(currentNode)) {
                visited.add(currentNode);
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
        }
        return result;
    }

    public static boolean hasPathGraphRecursiveWithVisitControl(Map<Character, Character[]> graph,
                                                                char source,
                                                                char destination,
                                                                Set<Character> visited) {
        if(source == destination) return true;

        if(visited.contains(source)) return false;
        else visited.add(source);

        var neighbors = graph.get(source);
        for(Character c : neighbors) {
            if(hasPathGraphRecursiveWithVisitControl(graph, c, destination, visited)) return true;
        }
        return false;
    }

    public static int countConnectedComponents(Map<Integer, Integer[]> graph) {
        var stack = new ArrayDeque<Integer>();
        var visited = new HashSet<Integer>();
        var count = new AtomicInteger();

        graph
            .forEach((key, value) -> {
                if(!visited.contains(key)) {
                    visited.add(key);
                    for(int i : value) {
                        stack.push(i);
                    }
                    while(!stack.isEmpty()) {
                        var currentNode = stack.pop();
                        if (!visited.contains(currentNode)) {
                            visited.add(currentNode);
                            for (int j : graph.get(currentNode)) {
                                if(!visited.contains(j)) stack.push(j);
                            }
                        }
                    }
                    count.incrementAndGet();
                }
            });
        return count.get();
    }

    /*
        0: [8, 1, 5],
        1: [0],
        5: [0, 8],
        8: [0, 5],
        2: [3, 4],
        3: [2, 4],
        4: [3, 2]
     */

    // largest = 4
    // current = 3
    // visited = {0, 8, 1, 5, 2, 3, 4}
    // stack = {}
    // key = 2
    // currentNode =
    public static int largestComponentWithVisitControl(Map<Integer, Integer[]> graph) {
        var largest = new AtomicInteger();
        var current = new AtomicInteger();
        var visited = new HashSet<Integer>();
        var stack = new ArrayDeque<Integer>();

        graph
            .forEach((key, values) -> {
                if(!visited.contains(key)) {
                    visited.add(key);
                    current.incrementAndGet();

                    for(int neighbor : values) {
                        stack.push(neighbor);
                    }

                    while(!stack.isEmpty()) {
                        var currentNode = stack.pop();
                        if(!visited.contains(currentNode)) {
                            visited.add(currentNode);
                            current.incrementAndGet();
                            List
                                .of(graph.get(currentNode))
                                .forEach(stack::push);
                        }
                    }
                    if(current.get() > largest.get()) largest.set(current.get());
                    current.set(0);
                }
            });
        return largest.get();
    }
}
