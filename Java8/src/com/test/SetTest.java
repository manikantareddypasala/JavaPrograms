package com.test;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sample.objects.Product;

public class SetTest {
	
	
	public static void main(String args[]) {
	
	List<Product> p1 = Arrays.asList(new Product(10, "apple"), new Product(20, "orange"), 
			new Product(30, "banana"), new Product(20, "grapes"),new Product(30, "kiwi"));
	
	Set<Product> set1 = new HashSet<>();
	
	p1.forEach(i -> set1.add(i));
	
	//set1.forEach(System.out::println);
	
	List<String> l1 = Arrays.asList("mani", "hello", "bye");
	 List<String> storeIdList = new ArrayList<>();
	 
	 storeIdList.addAll(l1);
	 storeIdList.forEach(System.out::println);
	
	int index = storeIdList.indexOf("mani");
	
	System.out.println("---------------" + index);
	
	storeIdList.remove(index);
	
	System.out.println("---------------");
	
	storeIdList.forEach(System.out::println);
	
	System.out.println("---------------" + ZonedDateTime.now());
	System.out.println("---------------" + new Timestamp(System.currentTimeMillis()));
	
	}

}
