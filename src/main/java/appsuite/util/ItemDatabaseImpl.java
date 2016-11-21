package appsuite.util;

import java.util.Collection;
import java.util.Iterator;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;

//@Service
public class ItemDatabaseImpl implements ItemDatabase {

	@Override
	public void createItem(Item item) throws ServiceException {
		ItemSeedData.getSeedData().put(item.getItemId(), item);
	}

	@Override
	public Item getItemById(String id) throws ServiceException {
		return ItemSeedData.getSeedData().get(id);
	}

	@Override
	public void updateItem(Item item) throws ServiceException {
	}
/*
	@Override
	public void deleteItem(String id) throws ServiceException {
		Collection<Item> collectData = ItemSeedData.getSeedData().values();
		for (Iterator<Item> iter = collectData.iterator(); iter.hasNext();) {
			Item it = iter.next();
			if (it.getItemId().equals(id)) {
				iter.remove();
			}
		}
	}
*/

	@Override
	public void deleteItem(String id) throws ServiceException {
		ItemSeedData.getSeedData().remove(id);
	}

	@Override
	public Collection<Item> getItems() throws ServiceException {
		return ItemSeedData.getSeedData().values();
	}

}
