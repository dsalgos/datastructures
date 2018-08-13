package com.dsalgos.ds.stack.node;

/**
 * Stack node
 * 
 * @author dsalgos
 *
 */
public class StackNode {

	private int data;
	private StackNode next;
	
	public StackNode() { /*no-arg constructor*/	}
	
	public StackNode(int data) {
		this(data, null);
	}
	
	public StackNode(int data, StackNode next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public StackNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(StackNode next) {
		this.next = next;
	}
}
