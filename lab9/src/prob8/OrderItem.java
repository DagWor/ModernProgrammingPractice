package prob8;

public class OrderItem {
	private final Product product;
	private final int quantityRequested;
	private final double totalPrice;
	//package level constructor
	OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantityRequested = quantity;
		totalPrice = product.getUnitPrice() * quantity;
	}
	@Override
	public String toString() {
		return "   " + product.getProductId() + ": " + quantityRequested + ", " + product.getUnitPrice();
	}
	public Product getProduct() {
		return product;
	}
	public int getQuantityRequested() {
		return quantityRequested;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
}
