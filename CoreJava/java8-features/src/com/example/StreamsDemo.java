package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		List<String> stringsList = Arrays.asList("Hello", "Welcome", "Eclipse", "Thank You", "Hi", "Hey", "I");
		// above list if we want to filter based on size, sort, print then we can do in one line with the help of stream
		stringsList
		.stream()
		.filter(s -> s.length() > 3)
		.sorted((s1, s2) -> s2.compareTo(s1))
		.forEach(s -> System.out.println(s));
		System.out.println("___________Stream Doesn't modify existing collection_____________________");
		// filter items based on size, sort and add to the new List<String>
		List<String> anotherList = stringsList
				.stream()
				.filter(s -> s.length() < 5)
				.sorted((s1, s2) -> s2.compareTo(s1))
				.collect(Collectors.toList());
		System.out.println("____________Iterating the new List______________");
		anotherList.forEach(s -> System.out.println(s));
	}
}
