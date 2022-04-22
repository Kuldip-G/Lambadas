package person;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(String p, String l, int a) {
		this.firstName=p;
		this.lastName=l;
		this.age=a;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}
	
	public void setFirstName(String p) {
		this.firstName=p;
	}
	
	public void setLastName(String l) {
		this.lastName=l;
	}

	public void setAge(int a) {
		this.age=a;
	}
}
