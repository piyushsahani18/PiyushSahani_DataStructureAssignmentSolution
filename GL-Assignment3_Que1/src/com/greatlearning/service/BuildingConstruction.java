package com.greatlearning.service;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import com.greatlearning.model.Floor;
import com.greatlearning.util.FloorComparator;

public class BuildingConstruction {

	Stack<Integer> storeFloorStack = new Stack<Integer>();
	PriorityQueue<Integer> floorInOrder = new PriorityQueue<Integer>(new FloorComparator());
	Set<Integer> duplicateFloor = new HashSet<Integer>();

	Scanner scanner = new Scanner(System.in);
	Floor floor = new Floor();
	int FloorNumber;

	public int getTotalFloors() {
		int floors = scanner.nextInt();
		return floors;
	}

	public int[] OrderOfFloorReceived(int totalFloors) throws FloorException {
		int[] allFloors = new int[totalFloors];
		for (int i = 0; i < totalFloors; i++)
			try {
				{
					System.out.print("Enter the Floor size received on Day :" + (i + 1) + " ");
					FloorNumber = scanner.nextInt();
					if (FloorNumber <= totalFloors && FloorNumber >= 0) {
						floor.setFloorSize(FloorNumber);
						allFloors[i] = floor.getFloorSize();
						if (duplicateFloor.add(allFloors[i]) == false) {
							System.out.println("\n\n Duplicate floor arrived of size: **" + allFloors[i] + "**  on day :"
									+ (i + 1));
							System.out.println("Kindly return and replace  and construct again - \n" + "");
							i--;
							continue;
						}

					} else
						throw new FloorException();
				}
			} catch (FloorException e) {
				// TODO Auto-generated catch block
				System.out.println("\n\n--- Return the Floor and Construct again ! ---");
				i--;
				continue;
			}
		return allFloors;
	}

	public void ConstructionOrder(int[] allFloors, int buildingSize) {
		System.out.println("The Order of the construction is as follows");
		int topFloor = buildingSize;
		for (int i = 0; i < buildingSize; i++) {
			int floorReceived = allFloors[i];
			floorInOrder.add(floorReceived);
			System.out.println();
			System.out.println("Day: " + (i + 1));
			while (topFloor == floorInOrder.peek() && !floorInOrder.isEmpty()) {
				System.out.print(" " + floorInOrder.poll());
				topFloor--;

				if (floorInOrder.peek() == null)
					break;

			}
		}
	}

}
