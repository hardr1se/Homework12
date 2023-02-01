public class Main {
    public static void main(String[] args) {
        Author prideAndPrejudiceAuthor = new Author("Джейн", "Остин");
        Author warAndPeaceAuthor = new Author("Лев", "Толстой");
        Book prideAndPrejudice = new Book("Гордость и предубеждение", 1812);
        Book warAndPeace = new Book("Война и мир", 1869);
        prideAndPrejudice.setYearOfPublication(1813);
        System.out.print(prideAndPrejudice);
        System.out.print(prideAndPrejudiceAuthor);
        System.out.println();
        System.out.print(warAndPeace);
        System.out.print(warAndPeaceAuthor);
        System.out.println();
    }
}