package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoUniforme {
	public static void main(String[] args) {
		
		SortedSet<String> setLista = new TreeSet<>();
		setLista.add("Carol"); 
		setLista.add("Douglas");
		setLista.add("Rosa");
		setLista.add("Saionara");
		
		for(String nome: setLista) {
			System.out.println(nome);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int i: nums) {
			System.out.println(i);
		}
	}
}
