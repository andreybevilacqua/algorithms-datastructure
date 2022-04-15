package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.simpleBinaryTree;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tree.binary_tree.algorithms.DFS.*;

public class DFSTest {

    @Test
    public void simpleBinaryTreeTest() {
        var root = simpleBinaryTree();
        var result = dfsForSimpleBinaryTree(root);
        result.forEach(node -> System.out.print(node.getVal()));
        System.out.println();
        result = dfsForSimpleBinaryTreeRecursive(root);
        result.forEach(node -> System.out.print(node.getVal()));
    }

    @Test
    public void simpleBinaryTreeNullTest() {
        var result = dfsForSimpleBinaryTree(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void treeIncludesTest() {
        var root = simpleBinaryTree();
        var destination = new Node<>('e');
        assertTrue(treeIncludesRecursive(root, destination));
        destination = new Node<>('h');
        assertFalse(treeIncludesRecursive(root, destination));
    }
}
