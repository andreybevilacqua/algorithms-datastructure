package tree.binary_tree;

import org.junit.Test;

public class NodeTest {

    @Test
    public void createNodeTest() {
        var a = new Node<>('a');
        var b = new Node<>('b');
        var c = new Node<>('c');
        var d = new Node<>('d');
        var e = new Node<>('e');
        var f = new Node<>('f');

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        //          a
        //        /   \
        //       b     c
        //     /   \    \
        //    d     e    f
    }
}
