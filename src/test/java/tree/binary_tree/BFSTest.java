package tree.binary_tree;

import org.junit.Test;

import static factories.BinaryTreeFactory.simpleBinaryTree;
import static org.junit.Assert.assertTrue;
import static tree.binary_tree.algorithms.BFS.bfsForSimpleBinaryTree;

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
}
