package com.lambda.examples;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import com.sample.objects.Employee;

	public class MethodReferenceLambda {

		public int compareTest(Employee o1, Employee o2) {

			return o1.getName().compareTo(o2.getName());

		}
		
		public static int compareTestNew(Employee o1, Employee o2) {

			return o1.getName().compareTo(o2.getName());

		}

		public static void main(String[] args) {

			Employee e1 = new Employee("mani", "it");
			Employee e2 = new Employee("hello", "hardware");
			Employee e3 = new Employee("bolo", "support");
			Employee e4 = new Employee("apple", "maintanace");

			MethodReferenceLambda lc = new MethodReferenceLambda();

			List<Employee> l1 = new ArrayList<Employee>();

			l1.add(e1);
			l1.add(e2);
			l1.add(e3);
			l1.add(e4);
			System.out.println("before sorting");

			l1.forEach(System.out::println);

			System.out.println("after sorting=--------------------------------------");

			/** using lambda **/
			Collections.sort(l1, (o1, o2) -> o1.getName().compareTo(o2.getName()));
			l1.forEach(System.out::println);

			/**
			 * using instance method reference - and type inference (no need to provide the
			 * data types and return types compiler will automatically identifies)
			 **/
			Collections.sort(l1, lc::compareTest);
			l1.forEach(System.out::println);
			
			/**
			 * using instance method reference **/
			Collections.sort(l1, MethodReferenceLambda::compareTestNew);
			l1.forEach(System.out::println);
			

		}

}
