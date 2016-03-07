package org.pris2.polinomio;

public class Monomio {

	private int numero;
	private int exponente;
	
	public Monomio(int numero, int exponente){
		this.numero = numero;
		this.exponente = exponente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}
}
