
public class CoinsRates {

    private double dollarValue;
    private double argentinePesoValue;
    private double brazilianRealValue;
    private double colombianPesoValue;

    // Getters e Setters

    public double getDollarValue() {
        return dollarValue;
    }

    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }

    public double getArgentinePesoValue() {
        return argentinePesoValue;
    }

    public void setArgentinePesoValue(double argentinePesoValue) {
        this.argentinePesoValue = argentinePesoValue;
    }

    public double getBrazilianRealValue() {
        return brazilianRealValue;
    }

    public void setBrazilianRealValue(double brazilianRealValue) {
        this.brazilianRealValue = brazilianRealValue;
    }

    public double getColombianPesoValue() {
        return colombianPesoValue;
    }

    public void setColombianPesoValue(double colombianPesoValue) {
        this.colombianPesoValue = colombianPesoValue;
    }

    // metodos de conversão

    public double convertUSDtoARS(double arsCoin) {
        return  arsCoin;
    }

    public double convertARStoUSD(double arsCoin, double usdCoin) {
        return usdCoin / arsCoin;
    }

    public double convertUSDtoBRL(double brlCoin) {
        return brlCoin;
    }

    public double convertBRLtoUSD(double brlCoin, double usdCoin) {
        return usdCoin / brlCoin;
    }

    public double convertUSDtoCOP(double copCoin){
        return copCoin;
    }
    public double convertCOPtoUSD(double copCoin, double usdCoin) {
        return usdCoin / copCoin;
    }
}
