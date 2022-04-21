package tree.binary_tree.algorithms;

import tree.binary_tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class DFS {

    public static ArrayList<Node<Character>> dfsForCharBinaryTree(Node<Character> root) {
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

    public static ArrayList<Node<Character>> dfsForCharBinaryTreeRecursive(Node<Character> root) {
        if(root == null) return new ArrayList<>();
        var leftValues = dfsForCharBinaryTreeRecursive(root.getLeft());
        var rightValues = dfsForCharBinaryTreeRecursive(root.getRight());
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

    public static int treeSumRecursive(Node<Integer> root) {
        if(root == null) return 0;
        return root.getVal() + treeSumRecursive(root.getLeft()) + treeSumRecursive(root.getRight());
    }

    public static int treeMinRecursive(Node<Integer> root) {
        if(root == null) return MAX_VALUE;
        var left = treeMinRecursive(root.getLeft());
        var right =  treeMinRecursive(root.getRight());
        var minLeftRight = Math.min(left, right);
        return Math.min(minLeftRight, root.getVal());
    }

    public static int maxRootToLeafPathSumRecursive(Node<Integer> root) {
        if(root == null) return MIN_VALUE;
        if(isLeaf(root)) return root.getVal();
        var left = maxRootToLeafPathSumRecursive(root.getLeft());
        var right = maxRootToLeafPathSumRecursive(root.getRight());
        return (Math.max(left, right) + root.getVal());
    }

    private static boolean isLeaf(Node<Integer> node) {
        return node.getLeft() == null && node.getRight() == null;
    }
}
