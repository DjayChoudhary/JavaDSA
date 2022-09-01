package arrays;

import java.util.Arrays;

public class CountEvenDigitNumbers {

	public static void main(String[] args) {

		int[] nums = { 2, 234, 4234, 5325335, 235342, 43 };

		int count = (int) Arrays.stream(nums).filter((int i) -> i % 2 == 0).count();

		System.out.println(count);
	}
}
