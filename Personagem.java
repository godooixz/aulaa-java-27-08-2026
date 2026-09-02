package ATIVIDADES;

import java.util.Scanner;

public class Personagem {
      public static void main(String[] args) { // adaptei essa atividade ao jogo que eu mais joguei na vida que é o Paladins.
       
        String nomedoJogador = "zgoods"; // meu nick no game.
        String nomePersonagem = "Androxus"; //  meu melhor personagem do jogo, vai ser sempre esse, não muda.
        String nomePersonagemAtual; // aqui vai mudar na segunda parte do código
        String classe = "Flanco"; // classe que ataca pelos lados para pegar a backline dos inimigos.
        double nivelMaestria = 280; 
        double pontosDeVida = 2000;
        double moedas = 8000; // no Paladins não existe moedas atribuidas ao personagem, então eu coloquei só para simbolizar.
        boolean pool = true; // pool: se eu domino tudo do personagem com facilidade e me desempenho bem com ele. 
        Scanner ler = new Scanner (System.in);

        System.out.println("==== FICHA DO PLAYER DE PALADINS ====");

        
        System.out.println("Digite aqui seu personagem atual: ");
        nomePersonagemAtual = ler.nextLine();
        System.out.println("Personagem atual: " + nomePersonagemAtual); // aqui os dados vão ser para o personagem Androxus.
        


        System.out.println("Seu nickname é: " + nomedoJogador);
        System.out.println("Seu melhor personagem é: " + nomePersonagem);
        System.out.println("O personagem é da classe: " + classe);
        System.out.println("Seu nivel com o personagem é: " + nivelMaestria);
        System.out.println("A quantidade de vida do seu personagem é de: " + pontosDeVida);
        System.out.println("O valor para se ter o personagem é de: " + moedas);
        System.out.println("O personagem está na sua pool? " + pool);

        System.out.println("////// APÓS UMA PARTIDA //////"); // aqui vai ser como se eu tivesse mudado de personagem após uma partida.

        
        System.out.println("Digite aqui seu personagem atual: ");
        nomePersonagemAtual = ler.nextLine();
        System.out.println("Seu personagem atual é: " + nomePersonagemAtual); // agora as mudanças vão ser para a personagem Cassie também do Paladins.
       

        System.out.println("Seu nickname é: " + nomedoJogador);
        System.out.println("Seu melhor personagem é: " + nomePersonagem); // aqui vai continuar sendo o meu melhor.
        classe = "Dano"; // classe responsável por distribuir dano aos inimigos.
        System.out.println("O personagem é da classe: " + classe);
        nivelMaestria = 110;
        System.out.println("Seu nivel com o personagem é: " + nivelMaestria);
        pontosDeVida = 2200;
        System.out.println("A quantidade de vida do seu personagem é de: " + pontosDeVida);
        System.out.println("O valor para se ter o personagem é de: " + moedas);
        System.out.println("O personagem está na sua pool? " + pool);

        ler.close();


    
    }
}