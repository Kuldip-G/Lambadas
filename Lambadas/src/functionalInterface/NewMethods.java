package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import person.Person;

public class NewMethods {

	public static void main(String[] args) {
	List<Person> people = Arrays.asList(
			
			new Person("a","b",1),
			new Person("d","b",2),
			new Person("e","f",3),
			new Person("a","k",2),
			new Person("k","b",5),
			new Person("a","l",1)
			);
	

	
	//1. print All
	
	 printConditionlly(people, p -> true, p -> System.out.println(p));
	 
	 System.out.println();
	 //2. Sort with first name
	 
	 Collections.sort(people, (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
	
	 printConditionlly(people, p -> true, p -> System.out.println(p));
	
	 //3. With condition
	 printConditionlly(people, p -> p.getFirstName().startsWith("a"), p -> System.out.println(p));
	}
	 public static void printConditionlly(List<Person> people, Predicate<Person> p , Consumer<Person> c) {
		 for(Person pn : people) {
			 if(p.test(pn)) {
				// c.accept(p);
				 c.accept(pn);
			 }
		 }
	 
	}
}
