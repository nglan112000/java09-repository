package utils;

import java.time.LocalDate;

import beans.Item;
import beans.ItemDetail;

public class ItemDetailUtils {
	private ItemDetailUtils() {
	}
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItem();
		LocalDate date = itemDetail.getDate();
		// foreach
		for (Item item : items) {
			double price = item.getPrice();
			if (date.equals(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}