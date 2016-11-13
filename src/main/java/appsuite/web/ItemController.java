package appsuite.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import appsuite.domain.Item;
import appsuite.exceptions.ServiceException;
import appsuite.service.ItemService;
import appsuite.service.ItemServiceImpl;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService = new ItemServiceImpl();

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public ResponseEntity<Collection<Item>> getItems() {
		Collection<Item> items = null;
		try {
			items = itemService.getItems();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RestClientException(ex.getMessage());
		}
		return new ResponseEntity<Collection<Item>>(items, HttpStatus.OK);
	}

	@RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
	public ResponseEntity<Item> getItem(@PathVariable("id") String id) throws ServiceException {
		Item asset = itemService.getItem(id);
		return new ResponseEntity<Item>(asset, HttpStatus.OK);
	}

}
