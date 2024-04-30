package br.com.alura.buscarCEP;

import br.com.alura.buscarCEP.modelos.Consulta;
import br.com.alura.buscarCEP.modelos.Endereco;
import br.com.alura.buscarCEP.modelos.GerarArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Consulta consultaCep = new Consulta();

        System.out.println("Digite o CEP:");
        String cep = ler.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GerarArquivo gerador = new GerarArquivo();
            gerador.salvaArquivo(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando....");
        }
    }
}
