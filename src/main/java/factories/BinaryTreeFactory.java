package factories;

import tree.binary_tree.Node;

public final class BinaryTreeFactory {

    public static Node<Character> charBinaryTree() {
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


    public static Node<Integer> treeSumBinaryTree() {
        var a = new Node<>(3);
        var b = new Node<>(11);
        var c = new Node<>(4);
        var d = new Node<>(4);
        var e = new Node<>(2);
        var f = new Node<>(1);

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        return a;
    }

    public static Node<Integer> treeMinBinaryTree() {
        var a = new Node<>(5);
        var b = new Node<>(11);
        var c = new Node<>(3);
        var d = new Node<>(4);
        var e = new Node<>(15);
        var f = new Node<>(12);

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        return a;
    }

    public static Node<Integer> maxRootToLeafPathSumBinaryTree() {
        var a = new Node<>(5);
        var b = new Node<>(11);
        var c = new Node<>(3);
        var d = new Node<>(4);
        var e = new Node<>(2);
        var f = new Node<>(1);

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        return a;
    }
}
