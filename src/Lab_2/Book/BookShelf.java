package Lab_2.Book;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int numberOfBooks;

    public BookShelf(int size) {
        books = new Book[size];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        }
        else {
            System.out.println("Книжная полка заполнена.");
        }
    }

    public Book getLatestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getDate() > latestBook.getDate()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getDate() < earliestBook.getDate()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public void sortByDate() {
        Arrays.sort(books, 0, numberOfBooks, (book1, book2) -> Integer.compare(book1.getDate(), book2.getDate()));
    }

    @Override
    public String toString() {
        return "Bookshelf{" + "books=" + Arrays.toString(books) + ", numberOfBooks=" + numberOfBooks + '}';
    }
}
