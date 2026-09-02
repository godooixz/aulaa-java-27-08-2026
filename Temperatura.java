package ATIVIDADES;

import java.util.Scanner;

public class Temperatura {
     public static void main(String[] args) {
     
        double celsius, fahrenheit;
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite aqui o valor da temperatura em graus Celsius: ");
        celsius = ler.nextDouble();

        fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println("O valor dos graus Celsius convertidos para Fahrenheit é de: " + fahrenheit + "°");
        

        ler.close();
    
    }
}