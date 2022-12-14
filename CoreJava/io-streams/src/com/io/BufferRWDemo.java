package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferRWDemo {
	public static void main(String[] args) {
		try {
			// read file
			FileReader fileReader = new FileReader("demo.txt");
			// load file content to buffer
			BufferedReader bufferReader = new BufferedReader(fileReader);
			// write file
			FileWriter fileWriter = new FileWriter("test.txt");
			// write buffer content to file
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			String line = null;
			// create a loop counter and increment in while loop
			int loopCounter = 0;
			while( (line = bufferReader.readLine()) != null) {
				bufferWriter.write(line);
				bufferWriter.newLine(); // creates a new line on each write
				loopCounter++;
			}
			// print the loop counter
			System.out.println("Loop counter: "+loopCounter);
			bufferWriter.flush();
			bufferWriter.close();
			bufferReader.close();
			System.out.println("Done read and write");
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
