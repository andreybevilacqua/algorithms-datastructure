package algorithms;

import java.util.*;

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
}
