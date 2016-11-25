package appsuite.service;

import java.util.Collection;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;

public interface ItemService {
	public Collection<Item> getItems() throws ServiceException;
	public Item getItem(long id) throws ServiceException;
	public void deleteItem(long id) throws ServiceException;
	public void addItem(Item item) throws ServiceException;
	public void updateItem(Item item) throws ServiceException;
}
