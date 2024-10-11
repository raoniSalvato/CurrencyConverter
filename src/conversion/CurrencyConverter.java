package conversion;

public class CurrencyConverter {

    public double convert(double firstRate, double secundRate, double valueToConvert) {
        if (firstRate == 1) {
            return secundRate * valueToConvert;
        } else {
            return (secundRate / firstRate) * valueToConvert;
        }
    }
}
