package Classe;

public class ProdutoTeste {
		public static void main(String[] args) {
			Produto p1 = new Produto();
			p1.nome = "pastel";
			p1.preco = 4.99;
			
			Produto p2 = new Produto("PC", 2000);
			
			System.out.println("// PRODUTO COM CONSTRUTOR PADRÃO //\n");
			System.out.printf("Produto: %s\n", p1.nome);
			System.out.printf("Preço do %s: R$%.2f\n", p1.nome, p1.preco);
			System.out.println("PROMOÇÃO ESPECIAL DE 25%!!!!\n");
			System.out.printf("Preço do %s com desconto: R$%.2f\n", p1.nome, p1.precoComDesconto());
			
			System.out.println("// PRODUTO COM CONSTRUTOR //\n");
			System.out.printf("Produto: %s\n", p2.nome);
			System.out.printf("Preço do %s: R$%.2f\n", p2.nome, p2.preco);
			System.out.println("PROMOÇÃO ESPECIAL DE 25%!!!!\n");
			System.out.printf("Preço do %s com desconto: R$%.2f\n", p2.nome, p2.precoComDesconto());
		}
	
}