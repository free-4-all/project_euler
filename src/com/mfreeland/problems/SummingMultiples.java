package com.mfreeland.problems;

import java.util.ArrayList;

// Project Euler - Problem 1 
// 20160329
public class SummingMultiples {
	
	
	protected int generateSum(int n1,int n2,int threshold){
		int localsum = 0;
		
		for(int i=0;i<threshold;i++){
			if(i%n1==0){
				localsum=localsum+i;	
			}
			else if(i%n2==0){
				localsum=localsum+i;
			}
		}
		return localsum;
	}
	protected int generateSum(int n1,ArrayList<Integer> list){
		int localsum = 0;
		
		for(Integer i: list){
			if(i%n1==0){
				localsum=localsum+i;	
			}
		}
		return localsum;
	}
	
}
