package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra cliente1 = new Compra();
		cliente1.cliente = "Douglas";
		
		cliente1.adicionarItem(new Item("Pastel", 1, 5.50));
		cliente1.adicionarItem(new Item("Coca", 1, 8.90));
		cliente1.adicionarItem(new Item("Papel", 10, 1.25));
		
		System.out.println("Total do carrinho de " + cliente1.cliente + ": " + cliente1.getValorTotal());
		
		
	}
}
