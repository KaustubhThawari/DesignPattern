package com.tree.demo;

public class CustomTree {

	Node root;
	
	class Node {
	    int value;
	    Node left;
	    Node right;
	 
	    Node(int value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
	}
	
	public static void main(String[] args) {
		CustomTree bt = new CustomTree();
		 
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    
	    bt.traverseInOrder(bt.root);
	    bt.deleteRecursive(bt.root, 6);
	    bt.traverseInOrder(bt.root);
	}
	
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	private Node deleteRecursive(Node current, int value) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (value == current.value) {
	        
	    } 
	    if (value < current.value) {
	        current.left = deleteRecursive(current.left, value);
	        return current;
	    }
	    current.right = deleteRecursive(current.right, value);
	    return current;
	}
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}

}
