package com.dsalgos.ds.binarysearchtree.bstimpl;

import java.util.Iterator;

import com.dsalgos.ds.binarysearchtree.node.TreeNode;

/**
 * 
 * @author dsalgos
 *
 */
public class BinarySearchTree<T> implements Iterator<TreeNode<T>> {

	/*
	 * root of the tree
	 */
	private TreeNode<T> root;
	
	/*
	 * count of the number of 
	 * elements in the tree
	 */
	private int size;
	
	
	public void add(T data) {
		
		TreeNode<T> newNode = new TreeNode<>(data);
		
		if(root == null) {
			root = newNode;
		} else{
			add(newNode, root);
		}		
	}
	
	public TreeNode<T> add(TreeNode<T> node, TreeNode<T> pivot) {
		
		if(pivot.getData().equals(node.getData())) {
			return null;
		}
		
		if(pivot == null) {
			return node;
		}
		
		if()
		
		
	}
	
	public int size() {
		
		return -1;
	}
	
	public boolean delete(TreeNode<T> node) {
		
		return true;
	}

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public TreeNode<T> next() {
		return null;
	}
}
