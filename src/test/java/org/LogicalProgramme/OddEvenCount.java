package org.LogicalProgramme;

public class OddEvenCount {
	public static void main(String[] args) {
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				evencount = evencount + 1;

			} else {
				oddcount = oddcount + 1;
			}
		}

		System.out.println("Total even number count is " + evencount);
		System.out.println("Total odd number count is " + oddcount);

	}

}
