package com.dsalgos.datastructures.linkedlist.list;

public interface List<T> {

	/**
	 * 
	 * @param data
	 */
	void add(T data);
	
	boolean remove(Object o);
	
	int size();
	
}
