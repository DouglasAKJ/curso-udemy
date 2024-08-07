package Calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = sc.nextInt();
		System.out.println("Digite a operação: + | - | / | * | % ");
		String op = sc.next();
		int soma = (op.equals("+")) ? (num1 + num2) : (op.equals("-")) ? (num1 - num2) : (op.equals("/")) ? (num1 / num2) 
				: (op.equals("*")) ? (num1 * num2) : (op.equals("%")) ? (num1 % num2) : 0;
		System.out.println("Resultado: " + soma);
	}
}
