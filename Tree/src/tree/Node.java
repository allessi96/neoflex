/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Node{

    String name;
    Node parent=null;
    Node left=null;
    Node right=null;
    int value;
    int height = 0;
    static ArrayList<Node> nodes;

    public static String valuesStr = "";

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

    void setLeft(Node left) {
        this.left = left;
    }

    void setRight(Node right) {
        this.right = right;
    }

    private void setParent(Node y) {
        this.parent = y;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setValue(int value) {
        this.value = value;
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

    public static void sOutValue(Node n) {
//
//        if (n.getLeft() != null) {
//            sOutValue(n.getLeft());
//        }
//
//        if (n.getRight() != null) {
//            sOutValue(n.getRight());
//        }
//
//        valuesStr += Integer.toString(n.getValue()) + ' ';
        sorting(n);
    }

    private static void sorting(Node n) {
        nodes = new ArrayList<>();
        valuesStr = "";
        String jop="";
        toArrayList(n);
        Collections.sort(nodes, (Node node2, Node node1) -> node1.getValue().compareTo(node2.getValue()));
                
        jop = nodes.stream().map((node) -> node.getValue()+" ").reduce(jop, String::concat);
        
        JOptionPane.showMessageDialog(null, jop);
        //balancing(nodes.get(0));
    }
    
    private void balancing(Node n){
        
        
        
    }

    private static  void toArrayList(Node n) {
        if (n.getLeft() != null) {
            toArrayList(n.getLeft());
        }

        if (n.getRight() != null) {
            toArrayList(n.getRight());
        }
        nodes.add(n);
        
    }

    private void leftRotation(Node x) {

        Node y = x.getRight();
        x.setRight(y.getLeft());
        if (y.getLeft() != null) {
            y.getLeft().setParent(x);
        }
        y.setParent(x.getParent());
        if (x == x.getParent().getLeft()) {
            x.getParent().setLeft(y);
        } else {
            x.getParent().setRight(y);
        }

        y.setLeft(x);
        x.setParent(y);
    }

    private void rightRotation(Node x) {
        Node y = x.getLeft();
        x.setLeft(y.getRight());
        if (y.getRight() != null) {
            y.getRight().setParent(x);
        }

        y.setParent(x.getParent());
        if (x == x.getParent().getLeft()) {
            x.getParent().setLeft(y);
        } else {
            x.getParent().setLeft(y);
        }
        y.setRight(x);
        x.setParent(y);
    }

    private static int nodeHeight(Node n) {
        int l = 0, r = 0;
        if (n != null) {
            if (n.getLeft() != null) {
                l = nodeHeight(n.getLeft());
            }

            if (n.getRight() != null) {
                r = nodeHeight(n.getLeft());
            }
            if (l > r) {
                n.height = l + 1;
            } else {
                n.height = r + 1;
            }
            return n.height;
        } else {
            return 0;
        }
    }
    
    private boolean balanceFactor(Node n){
        return Math.abs(nodeHeight(n.getLeft())-(nodeHeight(n.getRight()))) <= 1;
    }

}
