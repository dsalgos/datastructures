package com.dsalgos.ds.stack.impl;

import com.dsalgos.ds.stack.node.StackNode;

/**
 * Stack implementation
 * @author dsalgos
 *
 */
public class Stack {

	private StackNode top;

	private int size;


	public void push(int data) {
		StackNode node = new StackNode(data);
		if(this.top == null) {
			this.top = node;
		} else {
			this.top.setNext(node);
			top = node;
		}

		size++;
	}

	public int pop() {
		if(top == null) {
			System.out.println(" stack is empty, returning min");
			return Integer.MIN_VALUE;
		} else {
			StackNode node = this.top;
			int topValue = node.getData();

			top = node.getNext();

			node = null;
			top.setNext(node);
			--size;
			return topValue;
		}
	}

	public int top() {
		return this.top.getData();
	}

	public int size() {	
		return this.size;
	}

}
