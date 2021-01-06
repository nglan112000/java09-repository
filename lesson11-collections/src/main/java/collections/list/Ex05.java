package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import collections.utils.CollectionUtils;

import static collections.utils.CollectionUtils.*;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> firstIds = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> secondIds = Arrays.asList(4, 5, 6, 7, 8);

		List<Integer> addAll = new ArrayList<>(firstIds);
		addAll.addAll(secondIds);

		List<Integer> removeAll = new ArrayList<>(firstIds);
		removeAll.removeAll(secondIds);

		List<Integer> retainAll = new ArrayList<>(firstIds);
		retainAll.retainAll(secondIds);

		printf(addAll);
		printf(removeAll);
		printf(retainAll);// Giao
		List<Object> list = Arrays.asList("");
		printfwc(list);
	}
}