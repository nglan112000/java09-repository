package stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex06NumericStream {
	private static AppleService service;
	static {
		service = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		//apple find apple with max highest weight
		List<Apple> inventory = service.getAll();
		OptionalDouble optional = inventory.stream()
		.mapToDouble(Apple::getWeight)
		.max();
		System.out.println(optional.orElse(Double.MIN_VALUE));
	}
 
}
