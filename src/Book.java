public class Book {
    private String nameOfBook;
    private Author author;

    private int yearOfPublication;

    public Book(String nameOfBook, Author author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfBook() { return this.nameOfBook; }
    public Author getAuthor() { return author; }
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
        return "Книга - " + getNameOfBook() + ", автор - " + getAuthor() +
                ". Это произведение было опубликовано в " + getYearOfPublication() + " году";
    }
}