package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	boolean ligado = false;
	
	void ligar() {
		ligado = true;
	}
	String estaLigado() {
		if (ligado == true) {
			return "O carro está ligado!";
		} else {
			return "O carro está desligado!";
		}
	}
	void acelerar() {
		if (motor.injecaoEletronica < 3.0) {
		motor.injecaoEletronica += 0.5;
		}
	}
	
	void desacelerar() {
		if (motor.injecaoEletronica > 0.6) {
		motor.injecaoEletronica -= 0.5;
		}
	}
}
