public class Book {
    Author author;
    String title;
    BookType type;

    public Book(Author author, String title, BookType type) {
        this.author = author;
        this.title = title;
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type.getDescription();
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public void getInfo() {
        System.out.println("Book: " + author.name + " , " + title + " , " + type.getDescription());
    }
}