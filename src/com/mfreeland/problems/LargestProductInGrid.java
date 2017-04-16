package com.mfreeland.problems;

import java.util.ArrayList;

public class LargestProductInGrid {
/*
 * Project Euler Problem 11
 * Date: 2016-08-19
 * Author: Matt Freeland
 * 
 */
private long max = 1;
private ArrayList<Integer> grid;
private int rowLength;

public LargestProductInGrid(){
	grid = new ArrayList<Integer>();
	grid.add(1);
	grid.add(2);
	grid.add(3);
	grid.add(4);
	rowLength = 2;
}
public LargestProductInGrid(ArrayList<Integer> inputGrid, int mod){
	grid = inputGrid;
	rowLength = mod;
}
	public long checkUp(int locationInGrid){
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<4;i++){
			if((locationInGrid - i*this.rowLength) > 0)
				value = value*this.getGrid().get(locationInGrid - i*this.rowLength);
		}
		return value;
	}
	public long checkDown(int locationInGrid){
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<4;i++){
			if((locationInGrid + i*this.rowLength) < this.getGrid().size() )
				value = value*this.getGrid().get(locationInGrid + i*this.rowLength);
		}
		return value;
	}
	public long checkLeft(int locationInGrid){
		boolean fullCheck=true;
		int threshold=4;
		if(locationInGrid%this.rowLength<4){
			fullCheck=false;
			threshold=locationInGrid%this.rowLength; 
		}
		
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			if((locationInGrid - i) > 0)
				value = value*this.getGrid().get(locationInGrid - i);
		}
		return value;		
	}
	public long checkRight(int locationInGrid){
		boolean fullCheck=true;
		int threshold=4;
		if(this.rowLength - (locationInGrid%this.rowLength) <4){
			fullCheck=false;
			threshold=this.rowLength - (locationInGrid%this.rowLength); 
		}
		
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			if((locationInGrid + i) < this.getGrid().size())
				value = value*this.getGrid().get(locationInGrid + i);
		}
		return value;
	}
	public long checkDownRightDiag(int locationInGrid){
		boolean fullCheck=true;
		int threshold=4;
		if(this.rowLength - (locationInGrid%this.rowLength) <4){
			fullCheck=false;
			
			threshold=this.rowLength - (locationInGrid%this.rowLength); 
		}
		int currentPos = locationInGrid;
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			currentPos = locationInGrid + i*rowLength + i;
			if((currentPos) < this.getGrid().size())
				value = value*this.getGrid().get(currentPos);
		}
		return value;
	}
	public long checkUpLeftDiag(int locationInGrid){
		boolean fullCheck=true;
		int threshold=4;
		if((locationInGrid%this.rowLength) <4){
			fullCheck=false;
			threshold=(locationInGrid%this.rowLength); 
		}
		
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			if((locationInGrid - (i*rowLength - i)) > 0)
				value = value*this.getGrid().get(locationInGrid - (i*rowLength - i));
		}
		return value;
	}
	public long checkUpRightDiag(int locationInGrid){
		boolean fullCheck=true;
		int threshold=4;
		if(this.rowLength - (locationInGrid%this.rowLength) <4){
			fullCheck=false;
			threshold=this.rowLength - (locationInGrid%this.rowLength); 
		}		
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			if((locationInGrid - (i*rowLength + i)) > 0)
				value = value*this.getGrid().get(locationInGrid - (i*rowLength + i));
		}
		return value;
	}
	public long checkDownLeftDiag(int locationInGrid){
		boolean fullCheck=true;
		//this threshold will be used in the below for loop to determine how many values we need to check
		int threshold=4;
		if((locationInGrid%this.rowLength) <4){
			fullCheck=false;
			threshold=(locationInGrid%this.rowLength);
		}
		
		long value = this.getGrid().get(locationInGrid);
		for(int i=1;i<threshold;i++){
			if((locationInGrid + (i*rowLength - i)) < this.getGrid().size())
				value = value*this.getGrid().get(locationInGrid + i*rowLength - i);
		}
		return value;
	}
	public void determineMax(){
	  	for(int currentPosition=0;currentPosition<this.getGrid().size(); currentPosition++){
			long localMax1 = Math.max(this.checkUp(currentPosition), this.checkDown(currentPosition));
			long localMax2 = Math.max(this.checkLeft(currentPosition),this.checkRight(currentPosition));
			long localMax3 = Math.max(this.checkDownRightDiag(currentPosition),this.checkUpRightDiag(currentPosition));
			long localMax4 = Math.max(this.checkDownLeftDiag(currentPosition), this.checkUpLeftDiag(currentPosition));
			localMax1 = Math.max(localMax1,localMax2);
			localMax1 = Math.max(localMax1,localMax3);
			localMax1 = Math.max(localMax1, localMax4);
			this.setMax(Math.max(localMax1,this.getMax()));
			}
	}
	public long getMax(){
		
		return max;
	}
	public ArrayList<Integer> getGrid(){
		return this.grid;
	}
	public void setMax(long newMax){
		this.max=newMax;		
	}
}
