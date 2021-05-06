package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
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
		System.out.println("igrsSize: " + igrList.size());
//		
//		
//		
//		igrList.forEach(igr -> {
//			System.out.println("igr size: " + igr.getItems().size());
//		});

//		System.out.println("===========================");
//
//		List<Item> itList = itemService.getAll();
//		itList.forEach(System.out::println);
//		
//		ItemGroup ig = itList.get(1).getItemGroup();
//		
//		System.out.println("====================================");
//		
//		Item  item = itemService.get(5);
//		System.out.println("item id = 5: " + item);
		

//		List<ItemDto> result = itemService.getItemsDtos();
//		result.forEach(System.out::println);
		
//		Item item = itemService.get(1);
//		System.out.println(item);
		
		
		//Session: openSession
		//GET => No Transaction
		//SAVE + No Transaction => No execution
		//		+ Yes Transaction => execute query (error or non)
		//Transaction: contains Sessions: rollback, 
		Item item1 = new Item(100, "Áo", "Trắng", "Vải", 200d, 150d, igrList.get(1));
		itemService.save(item1);
	}
}
