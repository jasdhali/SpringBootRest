package controller;
import java.util.Collection;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import domain.Item;
import exceptions.ServiceException;
import service.ItemServiceImpl;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
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

    public static void main(String[] args) throws Exception {
    	//Object[] sources = {Example.class,ItemController.class};
        //SpringApplication.run(Example.class, args);
    	//SpringApplication.run( sources , args);
    	SpringApplication app = new SpringApplication( Example.class );
    	app.setBannerMode( Banner.Mode.OFF );
    	app.run( args );
    }
    /*
    private static SpringApplication getSpringApplication(){
    	SpringApplication app = new SpringApplication( );
    	return app;
    }*/
    
    @RequestMapping(value="/items/{id}", method=RequestMethod.GET)
    public ResponseEntity<Item> getItem(@PathVariable("id") String id) throws ServiceException{
    	Item asset = itemService.getItem( id );
        return new ResponseEntity<Item>( asset , HttpStatus.OK );
    }

/*    @RequestMapping(value="/items", method=RequestMethod.POST)
    public ResponseEntity<Item> createAsset(@RequestBody Item item) {
    	Item newItem = itemService.createAsset(asset);
        return new ResponseEntity<Asset>(newAsset, HttpStatus.OK);
    }
*/
}