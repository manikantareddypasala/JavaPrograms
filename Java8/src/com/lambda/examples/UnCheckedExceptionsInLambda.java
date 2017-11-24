package com.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UnCheckedExceptionsInLambda {
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(45,5,7,9,0,12,45); 
		
		/** not a proper way to handle unchecked exception**/
		try {
		li.forEach( i -> System.out.println(100 / i));
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		
		/*output : 
			2
			20
			14
			11
			Exception occurred: java.lang.ArithmeticException: / by zero*/
		
		
		li.forEach( i -> {
		try {
			System.out.println(100 / i);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		});
		
		/*output:
			2
			20
			14
			11
			Exception occurred: java.lang.ArithmeticException: / by zero
			8
			2*/
		
		/** using wrapper method for generic purpose**/
		System.out.println();
		System.out.println("using wrapper method" );
		System.out.println();
		li.forEach( consumerWrapper(i -> System.out.println(100 / i)) );
		
		/*output:
			2
			20
			14
			11
			Exception occured: java.lang.ArithmeticException: / by zero
			8
			2*/
		
	}
	
	private static  <T> Consumer<T> consumerWrapper(Consumer<T> consumer){
		
		return j -> {
			
			try {
				consumer.accept(j);
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e);
			}
			
		};
		
	}
}
