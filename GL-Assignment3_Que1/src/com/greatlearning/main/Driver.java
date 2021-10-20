package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.BuildingConstruction;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BuildingConstruction construction = new BuildingConstruction();
		System.out.println("Enter the total no of Floors in the building");
        int totalFloors = scanner.nextInt();
        int[] allfloors = construction.OrderOfFloorReceived(totalFloors);
        construction.ConstructionOrder(allfloors, totalFloors);
        scanner.close();
	}
	
	

}
