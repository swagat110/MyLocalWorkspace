package com.test.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		int j = findInt(arr, p -> p==4, p -> {return (p+1);});
		//find 
		System.out.println(j);
		
		

	}
	
	public static Integer findInt(int[] arr, Predicate<Integer> predicate, Function<Integer, Integer> consumer) {
		for(int i: arr) {
			if(predicate.test(i)) {
				return consumer.apply(i);
			}
		}
		return 0;
		//tersdt
		
	}

}
