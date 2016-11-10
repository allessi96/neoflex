/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author User
 */
public class Node {

    String name;
    Node parent;
    Node left;
    Node right;
    int value;

    Node(String name, int value, Node parent) {
        this.name = name;
        this.value = value;
        this.parent = parent;

    }

    String getName() {
        return name;
    }

    int getValue() {
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

    void setLeft(Node left) {
        this.left = left;
    }

    void setRight(Node right) {
        this.right = right;
    }

    public static Node searchName(String name, Node n) {

        if (n.getName().equals(name)) {
            return n;
        }

        if (n.getLeft() != null) {
            return searchName(name, n.getLeft());
        }

        if (n.getRight() != null) {
            return searchName(name, n.getRight());
        }

        return null;
    }

    public static Node searchValue(int val, Node n) {

        if (n.getValue() == val) {
            return n;
        }

        if (n.getLeft() != null) {
            return searchValue(val, n.getLeft());
        }

        if (n.getRight() != null) {
            return searchValue(val, n.getRight());
        }
        return null;

    }

}
