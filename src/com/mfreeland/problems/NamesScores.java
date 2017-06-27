package com.mfreeland.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.mfreeland.util.FileOperations;

public class NamesScores {
	
	private static String path = "C:\\workspaces\\eclipse_old\\ProjectEuler\\resources\\p022_names.txt";
	private static HashMap<String,Integer> nameValuesMap = new HashMap<String,Integer>();
	private static BigInteger valueOfNames = new BigInteger("0");
	private static ArrayList<String> names = readNamesFile(path);
	private static HashMap<Character,Integer> alphabetValueMap = new HashMap<Character,Integer>();
	private static ArrayList<Character> alphabet = new ArrayList<Character>() {{
		add('A');add('B');add('C');add('D');add('E');add('F');
		add('G');add('H');add('I');add('J');add('K');add('L');add('M');
		add('N');add('O');add('P');add('Q');add('R');add('S');
		add('T');add('U');add('V');add('W');add('X');add('Y');add('Z');
	}};
	public static void main(String [] args) {
		sortNames();
		populateAlphabetValueMap();
		calculateValueOfNames(names);
		System.out.println(calculateTotalValue());
		//System.out.println("Total Score: "+valueOfNames);
	}
	
	public static void calculateValueOfNames(ArrayList<String> names){
		Integer index = 1;
		for(String name:names){
			Integer score = calculateValue(name)*index; 
			nameValuesMap.put(name,score);
			System.out.println(name +": value="+calculateValue(name)+", position="+index +"--> ");
			System.out.println("Score: "+score);
			index++;
		}
		
	}
	
	private static Integer calculateTotalValue() {
		Integer value = 0;
		for(HashMap.Entry<String,Integer> entry : nameValuesMap.entrySet()) {
			//BigInteger test = new BigInteger(entry.getValue().toString());
			//System.out.println(test);
			value+=entry.getValue();
			//valueOfNames.add(test);
		}
		return value;
	}

	private static Integer calculateValue(String name) {
		Integer sum = 0;
		for(int i=0;i<name.length();i++){
			sum+=getCharactersValue(name.charAt(i));
		}
		return sum;
	}

	private static Integer getCharactersValue(char character) {
		return alphabetValueMap.get(character);
	}
	
	private static void populateAlphabetValueMap() {
		Integer value = 1;
		for (Character c:alphabet){
			alphabetValueMap.put(c,value);
			value++;
		}
	}
	
	public static ArrayList<String> readNamesFile(String path) {
		FileOperations fo = new FileOperations();
		return fo.readCommaSepFile(path);
	}
	
	private static void sortNames() {
		Collections.sort(names);
	}	
	
}
