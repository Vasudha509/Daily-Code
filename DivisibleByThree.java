// Java Program 
/* Array: You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3.
*/

import java.util.Scanner;

class DivisibleByThree {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) 
			array[i] = sc.nextInt();

		DivisibleByThree obj = new DivisibleByThree();
		System.out.print(obj.minimumOperations(array));
	}


	// Method to find the minimum operations required to check how many elements of array are not divisible by 3 and doing operation to make them to be divisible by 3.
	int minimumOperations(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			// check divisible by 3 or not
			if (nums[i] % 3 == 0) 
				continue;

			// if number is greater than 3, subtract 1 from it.
			else if (nums[i] > 3) {
				nums[i] -= 1;
				count++;
			}

			// if number is smaller than 3 add one to it.
			else {
				nums[i] =+ 1;
				count++;			
			}
		}
		return count;
	}
}