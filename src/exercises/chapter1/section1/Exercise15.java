package exercises.chapter1;

import java.util.HashMap;
import java.util.Map;

public class Exercise15 {
	public static void main(String[] args) {
		int m = 5;
		int[] argArr = new int[] {1, 1, 1, 2, 2};
		int[] a = new int[m];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < argArr.length; i++) {
			map.put(argArr[i], map.getOrDefault(argArr[i], 0) + 1);
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = map.getOrDefault(i, 0);
			System.out.println(a[i]);
		}
	}
}
