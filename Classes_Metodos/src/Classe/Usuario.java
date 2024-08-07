package Classe;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
		Usuario outro = (Usuario) obj;
		
		boolean igualNome = outro.nome.equals(this.nome);
		boolean igualEmail = outro.email.equals(this.email);
		
		return igualNome && igualEmail;
	} else {
		return false;
	}
	}

}
