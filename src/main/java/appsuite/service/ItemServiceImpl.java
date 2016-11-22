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
		/*
		 * Stream<Item> element = data.stream().filter( it ->
		 * it.getItemId().equals(id) ); return element.findFirst();
		 */
		return itemDatabase.getItemById(id);
	}
	
	public void deleteItem(String id) throws ServiceException{
		itemDatabase.deleteItem(id);
	}
	
	public void addItem(Item item) throws ServiceException{
		itemDatabase.createItem(item);
		
	}
	
	public void updateItem(Item item) throws ServiceException{
		Item existintItem = getItem(item.getItemId() );
		if( existintItem==null) throw new ServiceException("Item with id "+ item.getItemId() +" does not exist.");
		existintItem.copyAttributes(item);
		//itemDatabase.createItem(item);
	}
}
