package week1.day2;

import java.util.Arrays;

public class SortAsc {

	public static void main(String[] args) {

		int empID[] = { 1, 2, 3, 4, 5, 8, 6, 9, 7, 10 };
		Arrays.sort(empID);

		for (int id : empID) {
			System.out.println(id);
		}
		System.out.println("Length of array" + empID.length);
		for (int i = empID.length - 1; i >= 0; i--) {
			System.out.println(empID[i]);
		}

	}

}
