import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int year;


    public Book(String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
        public String getBookName () {
            return bookName;
        }
        public Author getAuthor () {
            return author;
        }
        public int getYear () {
            return year;
        }
        public void setYear ( int year){
            this.year = year;
        }

        @Override
        public int hashCode () {
            return Objects.hash(bookName, author, year);
        }
        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
        }
        @Override
        public String toString () {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", author" + author.toString() +
                    ", year=" + year +
                    '}';

        }
    }
