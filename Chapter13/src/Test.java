public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.printBookTypes();
        test.changeBookTypes();
        test.printBookTypes();
        System.out.println();

        Reader reader = new Reader("Elifur","Dönmez", 24, 'W');
        reader.getInfo();

        Author author = new Author("George Orwell");
        author.getInfo();

        Book book = new Book(author, "1984", BookType.NONFICTION);
        book.getInfo();

    }

    private void changeBookTypes() {
        System.out.println("Changing.....");
        BookType.ACTION.setDescription("ACTION");
        BookType.FICTION.setDescription("FICTION");
        BookType.NONFICTION.setDescription("NONFICTION");
        BookType.SCINTIFIC.setDescription("SCINTIFIC");
        BookType.HORROR.setDescription("HORROR");
    }

    public void printBookTypes() {
        System.out.print("Book Types : ");

        for (BookType bookType : BookType.values()) {
            System.out.print(bookType.getDescription() + ", ");
        }
        System.out.println();
    }

}