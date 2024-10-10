import com.google.gson.Gson;

public class CoinConversionService {

    private double convertedCoinUSDtoARS;
    private double convertedCoinARStoUSD;
    private double convertedCoinUSDtoBRL;
    private double convertedCoinBRLtoUSD;
    private double convertedCoinUSDtoCOP;
    private double convertedCoinCOPtoUSD;

    public double getConvertedCoinUSDtoARS() {
        return convertedCoinUSDtoARS;
    }

    public double getConvertedCoinARStoUSD() {
        return convertedCoinARStoUSD;
    }

    public double getConvertedCoinUSDtoBRL() {
        return convertedCoinUSDtoBRL;
    }

    public double getConvertedCoinBRLtoUSD() {
        return convertedCoinBRLtoUSD;
    }

    public double getConvertedCoinCOPtoUSD() {
        return convertedCoinCOPtoUSD;
    }

    public double getConvertedCoinUSDtoCOP() {
        return convertedCoinUSDtoCOP;
    }

    public void getConversions() {
        HttpClientService httpClientService = new HttpClientService();
        String responseExchangeRate = httpClientService.requestClient();
        if (responseExchangeRate != null && !responseExchangeRate.isEmpty()) {

            // Usando Gson para converter a resposta da API em um objeto Coin
            Gson gson = new Gson();
            Coin coin = gson.fromJson(responseExchangeRate, Coin.class);

            // Definindo os valores de conversão no objeto CoinsRates
            CoinsRates coinsRates = new CoinsRates();
            coinsRates.setDollarValue(coin.getDollarValue());
            coinsRates.setArgentinePesoValue(coin.getArgentinePesoValue());
            coinsRates.setBrazilianRealValue(coin.getBrazilianRealValue());
            coinsRates.setColombianPesoValue(coin.getColombianPesoValue());

            // Realizando as conversões
            convertedCoinUSDtoARS = coinsRates.convertUSDtoARS(coinsRates.getArgentinePesoValue());
            convertedCoinARStoUSD = coinsRates.convertARStoUSD(coinsRates.getArgentinePesoValue(), coinsRates.getDollarValue());
            convertedCoinUSDtoBRL = coinsRates.convertUSDtoBRL(coinsRates.getBrazilianRealValue());
            convertedCoinBRLtoUSD = coinsRates.convertBRLtoUSD(coinsRates.getBrazilianRealValue(), coinsRates.getDollarValue());
            convertedCoinUSDtoCOP = coinsRates.convertUSDtoCOP(coinsRates.getColombianPesoValue());
            convertedCoinCOPtoUSD = coinsRates.convertCOPtoUSD(coinsRates.getColombianPesoValue(), coinsRates.getDollarValue());
        }
    }


}
