package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	
	private static AppleService service;
	private static List<Apple> inventory;
	
	static {
		service = new AppleServiceImpl();
		inventory = service.getAll();
	}
	public static void main(String[] args) {
		List<Integer> ids = inventory.stream()
				.map(Apple::getId)
				.map(String::length)
				.collect(Collectors.toList());
		ids.stream().forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 rô", "3 bích", "4 chuồn"),
				Arrays.asList("4 rô", "5 bích", "7 chuồn"),
				Arrays.asList("3 rô", "8 bích", "2 chuồn")
				);
		List<String> result = cards.stream()
			.flatMap(Collection::stream)
			.filter(card -> card.startsWith("2"))
			.collect(Collectors.toList());
		result.forEach(System.out::println);
		
	}
}