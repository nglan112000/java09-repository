package manipulation;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.swing.plaf.ListUI;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.FileUtils;
import utils.ListUtils;

import static utils.FileUtils.*;
public class Ex03 {
	private static final String pathname = "apple/data-serial.txt";
	private static AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		List<Apple> inventory = service.getAll();
		
		writeObject(file, inventory);
		open(file);
		
		//readObject(file).ifPresent(System.out::println);
		@SuppressWarnings({ "unused", "unchecked" })
		List<Apple> result =(List<Apple>) readObject(file).get();
		ListUtils.show(result);
		
		
		
	}
	
}