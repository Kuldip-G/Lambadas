package methodReference;

public class MethodReference {

	public static void main(String[] args) {
		
		//Thread t = new Thread(() -> doProcess());
		MethodReference m = new MethodReference();
		Thread t = new Thread(m::doProcess);
		t.start();
		
		
		
	}
	
	public  void doProcess() {
		System.out.println("Doing some process");
	}
	
	
}
