package Calculadora;

import java.util.Scanner;

public class primeiraCalculadora {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		int subtracao = 0;
		int divisao = 0;
		int multiplicacao = 0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		 numero2 = entrada.nextInt();
		 
		 soma = numero1 + numero2;
		 subtracao = numero1 - numero2;
		 divisao = numero1 / numero2;
		 multiplicacao = numero1 * numero2;
		 
		 System.out.println("A soma é: "+ soma);
		 System.out.println("A subtração é: "+ subtracao);
		 System.out.println("A divisão é: "+ divisao);
		 System.out.println("A multiplicação é: "+ multiplicacao);
		 
	}

}
