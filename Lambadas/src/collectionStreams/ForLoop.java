package collectionStreams;

import java.util.Arrays;
import java.util.List;

import person.Person;

public class ForLoop {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("a","b",1),
				new Person("d","b",2),
				new Person("e","f",3),
				new Person("a","k",2),
				new Person("k","b",5),
				new Person("a","l",1)
				);
		
		
		people.forEach(System.out::println);
		
		people.stream()
		.filter((p) -> p.getFirstName().startsWith("a"))
		.forEach((p) -> System.out.println(p.getFirstName()))	;
		
		
		
	}
	
	
}
