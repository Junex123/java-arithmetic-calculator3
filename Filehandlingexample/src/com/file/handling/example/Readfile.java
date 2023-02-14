package com.file.handling.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
	public static void main(String[] args) {
		File f1 = new File("/home/shaikhjunaidghg/java-phase1/Sample.txt");
		try {
			Scanner filereader = new Scanner(f1);
			while (filereader.hasNextLine()) {
				String filedata = filereader.nextLine();
				System.out.println(filedata);
			}
		}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	


