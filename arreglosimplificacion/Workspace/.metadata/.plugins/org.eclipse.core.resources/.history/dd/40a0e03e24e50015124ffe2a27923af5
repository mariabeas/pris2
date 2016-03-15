package org.pris2.polinomio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class polinomio {
	
	private ArrayList<Monomio> polinomio;
	
	public polinomio(){
		polinomio = new ArrayList<Monomio>();
	}

	public ArrayList<Monomio> getPolinomio() {
		return polinomio;
	}

	public void setPolinomio(ArrayList<Monomio> polinomio) {
		this.polinomio = polinomio;
	}
	
	public void añadirMonomio(Monomio monomio){
		polinomio.add(monomio);
	}
	
	public void ordenarPolinomio(){
		Collections.sort(polinomio);
	}

	@Override
	public String toString() {
		String cadena = "";
		Monomio auxMon = null;
		Iterator<Monomio> iterator = polinomio.iterator();
		
		cadena = iterator.next().toString();
		while(iterator.hasNext()){
			auxMon = iterator.next();
			if(auxMon.getNumero() > 0)
				cadena = cadena + " +" + auxMon.toString(); 
			else
				cadena = cadena + " " + auxMon.toString();
		}
		return cadena;
	}
	
	

	
}
