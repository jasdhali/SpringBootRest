package appsuite.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author jaspal
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
	@JsonProperty(value="item_id")
	private String itemId;
	@JsonProperty(value="item_sku")
	private String itemSku;
	private int reorderQuantity;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemId, String itemSku, int reorderQuantity) {
		super();
		this.itemId = itemId;
		this.itemSku = itemSku;
		this.reorderQuantity = reorderQuantity;
	}

	public void copyAttributes(Item itemIn) {
		this.itemSku = itemIn.getItemSku();
		this.reorderQuantity = itemIn.getReorderQuantity();
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemSku() {
		return itemSku;
	}

	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

}
