package app.book;

public class FictionBook extends Books {
	private String category;

	public FictionBook() {
	}

	public FictionBook(String bockCode, String name, double price, String author, String category) {
		super(bockCode, name, price, author);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
