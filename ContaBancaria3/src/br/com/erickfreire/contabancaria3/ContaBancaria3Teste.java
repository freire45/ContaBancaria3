package br.com.erickfreire.contabancaria3;

import java.util.Scanner;

public class ContaBancaria3Teste {
	
	public static void main(String[] args) {
		ContaBancaria3 conta1 = new ContaBancaria3("Maria Oliveira", 50.00);
		ContaBancaria3 conta2 = new ContaBancaria3("Joao Silva", -7.53);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor para deposito na conta 1: ");
		double deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta1.deposito(deposito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.print("Informe um valor para deposito na conta 2: ");
		deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta2.deposito(deposito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
	}

}
