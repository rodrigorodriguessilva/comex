package br.com.alura.comex;

public class TesteProduto {
    public static void main(String[] args) {
        System.out.println("Teste de produto");
        Produto celularSam = new Produto();
        celularSam.setNome("Iphone 15");
        celularSam.setDescricao("Android com 512GB");
        celularSam.setPrecoUnitario(4809.9);
        celularSam.setQuantidade(10);


        System.out.println(celularSam.toString());

        Produto celularApp = new Produto();
        celularApp.setNome("Iphone 15");
        celularApp.setDescricao("Iphone 15 com 512GB");
        celularApp.setPrecoUnitario(7809.9);
        celularApp.setQuantidade(15);

        if (celularApp == celularSam){
            System.out.println("São Iguais");
        }
        else  System.out.println("Não são iguais");

        if (celularApp.equals(celularSam)){
            System.out.println("São Iguais");
        }
        else  System.out.println("Não são iguais");
    }
}
