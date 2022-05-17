package edu.n6.exercise_2;


public class GenericMethods {
	
	public static <T> void printArguments (T t1, T t2, T t3) {
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
