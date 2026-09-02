package ATIVIDADES;

import java.util.Scanner;

public class Salariomensal {
    public static void main(String[] args) {

        String nome = "Yohan Cruyff";
        double valorHora = 280.75;
        double salarioBruto;
        double horas;
        Scanner ler = new Scanner (System.in);

        System.out.println("==== RESUMÃO DO SEU MêS DE TRABALHO SUADO ====");

        System.out.println("Nome do colaborador: " +  nome);
        System.out.println("Valor ganhado por hora: " + valorHora);

        System.out.println("Digite aqui a quantidade de horas trabalhadas: ");
        horas = ler.nextDouble();

        salarioBruto = valorHora * horas;
        System.out.println("Seu salário bruto desse mês irá ficar no valor de: " + salarioBruto);

        ler.close();

    }
}