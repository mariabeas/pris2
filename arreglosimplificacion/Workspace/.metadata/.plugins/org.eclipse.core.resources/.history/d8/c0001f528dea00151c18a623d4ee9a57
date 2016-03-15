package org.pris2.polinomio;

import junit.framework.*;

public class PolinomioTest extends TestCase {
	
	Monomio monomio1 = new Monomio(5,5);
	Monomio monomio2 = new Monomio(2,5);
	Monomio monomio3 = new Monomio(7,2);
	Monomio monomio4 = new Monomio(1,9);
	Monomio monomio5 = new Monomio(-5,9);
	
	public void testMonomio(){
		assertEquals(0, monomio1.compareTo(monomio2));
		assertEquals(1, monomio1.compareTo(monomio3));
		assertEquals(-1, monomio1.compareTo(monomio4));
		
		assertEquals(monomio1.toString(), "5x^5");
	}
	
	public void testPolinomio(){
		
		polinomio polinomio1 = new polinomio();
		
		polinomio1.añadirMonomio(monomio1);
		polinomio1.añadirMonomio(monomio2);
		polinomio1.añadirMonomio(monomio3);
		polinomio1.añadirMonomio(monomio4);
		polinomio1.añadirMonomio(monomio5);
		
		assertEquals("5x^5 +2x^5 +7x^2 +1x^9 -5x^9", polinomio1.toString());
		
		//System.out.println(polinomio1.toString());
		
		polinomio1.ordenarPolinomio();
		
		assertEquals("-5x^9 +1x^9 +2x^5 +5x^5 +7x^2", polinomio1.toString());
		
		//System.out.println(polinomio1.toString());
		
		polinomio1.agruparMonomios();
		assertEquals("[-4x^9, +7x^5, +7x^2]", polinomio1.agruparMonomios());
		System.out.println(polinomio1.agruparMonomios());
		
	}

}
