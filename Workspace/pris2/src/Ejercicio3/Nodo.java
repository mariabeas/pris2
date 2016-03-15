package Ejercicio3;



public class Nodo {
	Polinomio poli;
	Nodo siguiente;
	public Nodo (Polinomio x)
	{
		this.poli=x;
		siguiente = null;
	}

	public Nodo( Polinomio x, Nodo nuevoelemento){

		this.poli=x;
		siguiente=nuevoelemento;

	}

	Polinomio getPolinomio()
	{
		return this.poli;
	}

	Nodo getsiguientet()
	{
		return siguiente;
	}


}
