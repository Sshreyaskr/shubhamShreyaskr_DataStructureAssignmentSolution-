package com.GreatLearning.Service;

import java.util.Scanner;

public class FloorPlan {

	static int currentPointer;
	int floors[];
	static int j = 0, k = 0;
	static Scanner sc = new Scanner(System.in);

	public FloorPlan() {

	}

	public FloorPlan(int floorCount) {
		// TODO Auto-generated constructor stub
		currentPointer = -1;
		floors = new int[floorCount];
	}

	public void push() {
		if (currentPointer >= floors.length - 1) {
			System.out.println("Stack Overflow");
			return;
		} else {

			for (int i = 0; i < floors.length; i++) {
				System.out.println("enter the floor size given on day : " + (i + 1));
				floors[++currentPointer] = sc.nextInt();
			}

		}

	}

	int pop() {
		if (currentPointer < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = floors[currentPointer--];
			// System.out.println(currentPointer);
			return x;
		}
	}

	public int maxValue(int x, int[] arr) {
		int max = arr[x];
		int maxIndex = 0;

		for (int i = x; i < arr.length; i++) {
			if (x >= 0) {
				if (arr[i] > max) {
					max = arr[i];
					maxIndex = i;
				}
			} else {
				break;
			}

		}

		return maxIndex;
	}

	public void pop2() {
		j = maxValue(k, floors);

		for (int i = k; i < floors.length; i++) {

			if (i != j && i < j) {
				System.out.println("Day: " + (i + 1));
				System.out.print(" ");
			}

			else if (i != j && i > j) {

				System.out.println("Day: " + (i + 1));
				System.out.print(floors[i] + " ");
			} else {
				System.out.println("Day: " + (j + 1));
				for (int l = j; l >= 0; l--) {
					System.out.print(floors[l] + " ");
				}
			}
			System.out.println();
		}

	}

}
