package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.simpleBinaryTree;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tree.binary_tree.algorithms.BFS.bfsForSimpleBinaryTree;
import static tree.binary_tree.algorithms.BFS.treeIncludes;

public class BFSTest {

    @Test
    public void simpleBinaryTreeTest() {
        var root = simpleBinaryTree();
        var result = bfsForSimpleBinaryTree(root);
        result.forEach(node -> System.out.print(node.getVal()));
    }

    @Test
    public void simpleBinaryTreeNullTest() {
        var result = bfsForSimpleBinaryTree(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void treeIncludesExercise() {
        var root = simpleBinaryTree();
        var destination = new Node<>('e');
        assertTrue(treeIncludes(root, destination));

        destination = new Node<>('h');
        assertFalse(treeIncludes(root, destination));
    }
}
