package org.pris2.polinomio;

import java.util.ArrayList;

public class polinomio {
	
	private ArrayList<Monomio> polinomio;
	
	public polinomio(ArrayList<Monomio> polinomio){
		this.polinomio = polinomio;
	}

	public ArrayList<Monomio> getPolinomio() {
		return polinomio;
	}

	public void setPolinomio(ArrayList<Monomio> polinomio) {
		this.polinomio = polinomio;
	}

	
}
