package util;

import java.util.Collection;

import domain.Item;
import exceptions.ServiceException;

public interface ItemDatabase {
	public void createItem(Item item) throws ServiceException;
	public Item getItemById(String id) throws ServiceException;
	public void updateItem(Item item) throws ServiceException;
	public void deleteItem(String id) throws ServiceException;
	public Collection<Item> getItems() throws ServiceException;
}
