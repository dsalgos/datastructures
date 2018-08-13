package com.dsalgos.ds.binarysearchtree.bstimpl;

import java.util.Comparator;
import java.util.Iterator;

import com.dsalgos.ds.binarysearchtree.node.TreeNode;

/**
 * 
 * @author dsalgos
 *
 */
public class BinarySearchTree<T> implements Iterator<TreeNode<T>> {


	private Comparator<T> comparator;

	/*
	 * root of the tree
	 */
	private TreeNode<T> root;

	/*
	 * count of the number of 
	 * elements in the tree
	 */
	private int size;


	public boolean add(T data) {

		TreeNode<T> newNode = new TreeNode<>(data);

		if(root == null) {
			root = newNode;
			return true;
		} else{
			return (add(newNode, root) != null);
		}		
	}

	public TreeNode<T> add(TreeNode<T> node, TreeNode<T> pivot) {

		if(pivot == null) {
			return node;
		} else if(compare(pivot.getData(), node.getData()) == 0 ) {
			return null;
		} else {

			if(compare(pivot.getData(), node.getData()) < 0) {
				TreeNode<T> temp = add(node, pivot.getLeft());
				pivot.setLeft(temp);
				temp.setParent(pivot);
			} else {
				TreeNode<T> temp = add(node, pivot.getRight());
				pivot.setRight(temp);
				temp.setParent(pivot);
			}
		}

		return node;
	}

	/*
	 * 
	 */
	public int size() {

		return this.size;
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


	/**
	 * Compares two keys using the correct comparison method for this TreeMap.
	 */
	@SuppressWarnings("unchecked")
	final int compare(Object o1, Object o2) {
		return comparator==null ? ((Comparable<? super T>)o1).compareTo((T)o2)
				: comparator.compare((T)o1, (T)o2);
	}
}
