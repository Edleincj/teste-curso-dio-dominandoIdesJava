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
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		 numero2 = entrada.nextInt();
		 
		 soma = numero1 + numero2;
		 subtracao = numero1 - numero2;
		 divisao = numero1 / numero2;
		 multiplicacao = numero1 * numero2;
		 
		 System.out.println("A soma �: "+ soma);
		 System.out.println("A subtra��o �: "+ subtracao);
		 System.out.println("A divis�o �: "+ divisao);
		 System.out.println("A multiplica��o �: "+ multiplicacao);
		 
	}

}
