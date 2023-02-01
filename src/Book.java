public class Book {
    private String nameOfBook;
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