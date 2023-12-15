package Lab_24;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Magic");
    }

    @Override
    public String toString() {
        return "Magic Lab_24.Chair";
    }
}