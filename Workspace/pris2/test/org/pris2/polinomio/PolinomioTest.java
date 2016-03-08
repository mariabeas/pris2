package org.pris2.polinomio;

import junit.framework.*;

public class PolinomioTest extends TestCase {
	
	Monomio monomio1 = new Monomio(5,5);
	Monomio monomio2 = new Monomio(2,5);
	Monomio monomio3 = new Monomio(7,2);
	Monomio monomio4 = new Monomio(1,9);
	Monomio monomio5 = new Monomio(-5,6);
	
	public void testMonomio(){
		assertEquals(monomio1.compareTo(monomio2), 0);
		assertEquals(monomio1.compareTo(monomio3), 1);
		assertEquals(monomio1.compareTo(monomio4), -1);
		
		assertEquals(monomio1.toString(), "5x^5");
	}
	
	public void testPolinomio(){
		
		polinomio polinomio1 = new polinomio();
		
		polinomio1.añadirMonomio(monomio1);
		polinomio1.añadirMonomio(monomio2);
		polinomio1.añadirMonomio(monomio3);
		polinomio1.añadirMonomio(monomio4);
		polinomio1.añadirMonomio(monomio5);
		
		assertEquals(polinomio1.toString(), "5x^5 +2x^5 +7x^2 +1x^9 -5x^6");
		
		//System.out.println(polinomio1.toString());
		
		polinomio1.ordenarPolinomio();
		
		assertEquals(polinomio1.toString(), "1x^9 -5x^6 +2x^5 +5x^5 +7x^2");
		
		//System.out.println(polinomio1.toString());
		
	}

}
