package tree.controller;


import java.util.ArrayList;
import java.util.Collections;
import tree.view.draw.Drawing;
import tree.view.draw.GraphicsConstants;
import tree.model.Node;
import tree.view.TreeMainFrame;

public class ControlsNode {

    static ArrayList<Node> nodes; //лист для балансировки
    public static String valuesStr = ""; //строка значений при выводе 

    public static void allValue(Node n) {

        Node parent = n.getParent();

        if (parent == null) {
            outValue(n);
            TreeMainFrame.root = TreeMainFrame.selectedNode;
        } else {
            outValue(n);
            TreeMainFrame.selectedNode.setParent(parent);
            if (n.equals(parent.getLeft())) {
                TreeMainFrame.selectedNode.getParent().setLeft(TreeMainFrame.selectedNode);
            } else {
                TreeMainFrame.selectedNode.getParent().setRight(TreeMainFrame.selectedNode);
            }
        }

        TreeMainFrame.root.setName("start");
        rename(TreeMainFrame.root);
    }

    public static void add(Node n, int value, boolean flag) {
        if (TreeMainFrame.root != null) {
            if (flag) {
                n.setLeft(new Node(n.getName() + "0", value, n));
                TreeMainFrame.selectedNode = n.getLeft();
            } else {
                n.setRight(new Node(n.getName() + "1", value, n));
                TreeMainFrame.selectedNode = n.getRight();
            }
        } else {
            TreeMainFrame.root = new Node("start", value, null);
            TreeMainFrame.selectedNode = TreeMainFrame.root;
        }
    }

    public static void remove(Node n) {

        if (n.getParent() == null) {
            TreeMainFrame.root = null;
            Drawing.gr2d.clearRect(0, 0, 440, 450);
        } else {
            if (n.getParent().getLeft() != null && n.getParent().getLeft().equals(n)) {
                n.getParent().setLeft(null);
            } else {
                n.getParent().setRight(null);
            }
            TreeMainFrame.selectedNode = n.getParent();
            Drawing.gr2d.clearRect(0, 0, GraphicsConstants.wight, GraphicsConstants.height);
            Drawing.drawNode(Math.abs(GraphicsConstants.wight/2 - 10), 10, TreeMainFrame.root, 110);
        }
    }

    public static Node searchName(String name, Node n) {
        Node node = null;

        if (n.getName().equals(name)) {
            node = n;
            return node;
        } else {
            if (n.getLeft() != null) {
                node = searchName(name, n.getLeft());
            }
            if (node == null) {
                if (n.getRight() != null) {
                    node = searchName(name, n.getRight());
                }
            } else {
                return node;
            }
            return node;
        }
    }

    public static Node searchValue(int val, Node n) {
        Node node = null;

        if (n.getValue() == val) {
            node = n;
            return node;
        } else {
            if (n.getLeft() != null) {
                node = searchValue(val, n.getLeft());
            }
            if (node == null) {
                if (n.getRight() != null) {
                    node = searchValue(val, n.getRight());
                }
            } else {
                return node;
            }
            return node;
        }
    }

    public static void outValue(Node n) {
        sorting(n);
        nodes.stream().forEach((node) -> {
            valuesStr += node.getValue() + " ";
        });
    }

    private static void sorting(Node n) {
        nodes = new ArrayList<>();
        valuesStr = "";
        toArrayList(n);

        Collections.sort(nodes, (Node node1, Node node2) -> node1.getValue() - node2.getValue());

        if (nodes.size() > 1) {
            nodes.get(0).setParent(null);
            nodes.get(0).setRight(nodes.get(1));
            nodes.get(0).setLeft(null);
            for (int i = 1; i < nodes.size() - 1; i++) {
                nodes.get(i).setParent(nodes.get(i - 1));
                nodes.get(i).setRight(nodes.get(i + 1));
                nodes.get(i).setLeft(null);
            }
            nodes.get(nodes.size() - 1).setParent(nodes.get(nodes.size() - 2));
            nodes.get(nodes.size() - 1).setRight(null);
            nodes.get(nodes.size() - 1).setLeft(null);

            balancing(nodes.get(0));

            nodes.stream().filter((node) -> (node.getParent() == null)).forEach((node) -> {
                TreeMainFrame.selectedNode = node;
            });
        }

    }

    private static void balancing(Node n) {
        int balanceFactor = nodeHeight(n.getLeft()) - nodeHeight(n.getRight());
        if (balanceFactor <= 1 && balanceFactor >= -1) {
            if (n.getLeft() != null) {
                balancing(n.getLeft());
            }

            if (n.getRight() != null) {
                balancing(n.getRight());
            }
        } else {
            if (balanceFactor < 0) {
                leftRotation(n);
                balancing(n.getParent());
            } else {
                rightRotation(n);
                balancing(n.getParent());
            }
        }

    }

    private static void toArrayList(Node n) {
        if (n.getLeft() != null) {
            toArrayList(n.getLeft());
        }

        if (n.getRight() != null) {
            toArrayList(n.getRight());
        }
        nodes.add(n);

    }

    private static void leftRotation(Node x) {

        Node y = x.getRight();
        x.setRight(y.getLeft());
        if (y.getLeft() != null) {
            y.getLeft().setParent(x);
        }
        Node parentX = x.getParent();
        y.setParent(parentX);
        if (parentX != null) {
            if (x.equals(parentX.getLeft())) {
                x.getParent().setLeft(y);
            } else {
                x.getParent().setRight(y);
            }
        }

        y.setLeft(x);
        x.setParent(y);
    }

    private static void rightRotation(Node x) {
        Node y = x.getLeft();
        x.setLeft(y.getRight());
        if (y.getRight() != null) {
            y.getRight().setParent(x);
        }

        Node parentX = x.getParent();
        y.setParent(x.getParent());
        if (parentX != null) {
            if (x.equals(x.getParent().getLeft())) {
                x.getParent().setLeft(y);
            } else {
                x.getParent().setLeft(y);
            }
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
                r = nodeHeight(n.getRight());
            }
            if (l > r) {
                n.setHeight(l + 1);
            } else {
                n.setHeight(r + 1);
            }
            return n.getHeight();
        } else {
            return 0;
        }
    }

    static void rename(Node n) {
        if (n.getLeft() != null) {
            n.getLeft().setName(n.getName() + "0");
            rename(n.getLeft());
        }

        if (n.getRight() != null) {
            n.getRight().setName(n.getName() + "1");
            rename(n.getRight());
        }
    }
}
