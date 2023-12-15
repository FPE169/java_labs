package Lab_24;

public class Client {
    Chair chair;
    public void sit(){
        System.out.println("you are sitting on "+chair.toString());
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }

    public static void main(String arg[]){
        Client a = new Client();
        ChairFactory b = new ChairFactory();
        a.setChair(b.createMagicChair());
        a.sit();
        a.setChair(b.createVictorianChair(13));
        a.sit();
        a.setChair(b.createFunctionalChair());
        a.sit();
    }
}
