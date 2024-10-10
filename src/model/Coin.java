import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record Coin (@SerializedName("base_code") String baseCode, @SerializedName("conversion_rates") Map<String, Double> conversionRates){

    private static final String USD = "USD";
    private static final String ARS = "ARS";
    private static final String BRL = "BRL";
    private static final String COP = "COP";

    public double getDollarValue(){
        return  conversionRates.get(USD);
    }

    public double getArgentinePesoValue(){
        return  conversionRates.get(ARS);
    }

    public double getBrazilianRealValue(){
        return  conversionRates.get(BRL);
    }

    public double getColombianPesoValue(){
        return  conversionRates.get(COP);
    }

}
