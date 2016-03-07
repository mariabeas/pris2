package org.pris2.polinomio;

public class Monomio implements Comparable<Monomio> {

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

	@Override
	public int compareTo(Monomio o) {
		if (exponente > o.exponente)
			return 1;
		if (exponente < o.exponente)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return numero + "x^" + exponente;
	}
	
	
	
}
