package com.mfreeland.problems;
import java.util.ArrayList;


public class FibonacciSequence {

	protected ArrayList<Integer> generateFibonacciList(int threshold){
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		int small = 0;
		int large = 1;
		int sum;
		while(large<threshold){
			sum = small+large;
			small = large;
			large = sum;
			list.add(small);
		}
		return list;
		
	}
	protected void printFibonacciList(ArrayList<Integer> list){
		System.out.println("Your Fibonacci Sequence: ");
		for(Integer i: list){
			System.out.print(i+" ,");
		}
		System.out.println();
	}
		
	
}
