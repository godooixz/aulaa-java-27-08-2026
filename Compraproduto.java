package ATIVIDADES;

import java.util.Scanner;

public class Compraproduto {
    public static void main(String[] args) {

        String nomeProduto = "Geladeira eletrolux 5 mil portas brastemp com freezer embudito na lateral esquerda";
        double precoUnitario = 5.99;
        int quantidadeComprada;
        double valorFinal;
        Scanner ler = new Scanner (System.in);


        System.out.println("===== RESUMÃO DA SUA BRINCADEIRINHA DE GASTAR =====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor unitário do produto: " + precoUnitario);

        System.out.println("Digite aqui a quantidade que comprou: ");
        quantidadeComprada = ler.nextInt();

        valorFinal = quantidadeComprada * precoUnitario;
        System.out.println("O valor da sua brincadeirinha é: " + valorFinal);

        ler.close();




    }
}