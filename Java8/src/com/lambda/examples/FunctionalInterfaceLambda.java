package com.lambda.examples;

import com.functional.interfaces.InterfaceWithArguments;
import com.functional.interfaces.InterfaceWithReturnType;
import com.functional.interfaces.InterfaceWithVoid;

public class FunctionalInterfaceLambda {

	public static void main(String args[]) {

		InterfaceWithVoid iwv = new InterfaceWithVoid() {
			public void test() {

				System.out.println("testing void method using annonomus inner class");
			}
		};
		iwv.test();

		InterfaceWithVoid iwv1 = () -> System.out.println("testing void method using lambda");
		iwv1.test();
		
		String name = "mani";
		
		InterfaceWithArguments iwa = name1 -> System.out.println("good morning " + name1);
		
		iwa.test(name);
		
		InterfaceWithReturnType iwrt = (String name1) -> {
			System.out.println("good morning " + name1);
			
			return name1;
			
		};
		
		System.out.println(iwrt.test(name));
		}
		
}
