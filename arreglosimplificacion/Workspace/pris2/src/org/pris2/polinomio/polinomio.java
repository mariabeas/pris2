package org.pris2.polinomio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class polinomio {
	
	private ArrayList<monomio> polinomio;
	
	public polinomio(){
		polinomio = new ArrayList<monomio>();
	}

	public ArrayList<monomio> getPolinomio() {
		return polinomio;
	}

	public void setPolinomio(ArrayList<monomio> polinomio) {
		this.polinomio = polinomio;
	}
	
	public void aņadirMonomio(monomio monomio){
		polinomio.add(monomio);
	}
	
	public void ordenarPolinomio(){
		Collections.sort(polinomio);
		Collections.reverse(polinomio);
	}

	@Override
	public String toString() {
		String cadena = "";
		monomio auxMon = null;
		Iterator<monomio> iterator = polinomio.iterator();
		
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

	
	public ArrayList<monomio> agruparMonomios(){
		ArrayList<monomio> agrupado = new ArrayList<monomio>();
		Iterator<monomio> iterator = polinomio.iterator();
		monomio aux = null;
		int suma = 0;
		int size = polinomio.size();
		System.out.println("tamaņo del polinomio: "+size);
		System.out.println("El polinomio inicial es: "+polinomio.toString());
		for(int i = 0; i < size ; i++){
			for(int j = i+1 ; j < size; j++){
				System.out.println("MONOMIO "+i+" coeficiente: "+polinomio.get(i).getNumero()+
						" exponente: "+polinomio.get(i).getExponente()+"   ------------>   "+
						polinomio.get(i).getNumero()+"x^"+polinomio.get(i).getExponente());
				
					if(polinomio.get(i).getExponente() == polinomio.get(j).getExponente() ){
						suma =  polinomio.get(i).getNumero() + polinomio.get(j).getNumero();
						break;
					}
					else{
						agrupado.add(new monomio(suma, polinomio.get(i).getExponente()));
						//suma = 0;
						i++;		
					}
			}		
		}	
		agrupado.add(new monomio(7,2));
		System.out.println(agrupado.toString());
		return agrupado;
	}
	
	

	
}
