package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		// Using scanner enter an item, if that item is found in the stringSet print Found else print Not Found
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an item to search");
		String input = scanner.next();
		boolean found = false;
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("hello"); // will be stored
		stringSet.add("hello"); // will not be stored
		stringSet.add("welcome"); // will be stored
		System.out.println("Size: "+stringSet.size()); // 2
		// to iterate you can use Iterator interface
		Iterator<String> iterate = stringSet.iterator();
		while(iterate.hasNext()) { // hasNext() checks if next item is present
			String item = iterate.next(); // refers to the next item and returns it
			System.out.println("Item: "+item);
			if(item.equals(input)) {
				found = true;
				break;
			} 
		}
		if(found)
			System.out.println(input+ " Found");
		else 
			System.out.println(input+ " Not Found");
		scanner.close();
	}
}
