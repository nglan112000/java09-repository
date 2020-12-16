package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Predicate;


import bean.Student;
public class Ex06 {
	public static void main(String[] args) {
		List<Student> students = getItems();
		Student user=new Student(1,"Join");
		System.out.println("contains: "+students.contains(user));
		students.removeIf(student ->student.equals(user));
		System.out.println("size: "+students.size());
		System.out.println("=============sorting==============");
		//collections.sort:comparable, comparator
		//list#sort 
	Comparator<Student> comp=comparing(student->student.getId());
	students.sort( comp.thenComparing(student->student.getName(),reverseOrder()));;
	students.forEach(student ->System.out.println(student));
	
	}

	private static List<Student> getItems() {
		return new ArrayList<>(List.of(
				new Student(1, "Nam"), 
				new Student(13, "Nam"),
				new Student(8, "Le"), 
				new Student(13, "Ngoc"),
				new Student(16, "Dung")));

	}
}