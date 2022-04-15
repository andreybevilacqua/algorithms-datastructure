package tree.binary_tree.algorithms;

import tree.binary_tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DFS {

    public static ArrayList<Node<Character>> dfsForSimpleBinaryTree(Node<Character> root) {
        if(root == null) return new ArrayList<>();
        var stack = new ArrayDeque<Node<Character>>();
        var result = new ArrayList<Node<Character>>();
        stack.push(root);

        while(!stack.isEmpty()) {
            var current = stack.pop();
            result.add(current);
            if(current.getRight() != null) stack.push(current.getRight());
            if(current.getLeft() != null) stack.push(current.getLeft());
        }
        return result;
    }

    public static ArrayList<Node<Character>> dfsForSimpleBinaryTreeRecursive(Node<Character> root) {
        if(root == null) return new ArrayList<>();
        var leftValues = dfsForSimpleBinaryTreeRecursive(root.getLeft());
        var rightValues = dfsForSimpleBinaryTreeRecursive(root.getRight());
        var result = new ArrayList<Node<Character>>();
        result.add(root);
        result.addAll(leftValues);
        result.addAll(rightValues);
        return result;
    }

    public static boolean treeIncludesRecursive(Node<Character> root, Node<Character> destination) {
        if(root == null) return false;
        if(root.equals(destination)) return true;
        return treeIncludesRecursive(root.getLeft(), destination) || treeIncludesRecursive(root.getRight(), destination);
    }
}
