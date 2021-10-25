package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.service.BuildingConstruction;
import com.greatlearning.util.FloorException;

public class Driver {

	static int totalFloors;
	public static void main(String[] args) throws FloorException {
		Scanner scanner = new Scanner(System.in);
		BuildingConstruction construction = new BuildingConstruction();
		System.out.println("Enter the total no of Floors in the building");
		totalFloors = construction.getTotalFloors();
		int[] allfloors = construction.OrderOfFloorReceived(totalFloors);
		construction.ConstructionOrder(allfloors, totalFloors);
		scanner.close();
	}
}
