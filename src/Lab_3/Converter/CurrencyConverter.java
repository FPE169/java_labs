package Lab_3.Converter;

public class CurrencyConverter {
    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }

    public double convert(double amount) {
        return amount * rate;
    }

}
