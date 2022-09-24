package part2chapter8q2;

public class Book {

	private String category;
	private String name;
	private String authorName;
	private int pageNumber;

	public Book(String category, String name, String authorName, int pageNumber) {
		this.category = category;
		this.name = name;
		this.authorName = authorName;
		this.pageNumber = pageNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String toString() {
		return getName() + " (" + pageNumber + " page number) " + " Written By: " + getAuthorName()
		+ "\n";
	}

	public int compareTo(Object o) {
		Book book = (Book) o;
		return name.compareTo(book.getName());
	}

}
