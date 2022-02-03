package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.AnalyseConstruction;

public class Main {
// code to analyse the floors and days when can be deployed

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of floors in the building: ");
		int totalFloors = sc.nextInt();

		int floorSize[] = new int[totalFloors];
		for (int i = 0; i < totalFloors; i++) {
			int dayIs = i + 1;
			System.out.println("Enter the floor size given on day : " + dayIs);
			floorSize[i] = sc.nextInt();
		}

		AnalyseConstruction analyseCons = new AnalyseConstruction();
		analyseCons.compareFloor(floorSize, totalFloors);
		sc.close();
	}

}
