package Lab_7;

public class Book implements Printable{

    private String title;

    public Book(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }
}
