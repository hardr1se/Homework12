public class Book {
    private String nameOfBook;
    public static class Author {
        private String firstNameOfAuthor;
        private String lastNameOfAuthor;
        public Author(String firstNameOfAuthor, String lastNameOfAuthor) {
            this.firstNameOfAuthor = firstNameOfAuthor;
            this.lastNameOfAuthor = lastNameOfAuthor;
        }
        public String getLastNameOfAuthor() { return this.lastNameOfAuthor; }
        public String getFirstNameOfAuthor() { return this.firstNameOfAuthor; }
        @Override
        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Author second = (Author) obj;
            return getFirstNameOfAuthor().equals(second);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(lastNameOfAuthor, firstNameOfAuthor);
        }
        @Override
        public String toString() {
            return getLastNameOfAuthor() + " " + getFirstNameOfAuthor();
        }
    }
    private int yearOfPublication;
    public Book(String nameOfBook, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.yearOfPublication = yearOfPublication;
    }
    public String getName() { return this.nameOfBook; }
    public int getYearOfPublication() { return this.yearOfPublication; }
    public void setYearOfPublication(int yearOfPublication) { this.yearOfPublication = yearOfPublication; }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (!(obj instanceof Book)) return false;

        Book book = (Book) obj;

        if (yearOfPublication != book.yearOfPublication) return false;
        return nameOfBook != null ? nameOfBook.equals(book.nameOfBook) : book.nameOfBook != null;
    }
    @Override
    public int hashCode() {
        int results = yearOfPublication;
        results = 31 * results + (nameOfBook != null ? nameOfBook.hashCode() : 0);
        return results;
    }
    @Override
    public String toString() {
        return "Книга - " + getName() + " была опубликована в " + getYearOfPublication() +
                " году, написал это произведение ";
    }
}