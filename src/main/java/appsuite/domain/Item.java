package appsuite.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author jaspal
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Item {
	@JsonProperty(value="id")
	@Id
	private long id;
	
	@JsonProperty(value="sku")
	//@Column(name="SKU")
	private String sku;
	
	@Column(name="REORDERQUANTITY")
	private int reorderQuantity;

	public Item() {
		super();
	}

	public Item(long itemId, String sku, int reorderQuantity) {
		super();
		this.id = itemId;
		this.sku = sku;
		this.reorderQuantity = reorderQuantity;
	}

	public void copyAttributes(Item itemIn) {
		this.sku = itemIn.getSku();
		this.reorderQuantity = itemIn.getReorderQuantity();
	}

	public Long getId() {
		return id;
	}

	public void setItemId(long itemId) {
		this.id = itemId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String itemSku) {
		this.sku = itemSku;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
}