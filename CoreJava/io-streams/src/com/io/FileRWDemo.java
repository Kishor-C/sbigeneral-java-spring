package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileRWDemo {

	public static void main(String[] args) {
		try {
			// read the file demo.txt
			FileReader reader = new FileReader("demo.txt");
			// write the file hello.txt, it is created while writing if doesn't exists
			FileWriter writer = new FileWriter("hello.txt");
			// because reader.read() returns int we need to use int variable
			int data = 0; // variable to store the character
			// loop counter to find out how many times the read/write happens
			int loopCounter = 0;
			// read the character, compare it with -1 to know EOF, write the character till EOF
			while( (data = reader.read()) != -1 ) {
				loopCounter++;
				// write the data to the file
				writer.write(data); // writes the data that is read by reader
			}
			// flush the stream and close all the resources
			writer.flush();
			writer.close();
			reader.close();
			System.out.println("Loop Counter: "+loopCounter);
			System.out.println("Done read and write!"); 
			// Run the program and refresh the project you must see hello.txt
		} catch(Exception e) {
			System.err.println(e);
		}
	}

}
