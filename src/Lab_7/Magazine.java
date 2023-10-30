package Lab_7;

class Magazine implements Printable{
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
