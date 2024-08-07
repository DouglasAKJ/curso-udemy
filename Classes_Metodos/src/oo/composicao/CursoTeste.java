package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Douglas");
		Aluno aluno2 = new Aluno("Carol");
		Aluno aluno3 = new Aluno("Willian");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("HTML");
		Curso curso3 = new Curso("CSS");
		
		aluno1.adicionarCurso(curso1);
		aluno1.adicionarCurso(curso3);
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno2);
		
		aluno3.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso3);
		
		System.out.println(aluno1.cursos.get(0).alunos);
	}
}
