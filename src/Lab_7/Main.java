package Lab_7;

public class Main {
    public static void main(String[] args) {
        Magazine[] magazines = {
                new Magazine("Lab_7.Magazine 345"),
                new Magazine("Lab_7.Magazine 89"),
                new Magazine("Lab_7.Magazine 90")
        };

        Book[] books = {
                new Book("Lab_7.Book Ever"),
                new Book("Lab_7.Book Animal"),
                new Book("Lab_7.Book 404")
        };

        Magazine.printMagazines(magazines);
        Magazine.printMagazines(books);
    }
}
