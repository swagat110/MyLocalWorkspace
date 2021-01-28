package com.test.java8;

import java.util.Arrays;

public class MyArrayList {
	
	private int capacity;
	private int current;
	private int [] array;
	public int length;
	
	public MyArrayList() {
		int capacity = 1;
		int current = 0;
		array = new int[capacity];
		length = current;
	}
	
	public int getElement(int index) {
		if(index<=current)
			return array[index];
		else
			return -1;
	}
	
	public void addElement(int element) {
		
		if(current == capacity) {
			capacity = 2 * capacity;
			int [] temp = new int[capacity];
			for(int i=0;i<current;i++) {
				temp[i] = array[i];
				array = temp;
			}
			
			array[current++] = element;
			length = current;
			
		}
		
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(array));
	}

}
