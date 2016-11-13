package util;

import java.util.HashMap;
import java.util.Map;

import domain.Item;

public class ItemSeedData {
	public static Map<String,Item> seedData=new HashMap<String, Item>();
	
	static {
		
		Item i1 = new Item("1","OO-CAT001-1",10);
		Item i2 = new Item("2","OO-CAT001-2",5);
		Item i3 = new Item("3","OO-CAT001-3",11);
		Item i4 = new Item("4","OO-CAT001-1",100);
		Item i5 = new Item("5","OO-CAT001-2",101);
		Item i6 = new Item("6","OO-CAT001-3",3);
		Item i7 = new Item("7","OO-CAT001-1",40);
		
		seedData.put(i1.getItemId() , i1 );
		seedData.put(i2.getItemId() , i2 );
		seedData.put(i3.getItemId() , i3 );
		seedData.put(i4.getItemId() , i4 );
		seedData.put(i5.getItemId() , i5 );
		seedData.put(i6.getItemId() , i6 );
		seedData.put(i7.getItemId() , i7 );		
	
	}
	
	public static Map<String, Item> getSeedData() {
	
		return seedData;
	
	}
	
	public static void setSeedData(Map<String, Item> seedData) {
	
		ItemSeedData.seedData = seedData;
	
	}
}
