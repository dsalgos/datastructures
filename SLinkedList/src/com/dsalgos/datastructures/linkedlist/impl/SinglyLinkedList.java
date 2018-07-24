package com.dsalgos.datastructures.linkedlist.impl;

import com.dsalgos.datastructures.linkedlist.list.List;
import com.dsalgos.datastructures.linkedlist.node.Node;

/**
 * 
 * 
 * @author  
 *
 * @param <T>
 */
public class SinglyLinkedList<T> implements List<T>{

	private int size;
	
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
		} else {
			tail.setNext(node);
		}
		tail = node;
		size++;
	}
	
	public void add(T data, int position) {
		
	}

	@Override
	public boolean remove(Object o) {
		
		/*
		 * if its an instance of type Node,
		 * find it and remove it.
		 */		
		if((o == null)) {
			
			for(Node<T> current = head, prev = head; current != null; current = current.getNext()) {
				if(current.getData() == null) {
					if(current == head) {
						head = current.getNext();
					} else if(current.getNext() == null) {
						tail = prev;
						prev.setNext(null);
					}  else {
						prev.setNext(current.getNext());
					}
					
					--size;
					current = null;
					break;
				}
				
				prev = current;				
			}			
		} else {
			for(Node<T> current = head, prev = head; current != null; current = current.getNext()) {		
				if(o.equals(current.getData())) {

					if(current == head) {
						head = current.getNext();
					} else if(current.getNext() == null) {
						System.out.println(" current : " + current + " current next : " + current.getNext() + " prev : " + prev);
						tail = prev;
						prev.setNext(null);
					} else {
						prev.setNext(current.getNext());
					}
					
					--size;
					current = null;
					break;
				}
				prev = current;				
			}
			
		}
		
		/*
		 * return false otherwise
		 */
		return false;
	}

	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		
		if(head == null) {
			return "[ ]";
		}
		
		StringBuilder listElements = new StringBuilder("[ ");
		Node<T> current = head;
		while(current != null) {			
			listElements.append(current.getData()).append(" , ");
			current = current.getNext();
		}
		
		listElements.setLength(listElements.length()-3);
		listElements.append(" ]");
		return listElements.toString();
	}	
}
