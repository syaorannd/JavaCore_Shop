package shop.model;
// TNN-TODO : Maybe make this class to abstract class or interface.
// Do this later!

public class Product {
	private String name;
	private int cost;
	private String imgSrc;
	private int numOfProduct;
	// Constructor
	public Product(String name, int cost, String imgSrc, int num) {
		this.name = name;
		this.cost = cost;
		this.imgSrc = imgSrc;
		this.numOfProduct = num;
	}
	// Setter for just variables can change (cost & number of product).
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setNumOfProduct(int num) {
		this.numOfProduct = num;
	}
	
	// Getter for each property
	public String getName() {
		return this.name;
	}
	public int getCost() {
		return this.cost;
	}
	public String getImgSrc() {
		return this.imgSrc;
	}
	public int getNumPro() {
		return this.numOfProduct;
	}
}

