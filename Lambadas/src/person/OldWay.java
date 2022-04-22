package person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OldWay {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("a","b",1),
				new Person("d","b",2),
				new Person("e","f",3),
				new Person("a","k",2),
				new Person("k","b",5),
				new Person("a","l",1)
				);
		
	//1 Sort the people with last names.
		
		printLastNameSorted(people);
		
		printPersonList(people);
		
		System.out.println();
		
		printPersonWithOnlyFirstNameA(people);
		
		System.out.println();
		
		printWithCondition(people,new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("b");
			}
			
		});
		
				
	}

	private static void printWithCondition(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.test(p)) {
				System.out.println(p);
			}
			
		}
		
	}

	private static void printPersonWithOnlyFirstNameA(List<Person> people) {
		for(Person p : people) {
			if(p.getFirstName().startsWith("a")) {
				System.out.println(p);
			}
			
		}
		
	}

	private static void printPersonList(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
		
	}

	private static void printLastNameSorted(List<Person> people) {
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});
		
	}
	
	
	
	interface Condition{
		boolean test(Person p);
	}

}
