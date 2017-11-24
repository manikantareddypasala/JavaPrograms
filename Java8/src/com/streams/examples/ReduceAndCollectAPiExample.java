package com.streams.examples;

import java.util.Arrays;
import java.util.List;

public class ReduceAndCollectAPiExample {

	public static void main(String args[]) {

		List<Integer> li = Arrays.asList(10, 20, 30, 4, 5);

		/**
		 * reduce method have 3 variations, 
		 * 1. only accumulator function -- return optional 
		 * 2. Initial value if stream is empty, accumulator 
		 * 3. Initial value if stream is empty, accumulator, combiner  -- used with parallel stream only
		 * 
		 * combiner: aggregates the results of accumulator , it is called only
		 * in parallel mode
		 * 
		 **/
		
		System.out.println(li.stream().reduce((x, x1) -> x + x1));
		//output : Optional[69]
		System.out.println(li.stream().reduce((x, x1) -> x + x1).get()); 
		
		// get is a method of optional to get the value with "optional" string in output
		
		//output: 69
		System.out.println(li.stream().reduce(0, (x, x1) -> x + x1));
		
		
		int ki = li.parallelStream().reduce(0, (x, x1) -> x + x1, (y,y1) -> {
			System.out.println("combiner called for the values "+ y + " , " + y1 + " and sum is "+ (y+y1));
			return y+y1;
		});
		
		System.out.println("--------"+ ki);

		
	}

}
