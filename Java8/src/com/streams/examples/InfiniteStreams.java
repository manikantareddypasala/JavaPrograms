package com.streams.examples;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		
		List<Integer> l1 = Stream.iterate(0, i-> i+2).limit(10).collect(Collectors.toList());
		
		l1.forEach(i -> System.out.println(i));
		
		
		List<UUID> l2 = Stream.generate(UUID :: randomUUID).
				skip(10).//skips first 10 records
				limit(10).//limits output to 10 reocrds
				collect(Collectors.toList());
		
		l2.forEach(i -> System.out.println(i));

	}

}
