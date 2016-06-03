package app;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Example {

	
	/**
	 * <p> Main method </p>
	 * 
	 * Выводит число, возвращаемое методом {@link #getInt() getInt}
	 * 
	 * @param args Параметры 
	 */
	public static void main(String[] args) {
		String s = "fdgdfgdfg";
		
		int i = getInt();
		
		System.out.println(i);
	}
	
	
	
	/**
	 * 
	 * 
	 * @return Число 4
	 */
	public static int getInt(){
		return 22;
	}
	
	public static int permutate(int i) {
		return i+33;
	}

}
