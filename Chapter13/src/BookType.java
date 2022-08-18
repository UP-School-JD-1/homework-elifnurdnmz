public enum BookType {
    ACTION("ACTION"), FICTION("FICTION"), NONFICTION("NONFICTION"), SCINTIFIC("SCINTIFIC"), HORROR("HORROR");

    private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}