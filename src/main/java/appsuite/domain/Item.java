package appsuite.domain;

public class Item {
	private String itemId;
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
