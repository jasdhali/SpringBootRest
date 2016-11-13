package appsuite.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;
import appsuite.util.ItemDatabase;
import appsuite.util.ItemDatabaseImpl;

@Service
public class ItemServiceImpl implements ItemService {
	
	//@Autowired
	private ItemDatabase itemDatabase=new ItemDatabaseImpl();

	public Collection<Item> getItems() throws ServiceException {
		return itemDatabase.getItems();
	}

	public Item getItem(String id) throws ServiceException {
		Collection<Item> data = itemDatabase.getItems();
		/*
		 * Stream<Item> element = data.stream().filter( it ->
		 * it.getItemId().equals(id) ); return element.findFirst();
		 */
		return itemDatabase.getItemById(id);
	}
	
	public void deleteItem(String id) throws ServiceException{
		itemDatabase.deleteItem(id);
	}
}
