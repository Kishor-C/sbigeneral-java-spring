package com.example;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("test");
		System.out.println(sb); // test
		
		sb.append("1234");
		System.out.println(sb); // test1234
		
		sb.insert(3, "xyz"); // it inserts string from 3rd position, excludes 3rd position
		System.out.println(sb); // tesxyzt1234
		
		sb.delete(3, 6); // it deletes from position 3 to position 6, excludes 3 and includes 6
		System.out.println(sb); // test1234
	}
}
