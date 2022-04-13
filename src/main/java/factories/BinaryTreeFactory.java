package factories;

import tree.binary_tree.Node;

public final class BinaryTreeFactory {

    public static Node<Character> simpleBinaryTree() {
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

        return a;
    }
}
