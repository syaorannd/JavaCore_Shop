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
	public Product() {
		this.name = "";
		this.cost = 0;
		this.numOfProduct = 0;
		this.imgSrc = "";
	}
	// Setter for just variables can change (cost & number of product).
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setNumOfProduct(int num) {
		this.numOfProduct = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setImgSrc(String img) {
		this.imgSrc = img;
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

