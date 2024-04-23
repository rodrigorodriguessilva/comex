package br.com.alura.comex;

public class Endereco {


    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;




    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';


    }
}
