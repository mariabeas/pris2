package org.pris2.polinomio;

import java.util.ArrayList;
import java.util.Scanner;

public class usoPolinomio {

	public static <T> void main(String[] args) {
		int numero = 0;
		int exponente = 0;
		int polinomios=0;
		Scanner in = new Scanner(System.in);
		monomio m;
		polinomio p;
		String polinomioString="";
		System.out.println("PROGRAMA POLINOMIO:");
		System.out.println("�CUANTOS POLINOMIOS SON?");
		polinomios=in.nextInt();
		for(int i=0;i<polinomios;i++){
		System.out
				.println("	INTRODUCE NUMERO Y EXPONENTE DISTINTOS DE CERO "
						+ "MIENTRAS QUIEREAS SEGUIR A�ADIENDO MONOMIOS.");
		while (true) {
			System.out.println("numero: ");
			numero = in.nextInt();
			System.out.println("exponente: ");
			exponente = in.nextInt();
			m = new monomio(numero, exponente);
			p = new polinomio();		
			p.a�adirMonomio(m);
			if( numero==0&& exponente==0)
				break;
			
			polinomioString=polinomioString+" "+p.toString();

		}
		System.out.println("el polinomio "+ i + "  es: "+polinomioString);
		
		}

	}

}
