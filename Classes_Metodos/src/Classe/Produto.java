package Classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		return preco * (1- desconto);
	}
}
