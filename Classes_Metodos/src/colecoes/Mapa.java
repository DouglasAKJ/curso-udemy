package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Carol");
		usuarios.put(2,  "Douglas");
		usuarios.put(3, "Rosa");
		usuarios.put(4, "Saionara");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		for(int i: usuarios.keySet()) {
			System.out.println(i);
		}
		for(String i: usuarios.values()) {
			System.out.println(i);
		}
		for(Entry<Integer, String> i: usuarios.entrySet()) {
			System.out.print(i.getKey() + " = ");
			System.out.println(i.getValue());
	
		}
	}
}
