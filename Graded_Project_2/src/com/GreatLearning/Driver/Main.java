package com.GreatLearning.Driver;

import java.util.Scanner;
import com.GreatLearning.Service.FloorPlan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building ");
		int totFloors=sc.nextInt();
		
		FloorPlan fp=new FloorPlan(totFloors);
		
		//Inserting the floor counts & the floor sizes to the stack
		fp.push();
		
		System.out.println();
		System.out.println("\nThe order of construction is as follows");
		fp.pop2();

	}

}
