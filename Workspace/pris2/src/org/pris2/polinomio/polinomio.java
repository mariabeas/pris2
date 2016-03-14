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
		Collections.reverse(polinomio);
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

	
	public ArrayList<Monomio> agruparMonomios(){
		ArrayList<Monomio> agrupado = new ArrayList<Monomio>();
		Iterator<Monomio> iterator = polinomio.iterator();
		Monomio aux = null;
		int suma = 0;
		int size = polinomio.size();
		System.out.println(size);
		
		for(int i = 0; i < size ; i++){
			System.out.println(polinomio.get(i));
			for(int j = i+1 ; j < size; i++){
				System.out.println(polinomio.get(j));
					if(polinomio.get(i).getExponente() == polinomio.get(j).getExponente() ){
						suma =  polinomio.get(i).getNumero() + polinomio.get(j).getNumero();
						System.out.println(suma);
						break;
					}
					else{
						agrupado.add(new Monomio(suma, polinomio.get(i).getExponente()));
						System.out.println(agrupado.toString());
						suma = 0;
					}
			}
					
		}		
		return agrupado;
	}
	
	

	
}
