package main;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao;
	
	static {
		itemGroupDao = new ItemGroupDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		show(itemGrpAll);
	}
	
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
