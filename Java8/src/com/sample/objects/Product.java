package com.sample.objects;

public class Product {
	
	int price;
	String name;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name: " +  this.name + " price: " +  this.price;
	}
	
	 @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		return true;
	}

	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + price;
			return result;
		}
	
}
