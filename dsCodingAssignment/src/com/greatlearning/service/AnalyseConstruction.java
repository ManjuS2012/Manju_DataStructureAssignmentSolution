package com.greatlearning.service;

import java.util.Stack;

public class AnalyseConstruction {

	public void compareFloor(int floorSize[], int totalFloors) {
		System.out.println("The order of construction as follows : ");

		int dayIndex;
		boolean isLast = false;
		int currentFloorSize = floorSize[0];
		Stack<Integer> pendingStack = new Stack<>();
		for (dayIndex = 0; dayIndex < totalFloors; dayIndex++) {
			int dayIs = dayIndex + 1;
			if (dayIndex + 1 < totalFloors) {
				if (currentFloorSize < floorSize[dayIndex + 1]) {
					pendingStack.push(currentFloorSize);
					System.out.println("\nDay : " + dayIs);
				} else {
					displayDetails(dayIs, floorSize, dayIndex, pendingStack, isLast);
				}
				currentFloorSize = floorSize[dayIndex + 1];
			} else {
				isLast = true;
				displayDetails(dayIs, floorSize, dayIndex, pendingStack, isLast);
			}
		}
	}

	public void displayDetails(int dayIs, int floorSize[], int dayIndex, Stack<Integer> pendingStack, boolean isLast) {
		System.out.println("\nDay : " + dayIs);
		System.out.print(floorSize[dayIndex] + " ");
		int pendingSize = pendingStack.size();
		if (pendingSize != 0) {
			for (int currentSize = 0; currentSize < pendingSize; currentSize++) {
				if (isLast) {
					System.out.print(pendingStack.pop() + " ");
				} else {
					int top = (int) pendingStack.peek();
					if (top > floorSize[dayIndex + 1])
						System.out.print(pendingStack.pop() + " ");
				}
			}
		}
	}

}
