import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientService {

    private static final String URL = "https://v6.exchangerate-api.com/v6/82b17a3321f7083c35459bd5/latest/USD";

    public String requestClient() {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (IOException | InterruptedException e){
            throw new RuntimeException("Erro ao realizar a requisição da API: " + e.getMessage());
        }
    }
}
