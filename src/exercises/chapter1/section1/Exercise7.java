package exercises.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;


public class Exercise7 {

	public static void main(String[] args) {
		// This is a simple implementation of the Newton's method, a famous algorithm for finding the
		// square
		// roots of numbers.
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001)
			t = (9.0 / t + t) / 2.0;
		StdOut.printf("%.5f\n", t);

		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		StdOut.println(sum);

		int sum2 = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum2++;
		StdOut.println(sum2);
	}
}
