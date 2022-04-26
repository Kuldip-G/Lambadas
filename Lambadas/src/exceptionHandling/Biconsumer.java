package exceptionHandling;

import java.util.function.BiConsumer;

public class Biconsumer {
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		int key =0;
		
		 process(arr,key, wrapperLamabda((x, k) -> System.out.println(x / k)));
//			 try {
//			System.out.println(x/k);
//			 } catch(Exception e) {
//				 System.out.println("cant devide by zero");
//			 }
//			 
//		});
	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		for(int x: arr) {
		consumer.accept(x,key);
		}
	}

	
	//Instead of handling try catch in calling lamabda function we can use a 
	// generic lamabada wrapper 
	
	private static BiConsumer<Integer,Integer> wrapperLamabda(BiConsumer<Integer, Integer> consumer){
		
		//consumer.accept(x,k);
		return (x,k) -> {
		try {
			//System.out.println(x+y);
			consumer.accept(x, k);
		} catch(Exception e) {
			System.out.println("exception caught");
		}
		};
	}
}
