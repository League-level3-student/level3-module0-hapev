package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] s = new String[] { "H", "He", "Hel", "Hell", "Hello" };
		// 2. print the third element in the array
		System.out.println(s[3]);
		// 3. set the third element to a different value
		s[3] = "heck";
		// 4. print the third element again
		System.out.println(s[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (String s2 : s) {
			s2 = "heck";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String s2 : s) {
			System.out.println(s2);
		}

		// 7. make an array of 50 integers
		Integer s3[] = new Integer[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < s3.length; i++) {
			s3[i] = r.nextInt(400);
			System.out.println(s3[i]);

		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		System.out.println(Arrays.asList(s3).stream().mapToInt(Integer::intValue).min().getAsInt());
		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.
		System.out.println(Arrays.asList(s3).stream().mapToInt(Integer::intValue).max().getAsInt());
		// 12. print only the last element in the array
		System.out.println(s3[49]);

	}
}
