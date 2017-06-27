package com.mfreeland.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperations {
	
	//pass file in with double slashes:
	// C:\\path\\to\\read\\file.txt
	
	private final String defaultType = "String";
	
	public ArrayList readFile(String path) {
		return readLineSepFile(path, defaultType);
	}
	
	public ArrayList<String> readCommaSepFile(String path) {
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<String> fileContents = new ArrayList<String>();
		String csvSplitBy = ",";

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				String [] currentLine = sCurrentLine.split(csvSplitBy);
				
				for (String s:currentLine) {
					s = stripQuotes(s);
					fileContents.add(s);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileContents;
	}

	
	private String stripQuotes(String s) {
		return s.substring(1, s.length()-1);
	}

	public ArrayList readLineSepFile(String path, String type) {
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList fileContents;
		switch (type){
			case "String":
				fileContents = new ArrayList<String>();
				break;
			case "int":
			case "Int":
			case "Integer":
				fileContents = new ArrayList<String>();
				break;
			default:
				fileContents = new ArrayList<String>();
		}
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileContents;
	}
	
}
