package com.test.java8;

import java.util.Arrays;

public class MyArrayList <T> {
	
	private T [] array;
	private int size;
	
	//constructor
	public MyArrayList(){
		
		size = 0;
		this.array = (T[])new Object[5];
		
	}

	//put
	public void put(T element) {
		
		this.array[size++] = element;
		
		//ensureCapacity
		if(size==array.length) {
			T [] tmp = (T[])new Object[array.length*2];
			for(int i=0;i<array.length;i++) {
				tmp[i] = array[i];
			}
			
			array = tmp;
		}	
	}
	
	//get
	public T get(int index) {
		
		if(index<size)
			return this.array[index];
		else
			return null;
		
	}
	
	//remove
	public void remove(int index) {
		if(index>=size)
			return;
		for(int i=index;i<array.length-1;i++) {
			array[i] = array[i+1];
			
		}
		size--;
	}
	
	//getSize
	public int getSize() {
		return this.size;
	}
	
	//print
	public void print() {
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" " );
		}
		System.out.println();
	}

}
