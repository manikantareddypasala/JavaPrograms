package com.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sample.objects.Product;

public class CreatingParallelStream {

	public static void main(String[] args) {

		List<Product> p1 = Arrays.asList(new Product(10, "apple"), new Product(20, "orange"), new Product(30, "banana"),
				new Product(20, "grapes"), new Product(30, "kiwi"));

		/** Parallel stream from collections **/
		Stream<Product> sp = p1.parallelStream();

		boolean test = sp.isParallel();

		System.out.println(test);
		
		/** Parallel stream from intStream, longStream, doubleStream **/
		
		IntStream intStreamParllel = IntStream.range(1, 100).parallel();
		
		boolean test2 = intStreamParllel.isParallel();
		System.out.println(test2);
		
		/** Parallel stream to sequential stream **/
		
		Stream<Product> seqStream = sp.sequential();
		
		boolean test1 = seqStream.isParallel();
		
		System.out.println(test1);
		
	}

}
