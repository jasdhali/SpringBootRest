package service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import domain.Item;
import exceptions.ServiceException;


public interface ItemService {
	public Collection<Item> getItems() throws ServiceException;
}
