package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Carol"); // lança uma excessão
		fila.offer("Douglas"); // retorna falso
		fila.add("Saionara");
		fila.offer("Rosa");
		
		System.out.println(fila.peek()); //retorna o primeiro item da fila e retorna null
		System.out.println(fila.element()); // retorna o primeiro item da fila e retorna excessão
		
		System.out.println(fila.poll()); // retorna o primeiro item da fila e o remove
		System.out.println(fila.poll());
		
	}
}
