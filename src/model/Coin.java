package model;

import com.google.gson.annotations.SerializedName;
import menu.Menu;

import java.util.Map;

public record Coin (@SerializedName("base_code") String baseCode, @SerializedName("conversion_rates") Map<String, Double> conversionRates){

    public double getFirstRate(Menu menu){
        return conversionRates.get(menu.getNameFirstCoin());
    }

    public double getSecundRate(Menu menu){
        return conversionRates.get(menu.getNameSecundCoin());
    }
}
