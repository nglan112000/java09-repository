package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	@Override
	public List<ItemGroup> get() {
		return itemGroupDao.get();
	}
}