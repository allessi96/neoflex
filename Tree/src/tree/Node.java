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
    Node left;
    Node right;
    int value;

    Node(String name, int value) {
        this.name=name;
        this.value=value;
    }
    
    
    String getName(){
        return name;
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
