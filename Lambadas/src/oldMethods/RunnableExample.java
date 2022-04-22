package oldMethods;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("inside run method.");
			}
			
		});
		//thread.run();
		//thread.start();
		
		Thread newThread = new Thread(()-> System.out.println("inside lambada thread method"));
		thread.run();
		newThread.run();
	}
}
