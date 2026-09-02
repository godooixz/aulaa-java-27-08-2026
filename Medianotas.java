package ATIVIDADES;

import java.util.Scanner;

public class Medianotas {
    public static void main(String[] args) {
    
        double nota1, nota2, nota3, media;
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite aqui o valor da primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Digite aqui o valor da segunda nota: ");
        nota2 = ler.nextDouble();

        System.out.println("Digite aqui o valor da terceira nota: ");
        nota3 = ler.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("O valor da sua média é de: " + media);

        ler.close();




   
   
   
    } 
}