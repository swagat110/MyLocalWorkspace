package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = Arrays.asList(
				new Person("Andrew", "Young", 41),
				new Person("Wakanda", "Nayak", 32),
				new Person("Charles", "Dickens", 56),
				new Person("Pitha", "Becky", 38),
				new Person("Lincoln", "Adams", 26),
				new Person("Maniks", "Coyote", 29)
				);
		
		//display the list
		//displayConditionally(list,p -> true,p -> System.out.println(p));
		list.stream()
		.sorted((p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
		.forEach(System.out::println);
				
		
		//sort the persons on the basis of last namegggg
		Collections.sort(list, (p1,p2) -> p1.lastName.compareTo(p2.lastName));
		
		System.out.println();
		//display the list
		displayConditionally(list,p -> true,p -> System.out.println(p));
		
		//sort on basis of age
		Collections.sort(list, (p1,p2) -> p1.getAge() - p2.getAge());
		
		System.out.println();
		//display the list
		displayConditionally(list,p -> true,p -> System.out.println(p));
		
	
		System.out.println();
		//display all people with last name starting with B
		displayConditionally(list, p -> p.lastName.startsWith("A"), p -> System.out.println(p));

	}

	private static void displayConditionally(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for(Person person : list) {
			if(predicate.test(person))
				consumer.accept(person);
		}
		
	}


}
