package com.lambda.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.objects.Employee;

public class ForEach {
	
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("mani", "it");
		Employee e2 = new Employee("hello", "hardware");
		
		/** for each for list **/
		List<Employee> l1= new ArrayList<Employee>();
		
		l1.add(e1);
		l1.add(e2);
		
		l1.forEach(System.out::println);
		
		/** for each for MAP **/
		Map<String , Employee> m1 = new HashMap<String, Employee>();
		
		m1.put(e1.getName(), e1);
		m1.put(e2.getName(), e2);
		
		
		m1.forEach((k,v) -> System.out.println( v));
	}

}
