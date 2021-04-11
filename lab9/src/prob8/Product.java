package prob8;

public class Product {
	private final String productId;
	private final String productName;
	private final double unitPrice;
	public Product(String prodId, String prodName, double price) {
		this.productId = prodId;
		this.productName = prodName;
		this.unitPrice = price;
	}
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
}
