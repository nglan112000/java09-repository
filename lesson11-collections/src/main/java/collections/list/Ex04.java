package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import collections.utils.CollectionUtils;

import static collections.utils.CollectionUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Nam", "Hoang", "Teo", "Nguyen");

		Collections.reverse(students);
		Collections.shuffle(students);
		printf(students);

		System.out.println("contains: " + students.contains("Nam"));
	}

}