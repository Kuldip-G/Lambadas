package oldMethods;

public class TypeInterface {

	static void printLength(Stringlen len) {
		System.out.println(len.findlen("Kuldip"));
	}
	
	public static void main(String[] args) {
		
		//String s = "Kuldip";
		printLength( s-> s.length());
		
	}
	
	interface Stringlen {
		int findlen(String s);
	}
	
}
