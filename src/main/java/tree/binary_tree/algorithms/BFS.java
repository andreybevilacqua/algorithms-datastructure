package tree.binary_tree.algorithms;

import tree.binary_tree.Node;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS {

    public static ArrayList<Node<Character>> bfsForCharBinaryTree(Node<Character> root) {
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

    public static boolean treeIncludes(Node<Character> root, Node<Character> destination) {
        if(root == null) return false;
        var queue = new ConcurrentLinkedQueue<Node<Character>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            var current = queue.poll();
            if(current.equals(destination)) return true;
            else {
                if(current.getLeft() != null) queue.add(current.getLeft());
                if(current.getRight() != null) queue.add(current.getRight());
            }
        }
        return false;
    }

    public static int treeSum(Node<Integer> root) {
        var result = 0;
        if(root == null) return result;
        var queue = new ConcurrentLinkedQueue<Node<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            var current = queue.poll();
            result += current.getVal();
            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }
        return result;
    }

    public static int treeMin(Node<Integer> root) {
        if(root == null) return -1;
        var result = root.getVal();
        var queue = new ConcurrentLinkedQueue<Node<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            var current = queue.poll();
            if(current.getVal() < result) result = current.getVal();
            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }
        return result;
    }
}
