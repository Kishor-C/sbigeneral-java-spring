package com.example;

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "hello1234";
		String s2 = "hello1234";
		String s3 = "hello";
		String s4 = "1234";
		String s5 = s3.concat(s4);
		
		System.out.println("s1 = "+s1+", s2 = "+s2);
		System.out.println("s3 = "+s3+", s4 = "+s4+", s5 = "+s5); // s3 value doesn't change after concat
		System.out.println("(s1 == s2) = "+(s1 == s2)); // true
		System.out.println("(s1 == s5) = "+(s1 == s5)); // false
		System.out.println("s1 equals s5 = "+s1.equals(s5)); // true
		
		// Using StringBuffer, equals() is not overridden in StringBuffer
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println("sb1 = "+sb1+", sb2 = "+sb2+", (sb1 equals sb2) = "+sb1.equals(sb2));
		sb1.append("1234");
		System.out.println("sb1 = "+sb1);// hello1234
	}
}
