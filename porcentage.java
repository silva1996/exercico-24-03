 import java.util.Scanner;
 
 public  class Main
 {
     public static void main (String[] args) {
         Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = leia.nextDouble();
        System.out.println("Digite o numero de prestações: ");
        int numPrestacoes = leia.nextInt();
        System.out.println("Digite o valor do desconto(%) ");
        double desconto = leia.nextDouble();
        System.out.println("Digite o  valor dos juros (%): ");
        double juros = leia.nextDouble();
        
        double valorProdutoAvista = valorCompra*(1-desconto/100);
        double valorPrestacao = valorCompra*(1+juros/100)/numPrestacoes;
        double juroscadaPrestacao = valorCompra*juros/100/numPrestacoes;
        
        System.out.println("O vaor do produtoo a vista é "+valorProdutoAvista+" valor da prestacao com juros="+ valorPrestacao+" juros cada prestacao:"+juroscadaPrestacao);
         
     }
 }
