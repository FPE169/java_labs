package Lab_2.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Булгаков", "Собачье сердце", 1925);
        Book book2 = new Book("Грибоедов", "Горе от ума", 1822);
        Book book3 = new Book("Горький", "Детство", 1913);

        BookShelf bookshelf = new BookShelf(3);
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Все книги на полке:");
        System.out.println(bookshelf);

        Book latestBook = bookshelf.getLatestBook();
        if (latestBook != null) {
            System.out.println("Самая поздняя книга:");
            System.out.println(latestBook);
        }
        else {
            System.out.println("На полке нет книг.");
        }

        Book earliestBook = bookshelf.getEarliestBook();
        if (earliestBook != null) {
            System.out.println("Самая ранняя книга:");
            System.out.println(earliestBook);
        }
        else {
            System.out.println("На полке нет книг.");
        }

        bookshelf.sortByDate();
        System.out.println("Книги на полке, отсортированные по году выпуска:");
        System.out.println(bookshelf);
    }
}
