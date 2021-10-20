package com.greatlearning.service;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

import com.greatlearning.model.Floor;
import com.greatlearning.util.FloorComparator;


public class BuildingConstruction {
    /*
     * Stack to construct the building by pushing required floor
     * PriortyQueue To store and arrange the floors
     * 
     */
	
	Stack<Integer> storeFloorStack = new Stack<Integer>();  
	PriorityQueue<Integer> floorInOrder = new PriorityQueue<Integer>(new FloorComparator());   
	Scanner scanner = new Scanner(System.in);
	Floor floor = new Floor();
	

	// Function to get the order of the received
	public int[] OrderOfFloorReceived(int totalFloors) {
		int[] allFloors = new int[totalFloors];
		for (int i = 0; i < totalFloors; i++) {
			System.out.print("Enter the Floor size received on Day :" + (i + 1) + " ");
			int floorSizeReceived =scanner.nextInt();
			if(floorSizeReceived <=totalFloors && floorSizeReceived >= 1) {
				floor.setFloorSize(floorSizeReceived);
				allFloors[i] = floor.getFloorSize();
			}
			else throw new ArithmeticException("Floor size should be less than or equal to building height");
			
		}
		return allFloors;
	}

	// Function depicting the days on which construction occurs
	public void ConstructionOrder(int[] allFloors , int buildingSize) {
		System.out.println(" /The Order of the construction is as follows");
		int topFloor = buildingSize;
		for (int i = 0; i < buildingSize; i++) {
			int floorReceived = allFloors[i];
			floorInOrder.add(floorReceived);
			System.out.println();
			System.out.println("Day: " +(i+1));
			while(topFloor == floorInOrder.peek() && !floorInOrder.isEmpty()) {
			 System.out.print(" "+floorInOrder.poll());
			 topFloor--;
				
				  if(floorInOrder.peek()== null)
					  break;
				 
			}
		}
	}

}
