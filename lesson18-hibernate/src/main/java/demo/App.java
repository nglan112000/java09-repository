package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> igrList = itemGroupService.getAll();
		igrList.forEach(System.out::println);
		
		igrList.forEach(itemGroup -> {
			System.out.println(System.identityHashCode(itemGroup.getItems().size()));
		});
		
		System.out.println("=====================");
		
//		List<ItemDto> itemDtos = itemService.getItemDtos();
//		System.out.println(itemDtos);
		
//		Item item = itemService.get(1);
//		System.out.println(item);
		ItemGroup itemGroup = new ItemGroup(1, "Áo");
		Item item = new Item(11, "IT1", "yellow", "Silk", 200d, 100d, "2.txt", itemGroup);
		itemService.save(item);
		
//		List<Item> itemList = itemService.getAll();
//		itemList.forEach(System.out::println);
	}
}
