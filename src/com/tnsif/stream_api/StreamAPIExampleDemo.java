package com.tnsif.stream_api;
import java.util.Arrays;
import java.util.List;
public class StreamAPIExampleDemo {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Sanjay","Vikas","Sai Sravan","Bharath");
		
		names.stream().forEach(name-> System.out.println("Good Morning "+name));
		
		List<Integer> numbers =Arrays.asList(10,1,35,40,50,60);
		
		System.out.println("Even Numbers...");
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
	}

}
