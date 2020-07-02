package util;


import java.time.LocalDate;

import lesson03_OOP.ItemDetail;
import view.Item;

public class ItemDetaileUtils {
	public static double getBill(ItemDetail itemDetail) {
		double result =0;
			Item[] items =itemDetail.getItems();
			LocalDate date=itemDetail.getDate();
			for(Item item:items) {
				double price=item.getPrice();
				if(itemDetail.getDate().isEqual(LocalDate.of(2020, 5, 5)) && price>5000000) {
					result= price*0.9;
				}
				result +=price;
			}
			return result;
		}

}
