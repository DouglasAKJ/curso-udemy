package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Livros {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Harry Potter");
		livros.offer("Crepusculo");
		livros.add("Sherlock Holmes");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.pop());
		System.out.println(livros.peek());
	}
}
