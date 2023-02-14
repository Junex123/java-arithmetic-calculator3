package com.file.handling.example;
import java.io.FileWriter;
import java.io.IOException;
public class Writefile {
	public static void main(String[] args) {
		try {
		FileWriter fwriter = new FileWriter("/home/shaikhjunaidghg/java-phase1/Sample.txt");
		fwriter.write("Practice makes man perfect");
		fwriter.close();
		System.out.println("the content has successfully written");
	}
		catch(IOException e) {
			System.out.println("Unexpected error occured");
			e.printStackTrace();
		}

}
}