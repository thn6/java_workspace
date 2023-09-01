package day12;

public class Product {
	String menu;
	String price;
	int tmp = 0;

	Product() {

	}

	public Product(String menu, String price) {
		this.menu = menu;
		this.price = price;
	}

	void addMenu(String menu, String price) {
		this.menu = menu;
		this.price = price;
	}

	void printMenu() {
		System.out.println(menu + " : " + price);
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}