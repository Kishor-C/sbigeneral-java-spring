package example;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] departmentNames = {"IT", "Finance", "Sales", "HR"};
		System.out.println("Department name at 0th index: "+departmentNames[0]);
		System.out.println("Department name at 1st index: "+departmentNames[1]);
		// using index for 1 or 2 items is okay, but if you have more number of items use loop to start with 
		// index 0 till end of "array size - 1"
		for(int index = 0; index < departmentNames.length; index++) {
			System.out.println("Item at position: "+index+" is: "+departmentNames[index]);
		}
		// store some numbers in an array as 5, -1, 9, 10, 0, 25, 15
		// using for loop print sum of all numbers, print maximum number and print minimum number present in the array
		int[] numbers = {5, -1, 9, 10, 0, 25, 15};
		// expected output, Sum: 63, Min: -1, Max: 25
		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];
		for(int index = 0; index < numbers.length; index++) {
			sum = sum + numbers[index];
			if(numbers[index] < min) {
				min = numbers[index];
			}
			if(numbers[index] > max) {
				max = numbers[index];
			}
		}
		System.out.println("Sum: "+sum+", Min: "+min+", Max: "+max);
	}
}
