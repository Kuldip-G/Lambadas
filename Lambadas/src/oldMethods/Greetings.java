package oldMethods;

import oldMethods.Greeter;
public class Greetings {

	
	public static void main(String[] args) {
		
		Greetings g = new Greetings();
		
		PerformGreeting perf = new PerformGreeting();
		
		Greeter lambadafunction =()-> System.out.println("Hola");
		
		Greeter annonClass = new Greeter() {
			public void perform() {
				System.out.println("Mushi Mushi");
			}
		};
		
		
		
		g.greet(annonClass);
	}

	public void greet(Greeter perf) {
		perf.perform();
		
	}
}
