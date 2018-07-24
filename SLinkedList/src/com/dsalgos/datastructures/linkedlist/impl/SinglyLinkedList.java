package com.dsalgos.datastructures.linkedlist.impl;

import com.dsalgos.datastructures.linkedlist.list.List;
import com.dsalgos.datastructures.linkedlist.node.Node;

/**
 * 
 * 
 * @author 608952343 
 *
 * @param <T>
 */
public class SinglyLinkedList<T> implements List<T>{

	private Node<T> head;
	private Node<T> tail;
	
	
	@Override
	/**
	 * 
	 */
	public void add(T data) {
		
		Node<T> node = new Node<>(data);
		if(head == null) {
			head = node;
			tail = node;
		} else if(head.getNext() != null) {
			tail.setNext(node);
			tail = node;
		}		
	}
	
	public void add(T data, int position) {
		
	}

	@Override
	public void remove(Object o) {

	}

	@Override
	public void size() {
		
	}
}
