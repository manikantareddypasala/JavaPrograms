package com.lambda.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CheckedExceptionsInLambda {

private static BufferedWriter bw;
private static FileWriter fw;
final static String FILENAME = "E:\\test\\filename.txt";

public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(45,5,7,9,0,12,45); 
		
		
		/** handling inside lambda function **/
		li.forEach( i -> {
			
			try {
				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
				bw.write(i);
			} catch (IOException e) {
				System.out.println("Exception occurred: " + e);
			}
		});

		/** handling using separate method **/
		
		li.forEach( i -> writeTofile(i));
		
	}

	private static void writeTofile(Integer i) {
		
		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(i);
		} catch (IOException e) {
			System.out.println("Exception occurred: " + e);
		}
		
	}
	

	

}
