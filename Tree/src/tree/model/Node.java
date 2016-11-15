package tree.model;

public class Node {

    private String name;
    private Node parent = null;
    private Node left = null;
    private Node right = null;
    private int value;
    private int height = 0;

    public Node(String name, int value, Node parent) {
        this.name = name;
        this.value = value;
        this.parent = parent;

    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setParent(Node y) {
        this.parent = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
