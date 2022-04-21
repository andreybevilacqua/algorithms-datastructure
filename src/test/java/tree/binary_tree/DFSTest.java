package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.*;
import static org.junit.Assert.*;
import static tree.binary_tree.algorithms.DFS.*;

public class DFSTest {

    @Test
    public void simpleBinaryTreeTest() {
        var root = charBinaryTree();
        var result = dfsForCharBinaryTree(root);
        result.forEach(node -> System.out.print(node.getVal()));
        System.out.println();
        result = dfsForCharBinaryTreeRecursive(root);
        result.forEach(node -> System.out.print(node.getVal()));
    }

    @Test
    public void simpleBinaryTreeNullTest() {
        var result = dfsForCharBinaryTree(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void treeIncludesTest() {
        var root = charBinaryTree();
        var destination = new Node<>('e');
        assertTrue(treeIncludesRecursive(root, destination));
        destination = new Node<>('h');
        assertFalse(treeIncludesRecursive(root, destination));
    }

    @Test
    public void treeSumTest() {
        var root = treeSumBinaryTree();
        var result = treeSumRecursive(root);
        assertEquals(25, result);
    }

    @Test
    public void treeMinTest() {
        var root = treeMinBinaryTree();
        assertEquals(3, treeMinRecursive(root));
    }
}
