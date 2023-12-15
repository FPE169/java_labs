package Lab_24;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "Functional Lab_24.Chair";
    }
}
