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
		ArrayList<Integer> list = new ArrayList<>();
		list.add(i);
		list.add(i);
		
		System.out.println(i);
	}
	
	
	
	/**
	 * 
	 * 
	 * @return Число 4
	 */
	public static int getInt(){
		return 543435;
	}
	
	public static int permutate(int i) {
		if(i > 9999) {
			throw new IllegalArgumentException();
		} else if (i > 0) {
			return i+777;
		} else {
			return i-777;
		}
	}

}
