package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos:");
		int qntdAlunos = sc.nextInt();
		
		System.out.println("Informe a quantidade de notas por aluno:");
		int qntdNotas = sc.nextInt();
		
		double[][] notasAlunos = new double[qntdAlunos][qntdNotas];
		
		System.out.println(notasAlunos.length);
		
		double total = 0;
		for(int i = 0; i < notasAlunos.length ; i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d\n", j + 1, i + 1);
				notasAlunos[i][j] = sc.nextDouble();
				total += notasAlunos[i][j];
			}
		}
		double media = total / (qntdAlunos * qntdNotas);
		
		System.out.println("Nota total dos alunos: " + total);
		System.out.printf("Media total das notas dos alunos é: %.2f", media);
		sc.close();
	}
}
