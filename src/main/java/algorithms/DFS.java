package algorithms;

import models.MatrixNode;

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

    public static boolean hasPathGraphRecursiveWithVisitControl(Map<Character, Character[]> graph, char source, char destination, Set<Character> visited) {
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

    public static int islandCount(char[][] matrix) {
        var stack = new ArrayDeque<MatrixNode>();
        var visited = new HashSet<MatrixNode>();
        var result = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'l') {
                    var land = new MatrixNode(row, col);
                    if(!visited.contains(land)) {
                        visited.add(land);
                        exploreLandNeighbors(matrix, stack, visited, row, col);
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static int minimumIsland(char[][] matrix) {
        var stack = new ArrayDeque<MatrixNode>();
        var visited = new HashSet<MatrixNode>();
        var minSize = -1;
        var count = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 'l') {
                    count = 0;
                    var land = new MatrixNode(row, col);
                    if(!visited.contains(land)) {
                        visited.add(land);
                        count++;
                        count += countLandNeighbors(matrix, stack, visited, row, col);
                        if(minSize == -1) minSize = count;
                        else if(count < minSize) minSize = count;
                    }
                }
            }
        }
        return minSize;
    }

    private static void exploreLandNeighbors(char[][] matrix, ArrayDeque<MatrixNode> stack, HashSet<MatrixNode> visited, int row, int col) {
        for(MatrixNode n : findNeighborLands(matrix, row, col, visited)) {
            stack.push(n);
        }
        while(!stack.isEmpty()) {
            var currentNode = stack.pop();
            if(!visited.contains(currentNode)) {
                visited.add(currentNode);
                for(MatrixNode n : findNeighborLands(matrix, currentNode.getRow(), currentNode.getCol(), visited)) {
                    stack.push(n);
                }
            }
        }
    }

    private static int countLandNeighbors(char[][] matrix,
                                          ArrayDeque<MatrixNode> stack,
                                          HashSet<MatrixNode> visited,
                                          int row,
                                          int col) {
        var result = 0;
        for(MatrixNode n : findNeighborLands(matrix, row, col, visited)) {
            stack.push(n);
        }
        while(!stack.isEmpty()) {
            var currentNode = stack.pop();
            if(!visited.contains(currentNode)) {
                visited.add(currentNode);
                result++;
                for(MatrixNode n : findNeighborLands(matrix, currentNode.getRow(), currentNode.getCol(), visited)) {
                    stack.push(n);
                }
            }
        }
        return result;
    }

    private static MatrixNode[] findNeighborLands(char[][] matrix, int row, int col, Set<MatrixNode> visited) {
        var result = new ArrayList<MatrixNode>();
        var down = row + 1;
        var left = col - 1;
        var right = col + 1;
        if(down < matrix.length && isValidLand(matrix, down, col, visited)) result.add(new MatrixNode(down, col));
        if(left > -1 && isValidLand(matrix, row, left, visited)) result.add(new MatrixNode(row, left));
        if(right < matrix[row].length && isValidLand(matrix, row, right, visited)) result.add(new MatrixNode(row, right));

        return result.toArray(new MatrixNode[0]);
    }

    private static boolean isValidLand(char[][] matrix, int row, int col, Set<MatrixNode> visited) {
        var tempNode = new MatrixNode(row, col);
        return matrix[row][col] == 'l' && !visited.contains(tempNode);
    }
}
