package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add("Teste");
		conjunto.add("x");
		conjunto.add(true);
		
		conjunto.remove(true);
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
