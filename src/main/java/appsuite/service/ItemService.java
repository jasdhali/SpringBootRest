package appsuite.service;

import java.util.Collection;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;

public interface ItemService {
	public Collection<Item> getItems() throws ServiceException;

	public Item getItem(String id) throws ServiceException;
}
