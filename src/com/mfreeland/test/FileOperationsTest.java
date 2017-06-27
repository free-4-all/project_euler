package com.mfreeland.test;

import com.mfreeland.util.FileOperations;

public class FileOperationsTest {

	public static String path = "C:\\workspaces\\eclipse_old\\ProjectEuler\\resources\\p022_names.txt";
	
	public static void main(String [] args) {
		FileOperations fo = new FileOperations();
		for (String s:fo.readCommaSepFile(path))
			System.out.println(s);
	}
}
