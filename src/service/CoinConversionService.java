package service;

import com.google.gson.Gson;
import conversion.CurrencyConverter;
import http.HttpClientService;
import menu.Menu;
import model.Coin;

public class CoinConversionService {

    private double convertedCoin = 0;

    public void getConversions(Menu menu) {
        try {
            HttpClientService httpClientService = new HttpClientService();
            String responseExchangeRate = httpClientService.requestClient();
            if (responseExchangeRate != null && !responseExchangeRate.isEmpty()) {

                // Usando Gson para converter a resposta da API em um objeto model.Coin
                Gson gson = new Gson();
                Coin coin = gson.fromJson(responseExchangeRate, Coin.class);

                double firstRate = coin.getFirstRate(menu);
                double segundRate = coin.getSecundRate(menu);
                double valueToConvert = menu.getValueToConvert();

                CurrencyConverter currencyConverter = new CurrencyConverter();
                convertedCoin =  currencyConverter.convert(firstRate, segundRate, valueToConvert);
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public double getConvertedCoin() {
        return convertedCoin;
    }
}
