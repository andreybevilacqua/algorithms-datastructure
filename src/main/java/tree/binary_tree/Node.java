package tree.binary_tree;

import java.util.Objects;

public class Node<T> {
    private final T val;
    private Node<T> left;
    private Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public T getVal() {
        return val;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node<?> node)) return false;
        return getVal().equals(node.getVal()) && getLeft().equals(node.getLeft()) && getRight().equals(node.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVal(), getLeft(), getRight());
    }
}
