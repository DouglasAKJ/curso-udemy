package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioNotasAluno {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		double total = 0;
		double media = 0;
		System.out.println("Digite a quantidade de notas a serem definidas:");
		Scanner sc = new Scanner(System.in);
		int quantNotas = sc.nextInt();
		double[] notas = new double[quantNotas];
		
		System.out.println("Digite as notas:");
		for(int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextDouble();
		}
		
		for(double nota: notas) {
			total += nota;
		}
		media = total / notas.length;
		System.out.printf("Segue lista de notas: " + Arrays.toString(notas) + "\n");
		System.out.printf("Total das notas: %.2f\n", total );
		System.out.printf("Média das notas: %.2f\n", media);
		sc.close();
	}
}
