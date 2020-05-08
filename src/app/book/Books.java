package app.book;

public abstract class  Books {
	private String bockCode;
	private String name;
	private double price;
	private String author;

	public Books(){}

	public Books(String bockCode, String name, double price, String author) {
		this.bockCode = bockCode;
		this.name     = name;
		this.price    = price;
		this.author   = author;
	}

	public String getBockCode() {
		return bockCode;
	}

	public void setBockCode(String bockCode) {
		this.bockCode = bockCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
