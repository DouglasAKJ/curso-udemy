package Classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.nome = "douglas";
		u1.email = "douglas@gmail.com";
		
		u2.nome = "douglas";
		u2.email = "douglas@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}

}
