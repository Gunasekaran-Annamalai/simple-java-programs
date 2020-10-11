package assignment.one.mca;

import java.util.Scanner;

public class ConstructorProgram {
	static Scanner input = new Scanner(System.in);
	public ConstructorProgram(int ary[], int first, int last, int key) {

		int mid = (first + last)/2;
		while ( first <= last ) {
			if ( ary[mid] < key ) {
				first = mid + 1;
			} else if ( ary[mid] == key ) {
				System.out.println("Element found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last)/2; 
		}
		if ( first >last ) {
			System.out.println("Element is not found");
		}
	}
	
	public static void main(String[] args) {
		ArrayProgram arrayObject = new ArrayProgram();
		arrayObject.getInput();
		arrayObject.sortingArray();
		int key = 0;
		key = input.nextInt();
		@SuppressWarnings("unused")
		ConstructorProgram constructorObject = new ConstructorProgram(arrayObject.ary, 0, arrayObject.ary.length-1, key);
	}
}
