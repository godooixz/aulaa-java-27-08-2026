public class Atividade2 {
    
    public static void main(String[] args) throws Exception {
         System.out.println("Hello, World!");

         String nomeProduto = "Monitor Gamer 3000hz 27 pol 1.0MS KBM"; // esse aqui vc consegue ver até a alma do inimigo
         double precoUnitario = 2999.99;
         int quantidadeComprada = 3;
         double valorTotal = precoUnitario * quantidadeComprada;

         System.out.println("==== RESUMO DA COMPRA ====");
         System.out.println("Produto comprado: " + nomeProduto);
         System.out.println("Valor único: R$ " + precoUnitario);
         System.out.println("Quantidade comprada: " + quantidadeComprada);

         System.out.println("VALOR TOTAL DA FACADA: R$ " + valorTotal);


    }
}