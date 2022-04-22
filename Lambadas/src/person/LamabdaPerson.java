package person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import person.OldWay.Condition;

public class LamabdaPerson {
	
	public static void main(String[] args) {
	List<Person> people = Arrays.asList(
			
			new Person("a","b",1),
			new Person("d","b",2),
			new Person("e","f",3),
			new Person("a","k",2),
			new Person("k","b",5),
			new Person("a","l",1)
			);

	
	
	//1. Print all 
	
	
	Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	//printLastNameSorted(people,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
	
	printCondtitionally(people, p -> true);
	
	printCondtitionally(people, p -> p.getLastName().startsWith("b"));
	
	}

	private static void printLastNameSorted(List<Person> people, Object object) {
		// TODO Auto-generated method stub
		
	}

	private static void printCondtitionally(List<Person> people, Predicate<Person> c) {
		// TODO Auto-generated method stub
		for(Person p : people ) {
			if(c.test(p))
				System.out.println(p);
			}
		
	}
}
