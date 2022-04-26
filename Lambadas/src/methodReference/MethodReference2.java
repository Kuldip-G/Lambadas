package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import person.Person;

public class MethodReference2 {
	
	public static void main(String[] args) {
	
	List<Person> people = Arrays.asList(
			
			new Person("a","b",1),
			new Person("d","b",2),
			new Person("e","f",3),
			new Person("a","k",2),
			new Person("k","b",5),
			new Person("a","l",1)
			);

	
	printAll(people, p -> true, System.out::println);
	
	
	}

	private static void printAll(List<Person> people, Predicate pred, Consumer consume) {
		// TODO Auto-generated method stub
		for(Person p : people) {
			if(pred.test(p)) {
				consume.accept(p);
			}
		}
	}
}
