package example;

public class EnahcedForDemo {
	public static void main(String[] args) {
		int[] numbers = {3, 1, 2, 5, 6};
		// enhanced for loop: for (type t : collection)
		for(int item : numbers) { // item = 3, item = 1, item = 2, item = 5, item = 6
			System.out.println(item);
		}
		System.out.println("-------------------------------------------------------------");
		int[][] array2D = {
				{20, 30, 40}, {10, 50, 60, 70}, {25, 35}
		};
		for(int outerIndex = 0; outerIndex < array2D.length; outerIndex++) {
			for(int innerIndex = 0; innerIndex < array2D[outerIndex].length; innerIndex++) {
				System.out.println("array2D["+outerIndex+"]["+innerIndex+"] = "+array2D[outerIndex][innerIndex]);
			}
			System.out.println("-------------------------------------------------------------------------------");
		}
		// try to use enhanced for loop to iterate array2D
		for(int[] array: array2D) {
			for(int item : array) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}
}
