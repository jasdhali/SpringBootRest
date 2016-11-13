package appsuite.util;

import java.util.Collection;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;

//@Service
public class ItemDatabaseImpl implements ItemDatabase {

	@Override
	public void createItem(Item item) throws ServiceException {
		// TODO Auto-generated method stub
		ItemSeedData.getSeedData().put(item.getItemId(), item);
	}

	@Override
	public Item getItemById(String id) throws ServiceException {
		return ItemSeedData.getSeedData().get(id);
	}

	@Override
	public void updateItem(Item item) throws ServiceException {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteItem(String id) throws ServiceException {
		/*
		 * Collection<Item> collectData = ItemSeedData.getSeedData().values();
		 * for(Iterator<Item> iter : collectData.iterator() ){ if( item.equals(
		 * id ) ){
		 * 
		 * } }
		 */
	}

	@Override
	public Collection<Item> getItems() throws ServiceException {
		// TODO Auto-generated method stub
		return ItemSeedData.getSeedData().values();
	}

}
