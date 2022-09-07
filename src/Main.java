public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Author secondAuthor = new Author("Иван", "Тургенев");

        Book firstBook = new Book("Война и мир", firstAuthor, 1867);
        Book secondBook = new Book("Муму", secondAuthor, 1852);


        System.out.println("Author : " + firstAuthor.getFullName() + " book: " + firstBook.getBookName() + " " + firstBook.getYear() + " year.");
        System.out.println("Author : " + secondAuthor.getFullName() + " book: " + secondBook.getBookName() + " " + secondBook.getYear() + " year.");
        System.out.println(firstBook);
        System.out.println(secondBook);

    }
}