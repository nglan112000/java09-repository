package service;
import java.util.List;
import persistence.Item;
public interface ItemService {
	List<Item> getAll();
	Item get(int id);
	
}