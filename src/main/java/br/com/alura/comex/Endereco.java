package br.com.alura.comex;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Endereco {


    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String numero;


    public Endereco(@JsonProperty("cep") String cep,
                    @JsonProperty("logradouro") String logradouro,
                    @JsonProperty("complemento") String complemento,
                    @JsonProperty("bairro") String bairro,
                    @JsonProperty("localidade") String localidade,
                    @JsonProperty("uf") String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
