package Lab_3.Converter;

public class TestConverter {
    public static void main(String[] args){
        double rateUSDToEUR = 0.95;
        CurrencyConverter converter = new CurrencyConverter(rateUSDToEUR);

        double amountUSD = 100.0;
        double amountEUR = converter.convert(amountUSD);

        System.out.println(amountUSD + " USD = " + amountEUR + " EUR");
    }
}
