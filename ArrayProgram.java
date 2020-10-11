package assignment.one.mca;

import java.util.Scanner;

public class ArrayProgram {
	int[] ary = new int[5];
	Scanner input = new Scanner(System.in);
	
	void getInput() {
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = input.nextInt();
		}
	}
	
	void sortingArray() {
		int temp = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
	}

	void printArray() {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayProgram arrayObject = new ArrayProgram();
		arrayObject.getInput();
		arrayObject.sortingArray();
		arrayObject.printArray();
	}
}
