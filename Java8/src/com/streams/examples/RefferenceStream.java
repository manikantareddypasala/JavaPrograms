package com.streams.examples;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RefferenceStream {

	public static void main(String[] args) {

		// since we can't reuse the stream once consumed.so convert stream to
		// collection and convert that collection when ever needed.

		List<String> l1 = Stream.of("mani", "test", "hello", "hey").filter(i -> i.contains("e"))
				.collect(Collectors.toList());

		l1.stream().forEach(System.out::println);

		Optional<String> op1 = l1.stream().findFirst();
		Optional<String> op2 = l1.stream().findAny();

		System.out.println(op1.get() + " : " + op2.get());
	}

}
