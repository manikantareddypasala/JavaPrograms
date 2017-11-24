package com.streams.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sample.objects.Product;

public class CollectApiExamples {
	
	public static void main(String args[]) {
		
		List<Integer> l1 = Arrays.asList(10, 20, 30, 4, 5);
		
		List<String> l2 = Arrays.asList("mani", "hello", "bye", "zelo");
		
		List<Product> p1 = Arrays.asList(new Product(10, "apple"), new Product(20, "orange"), 
				new Product(30, "banana"), new Product(20, "grapes"),new Product(30, "kiwi"));
		
		/** stream to collection **/
		streamToCollection(l1);
		
		/** stream to string **/
		streamToString(l2);
		
		/** getting Avg And Stats From Stream **/
		gettingAvgAndStatsFromStream(p1);
		
		/** group by in Streams **/
		groupByInStream(p1);
		
		/** Partitioning in streams **/
		partitioningInStream(p1);
		
		/** from collector performing another transformation.
		 * creating a set from collector and then creating a unmodifiable set from it **/
		 tranformationsInCollector(p1);
	}

	private static void tranformationsInCollector(List<Product> p1) {
		java.util.Set<Product> transform = p1.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		 
		 transform.forEach(System.out::println);
	}

	private static void partitioningInStream(List<Product> p1) {
		Map<Boolean, List<Product>> par = p1.stream().collect(Collectors.partitioningBy(p -> p.getPrice() > 20));
		
		par.forEach((k, v) -> {
			
			System.out.println(k + "  " + v);
			
		});
		
		/** sample out put 
		 * 
			false  [name: apple price: 10, name: orange price: 20, name: grapes price: 20]
			true  [name: banana price: 30, name: kiwi price: 30]
		 */
	}

	private static void groupByInStream(List<Product> p1) {
		Map<Integer, List<Product>> grp = p1.stream().collect(Collectors.groupingBy(Product::getPrice));
		
		grp.forEach((k, v) -> {
			
			System.out.println(k + "  " + v);
			
		});
		
		/** sample out put 
		 * 
			20  [name: orange price: 20, name: grapes price: 20]
			10  [name: apple price: 10]
			30  [name: banana price: 30, name: kiwi price: 30]
		 */
	}

	private static void gettingAvgAndStatsFromStream(List<Product> p1) {
		//************note: no need to use map for below functions.
		
		/** stream to average int **/
		
		// we have average double, average long functions also available
		double d1 = p1.stream().collect(Collectors.averagingInt(Product::getPrice));
		
		System.out.println(d1);
		
		/** stream to summing int, summing double and summing long also available **/
		
		Integer d2 = p1.stream().collect(Collectors.summingInt(Product::getPrice));
		
		System.out.println(d2);
		
		// these below methods provides you Statistics 
		/** stream to summarizing int, summarizing double and summarizing long also available **/
		
		IntSummaryStatistics sum1 = p1.stream().collect(Collectors.summarizingInt(Product::getPrice));
		
		System.out.println(sum1);
		
		//sample output:::: IntSummaryStatistics{count=3, sum=60, min=10, average=20.000000, max=30}
		
		//************note: no need to use map for below functions.
	}

	private static void streamToString(List<String> l2) {
		String s1 = l2.stream().map(i -> i+ " p ").collect(Collectors.joining());
		String s2 = l2.stream().map(i -> i+ " p ").collect(Collectors.joining("::")); //delimiter
		
		//delimiter, prefix, suffix
		String s3 = l2.stream().map(i -> i+ " p ").collect(Collectors.joining(",", "( ", ")"));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

	private static void streamToCollection(List<Integer> l1) {
		
		/** stream to collection **/
		List<Integer> l3 = l1.stream().filter(i -> (i % 10 == 0)).collect(Collectors.toList());
		List<Integer> l4 = l1.stream().map(i -> (i *2)).collect(Collectors.toList());

		l3.forEach(i -> System.out.println(i));
		l4.forEach(i -> System.out.println(i));
	}
	

}
