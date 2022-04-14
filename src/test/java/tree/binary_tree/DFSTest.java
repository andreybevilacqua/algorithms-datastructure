package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.simpleBinaryTree;
import static org.junit.Assert.assertTrue;
import static tree.binary_tree.algorithms.DFS.dfsForSimpleBinaryTree;

public class DFSTest {

    @Test
    public void simpleBinaryTreeTest() {
        var root = simpleBinaryTree();
        var result = dfsForSimpleBinaryTree(root);
        result.forEach(node -> System.out.print(node.getVal()));
    }

    @Test
    public void simpleBinaryTreeNullTest() {
        var result = dfsForSimpleBinaryTree(null);
        assertTrue(result.isEmpty());
    }
}