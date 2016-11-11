package tree;

public class Node {

    String name;
    Node parent = null;
    Node left = null;
    Node right = null;
    int value;
    int height = 0;

    Node(String name, int value, Node parent) {
        this.name = name;
        this.value = value;
        this.parent = parent;

    }

    String getName() {
        return name;
    }

    Integer getValue() {
        return value;
    }

    Node getParent() {
        return parent;
    }

    Node getLeft() {
        return left;
    }

    Node getRight() {
        return right;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int i) {
        this.height = i;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    void setRight(Node right) {
        this.right = right;
    }

    void setParent(Node y) {
        this.parent = y;
    }

    void setName(String name) {
        this.name = name;
    }

    void setValue(int value) {
        this.value = value;
    }

}
