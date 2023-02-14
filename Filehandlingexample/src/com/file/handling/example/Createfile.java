package com.file.handling.example;
import java.io.File;
import java.io.IOException;

public class Createfile {
	public static void main(String[] args) {
	File f1 = new File("/home/shaikhjunaidghg/java-phase1/Sample.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println("File " +f1.getName() +"is created successfully");
			}
		}
		catch(IOException e) {
			System.out.println("Exception is occured during file creation");
		}
	}


}

