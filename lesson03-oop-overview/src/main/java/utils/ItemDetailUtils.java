package utils;

import java.time.LocalDate;

import beans.Item;
import beans.ItemDetail;

public class ItemDetailUtils {
	private ItemDetailUtils() {

	}

	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		LocalDate date = itemDetail.getDate();
		for (Item item : itemDetail.getItems()) {
			double price = item.getCost();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}