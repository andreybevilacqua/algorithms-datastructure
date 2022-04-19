package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.*;
import static org.junit.Assert.*;
import static tree.binary_tree.algorithms.BFS.*;

public class BFSTest {

    @Test
    public void simpleBinaryTreeTest() {
        var root = charBinaryTree();
        var result = bfsForCharBinaryTree(root);
        result.forEach(node -> System.out.print(node.getVal()));
    }

    @Test
    public void simpleBinaryTreeNullTest() {
        var result = bfsForCharBinaryTree(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void treeIncludesExercise() {
        var root = charBinaryTree();
        var destination = new Node<>('e');
        assertTrue(treeIncludes(root, destination));

        destination = new Node<>('h');
        assertFalse(treeIncludes(root, destination));
    }

    @Test
    public void treeSumTest() {
        var root = treeSumBinaryTree();
        assertEquals(25, treeSum(root));
    }

    @Test
    public void treeMinTest() {
        var root = treeMinBinaryTree();
        assertEquals(3, treeMin(root));
    }
}
