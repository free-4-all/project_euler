package com.mfreeland.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class AmicableNumbers {
	
	private static HashMap<Integer,ArrayList<Integer>> numberDivisorMap = new HashMap<Integer,ArrayList<Integer>>();
	private static HashMap<Integer,Integer> numberDivisorSumMap = new HashMap<Integer,Integer>();
	private static HashMap<Integer, Boolean> amicableNumberMap = new HashMap<Integer,Boolean>(); 
	
	private static Integer threshold = 10000;
	
	public static void main(String [] args) {
		populateProperDivisorMap(threshold);
		populateDivisorSumMap();
		//printNumbersAndDivisors();
		printNumbersAndDivisorSum();
		populateAmicablePairsMap();
		//printAmicablePairs();
		System.out.println((sumOfAmicablePairs()));
	}
	
	public static void populateProperDivisorMap(Integer threshold) {
		for (int i = 2; i<=threshold; i++) {
			numberDivisorMap.put(i,determineDivisors(i));
			//is 1 possibly an amicable number? I don't think so
			amicableNumberMap.put(i,false);
		}
	}
	
	public static ArrayList<Integer> determineDivisors(Integer i) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for (int j = i-1; j > 0; j--) {
			if (i%j == 0)
				divisors.add(j);
		}
		return divisors;
	}
	
	public static void printNumbersAndDivisors() {
		for (HashMap.Entry<Integer,ArrayList<Integer>> entry : numberDivisorMap.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			for (Integer divisor : entry.getValue()) {
				System.out.print(divisor+", ");
			}
			System.out.println();
		}
	}
	
	public static void populateDivisorSumMap() {
		int sum;
		for (HashMap.Entry<Integer,ArrayList<Integer>> entry : numberDivisorMap.entrySet()) {
			sum = 0;
			for (Integer divisor : entry.getValue()) {
				sum+=divisor;
			}
			numberDivisorSumMap.put(entry.getKey(),sum);
		}
	}
	
	public static void printNumbersAndDivisorSum() {
		for (HashMap.Entry<Integer,Integer> entry : numberDivisorSumMap.entrySet()) {
			System.out.println("Key: "+entry.getKey()+", Sum: "+entry.getValue());
		}
	}

	public static void populateAmicablePairsMap() {
		//I don't need to keep track of what a number's amicable pair is, just whether or not it is an amicable pair.
		for (HashMap.Entry<Integer,Integer> entry : numberDivisorSumMap.entrySet()) {
			Integer amicablePartner = amicablePair(entry.getKey()); 
			
			if(amicablePartner > 0) {
				
				amicableNumberMap.put(entry.getKey(),true);
				amicableNumberMap.put(amicablePartner,true);
			}
		}
	}
		
	public static Integer amicablePair(Integer A) {
		Integer amicablePair = -1;
		Integer dOfA = (numberDivisorSumMap.containsKey(A)? numberDivisorSumMap.get(A) : -1);
		Integer B = dOfA;
		Integer dOfB = (numberDivisorSumMap.containsKey(B)? numberDivisorSumMap.get(B) : -1);
		if((dOfA > 0) && (dOfB > 0)) {
			if((dOfA.equals(B)) & (dOfB.equals(A)) && (!A.equals(B))) {
				//System.out.println("Amicable Pair! A: "+A+", B: "+B);
				amicablePair = B;
			}	
		}
		return amicablePair;
	}
	
	public static void printAmicablePairs() {
		for (HashMap.Entry<Integer,Boolean> entry : amicableNumberMap.entrySet()) {
			if (entry.getValue()) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static Integer sumOfAmicablePairs() {
		Integer sum = 0;
		for (HashMap.Entry<Integer,Boolean> entry : amicableNumberMap.entrySet()) {
			if (entry.getValue()) {
				sum+=numberDivisorSumMap.get(entry.getKey());
			}
		}
		return sum;
	}
}
