package web;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import domain.Item;
import service.ItemServiceImpl;

@RestController
public class ItemController {

	//@Autowired(required=false)
	private ItemServiceImpl itemService = new ItemServiceImpl();

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public ResponseEntity<Collection<Item>> getAssets() {
		Collection<Item> items = null;
		try {
			items = itemService.getItems();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RestClientException(ex.getMessage());
		}
		return new ResponseEntity<Collection<Item>>(items, HttpStatus.OK);
	}
	
	

}
