package sorting;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", "k", null, null, "1", "b", "2", "e" };
		//Arrays.sort(sequences);
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return -1;

				}
				if (o2 == null) {
					return 1;

				}
				return o1.compareTo(o2);

			}

		});
		ArrayUtils.printf(sequences);
	}
}
