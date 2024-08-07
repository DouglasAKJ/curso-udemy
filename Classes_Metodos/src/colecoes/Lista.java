package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Douglas"));
		lista.add(new Usuario("Carol"));
		lista.add(new Usuario("Rosa"));
		lista.add(new Usuario("Saionara"));
		
		System.out.println(lista.get(3));
		
		for(Usuario e: lista) {
			System.out.println(e);
		}
		
	}
}
