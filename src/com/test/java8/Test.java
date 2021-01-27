package com.test.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		//find 
		findInt(arr, p -> p==3, System.out::println);
		

	}
	
	public static void findInt(int[] arr, Predicate<Integer> predicate, Consumer<Integer> consumer) {
		for(int i: arr) {
			if(predicate.test(i)) {
				consumer.accept(i);
			}
		}
		
	}

}
