public class Main {
    public static void main(String[] args) {
        Author prideAndPrejudiceAuthor = new Author("Джейн", "Остин");
        Book prideAndPrejudice = new Book("Гордость и предубеждение", prideAndPrejudiceAuthor, 1812);

        Author warAndPeaceAuthor = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", warAndPeaceAuthor, 1869);
        prideAndPrejudice.setYearOfPublication(1813);
        System.out.print(prideAndPrejudice);
        System.out.println();
        System.out.print(warAndPeace);
    }
}