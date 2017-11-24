package com.streams.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreatingStreamsExample {
	
	public static void main(String args[]) throws IOException {
		
		List<Integer> li = Arrays.asList(45,5,7,9,0,12,45);
		
		/** empty stream **/
		Stream s5 = Stream.empty();
		
		/** stream from collection**/
		Stream<Integer> s3 = li.stream();
		
		
		/** stream from full array and partial array**/
		String[] str = new String[] {"a","b","c"};
		
		Stream s1 = Arrays.stream(str);
		
		Stream s11 = Arrays.stream(str, 1,2);
		
		Stream s2 = Stream.of("a","b","c");
		
		/** stream from builder, even we can add generic's to this.**/
		
		Stream s6 = Stream.builder().add("Z").add("a").add("huu").build();
		/** using generic's**/
		Stream<String> s7 = Stream.<String>builder().add("Z").add("a").add("huu").build();
		
		/** stream from generator**/
		
		Stream<String> s8 = Stream.generate(() -> "mani").limit(10);
		s8.forEach(System.out::println);
		
		/** stream from iterator**/
		List<Integer> l1 = Stream.iterate(0, i-> i+2).limit(10).collect(Collectors.toList());
		
		/** stream from primitives**/ /**LongStream , DoubleStream also have with same methods **/
		
		/** include 1 and exclude 3**/
		IntStream s9 = IntStream.range(1,3);
		/** include 1 and include 3**/
		IntStream s10 = IntStream.rangeClosed(1,3);
		
		/**Stream from Random class started from java 8. so many methods but listed one method below**/
		
		Random r = new Random();
		
		IntStream is = r.ints(10);
		LongStream ls = r.longs(10);
		DoubleStream ds = r.doubles(10);
		
		
		/**Stream from Strings **/
		
		//since there is no interface called "char stream" it will returns intStream
		IntStream is1 = "maniknatareddy".chars();
		
		/** stream from file **/
		
		Path p = Paths.get("C:\\Users\\manikantar\\Desktop\\new files\\new-pos-data1.csv");
		
		
		Stream<String> lines = Files.lines(p);
		
		//lines.forEach(System.out::println);
		
		
		lines.forEach(i -> {
			
			String[] arr = i.split(",");
			
			Arrays.stream(arr).forEach(System.out::println);
			
		});
	}

}
