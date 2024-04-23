package br.com.alura.comex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public Endereco consultaCep(String cep) {
        try {
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL + cep + "/json/"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.readValue(response.body(), Endereco.class);
            } else {
                System.err.println("Erro na consulta do CEP: " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            System.err.println("Erro ao consultar CEP: " + e.getMessage());
            return null;
        }
    }
}
