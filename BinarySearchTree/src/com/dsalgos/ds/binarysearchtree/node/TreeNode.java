/**
 * 
 */
package com.dsalgos.ds.binarysearchtree.node;

import java.util.Comparator;

/**
 * Node structure to contain the data
 * and the reference to its children
 * in the tree.
 * 
 * @author dsalgos
 *
 */
public class TreeNode<T> {

	/*
	 * data to be contained by the node
	 */
	private T data;
	
	/*
	 * left child of the current node
	 */
	private TreeNode<T> left;
	
	/*
	 * right child of the current node  
	 */
	private TreeNode<T> right;
	
	/*
	 * parent of the current node
	 */
	private TreeNode<T> parent;
	
	
	public TreeNode(T data) {
		this(data, null, null);
	}
	
	public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public TreeNode<T> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public TreeNode<T> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	/**
	 * @return the parent
	 */
	public TreeNode<T> getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object node) {
	
		if(!(node instanceof TreeNode)) {
			return false;
		}
		
		TreeNode<?> treeNode = (TreeNode<?>) node;
		
		return valEquals(data, treeNode.getData());
	}
	
    /**
     * Test two values for equality.  Differs from o1.equals(o2) only in
     * that it copes with {@code null} o1 properly.
     */
    static final boolean valEquals(Object o1, Object o2) {
        return (o1==null ? o2==null : o1.equals(o2));
    }
    
    @Override
	public String toString() {
		return "[" + data + "]";
	}

}
