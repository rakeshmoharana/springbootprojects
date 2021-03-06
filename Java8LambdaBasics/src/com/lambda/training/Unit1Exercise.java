package com.lambda.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// #Step 1 Sort List by Last Name
	sortByLastName(people);
		
		// Step 2 Create a method that prints all elements in the list
//		printAll(people);
		
		//Step 3 Create a method that prints all people last name beiginning with c
//		printAllBegginningWithC(people);
		
	}

	private static void sortByLastName(List<Person> people) {
		// TODO Auto-generated method stub
		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		System.out.println(people);
	}

	private static void printAllBegginningWithC(List<Person> people) {
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(System.out::println);
	}

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		people.forEach(System.out::println);
	}
}
