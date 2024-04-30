package br.com.alura.buscarCEP.modelos;

public record Endereco(String logradouro, String cep,
                       String localidade, String complemento,
                       String uf) {
}