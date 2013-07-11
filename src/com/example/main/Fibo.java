package com.example.main;

public class Fibo {
	
	/**
	 * Recursive method to add the numbers and display the result 
	 * @param i the first number to be added
	 * @param j the second number to be added
	 * @throws InterruptedException interruption from sleep()
	 */
	public static void FiboRecur (int i, int j) throws InterruptedException {
		//Adding to go to the next number in the Fibonacci sequence
		int k = i+j;
		System.out.println(k);
		//Sleeping the thread for visibility
		Thread.sleep(2000);
		//Recalling the method and creating a recursive
		FiboRecur(j,k);
		
	}

	
	public static void main(String[] args) {
		
		// First we initialize both first numbers 
		int i = 0; System.out.println(i);
		int j = 1; System.out.println(j);
		try {
			//Then we call the method with the intial parameters
			FiboRecur(i,j);
		} catch (InterruptedException e) {
			System.out.println("Error with the sleep()");
		}

	}

}
