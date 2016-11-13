package service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import domain.Item;
import exceptions.ServiceException;
import util.ItemDatabase;
import util.ItemDatabaseImpl;

@Service
public class ItemServiceImpl {
	private ItemDatabase itemDatabase = new ItemDatabaseImpl();

	public Collection<Item> getItems() throws ServiceException {
		return itemDatabase.getItems();
	}

	public Item getItem(String id) throws ServiceException{
		Collection<Item> data = itemDatabase.getItems();
		/* Stream<Item> element  = data.stream().filter( it -> it.getItemId().equals(id) );
		 return element.findFirst();*/
		return itemDatabase.getItemById(id);
	}
}
