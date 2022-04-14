package tree.binary_tree.algorithms;

import tree.binary_tree.Node;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS {

    public static ArrayList<Node<Character>> bfsForSimpleBinaryTree(Node<Character> root) {
        if(root == null) return new ArrayList<>();
        var queue = new ConcurrentLinkedQueue<Node<Character>>();
        var result = new ArrayList<Node<Character>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            var current = queue.poll();
            result.add(current);
            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }
        return result;
    }
}
