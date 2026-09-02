package ATIVIDADES;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
     
        double largura, area, altura, perimetro;
        Scanner ler = new Scanner (System.in);
        

        System.out.println("Digite aqui a Largura: ");
        largura = ler.nextInt();

        System.out.println("Digite aqui a Altura: ");
        altura = ler.nextInt();

        area = largura * altura;
        System.out.println("A area do seu retângulo é de: " + area);

        perimetro = 2 * (largura + altura);
        System.out.println("O perimetro do seu retângulo é de: " + perimetro);

        ler.close();
   
    }
}