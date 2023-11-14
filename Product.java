package core;

import java.util.Objects;

public class Product {
	private Integer pId;
	private String name;
	private double quantity;
	private Double price;
	private Category category;
	
	
	public Product(Integer pId, String name, double quantity, Double price, Category category) {
		super();
		this.pId = pId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(pId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
		Product p = (Product) obj;
		return pId.equals(p.pId);
	}
		return false;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", category="
				+ category + "]";
	}
}
