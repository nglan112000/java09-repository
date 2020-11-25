package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collections.utils.ListUtils.*;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> firstIds = Arrays.asList(1,2,3,4,5);
		List<Integer> secondIds = Arrays.asList(4,5,6,7,8);
		List<Integer> addAll = new ArrayList<Integer>(firstIds);
		addAll.addAll(secondIds);
		
		List<Integer> removeAll = new ArrayList<Integer>(firstIds);
		removeAll.removeAll(secondIds);
		
		List<Integer> retainAll = new ArrayList<Integer>(firstIds);
		retainAll.retainAll(secondIds);
		
		printfInt(addAll);  // hop
		printfInt(removeAll);  // hieu
		printfInt(retainAll);  // giao
		
		
	}
}
