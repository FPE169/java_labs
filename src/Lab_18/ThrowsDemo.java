package Lab_18;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String args[]){
        ThrowsDemo A = new ThrowsDemo();
        try {
            A.printMessage("example");
            A.printMessage(null);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
