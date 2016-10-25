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

    Node(String name,int value,Node parent) {
        this.name=name;
        this.value=value;
        this.parent=parent;
        
    }
    
    
    String getName(){
        return name;
    }
    
    Node getParent(){
        return parent;
    }
    
    Node getLeft(){
        return left;
    }
    
    Node getRight(){
        return right;
    }
    
    void setLeft(Node left){
        this.left=left;
    }
    
    void setRight(Node right){
        this.right=right;
    }
}
