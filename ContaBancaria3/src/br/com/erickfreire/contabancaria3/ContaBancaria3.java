package br.com.erickfreire.contabancaria3;

/**
 * Crie um programa em Java que simula uma conta bancária.
 * @author Erick Freire
 * @version 1 - Criado em 29-03-2021 as 18:15
 */

public class ContaBancaria3 {
	
	private String nome;
	private double saldo;
	
	public ContaBancaria3(String nome, double saldo) {
		this.nome = nome;
		
		if(saldo > 0.0)
			this.saldo = saldo;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNome() {
		return nome;
	}
	

    public void deposito(double deposito) {
    	if(deposito > 0.0)
    		saldo = saldo + deposito;
    }
    
    public double getSaldo() {
    	return saldo;
    }

}
