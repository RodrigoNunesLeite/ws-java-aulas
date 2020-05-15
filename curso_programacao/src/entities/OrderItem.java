package entities;

public class OrderItem {
	private Integer quantity;
	
	private Product118 product = new Product118();
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product118 product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	public Product118 getProduct() {
		return product;
	}

	public void setProduct(Product118 product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * product.getPrice();
	}
	
}
