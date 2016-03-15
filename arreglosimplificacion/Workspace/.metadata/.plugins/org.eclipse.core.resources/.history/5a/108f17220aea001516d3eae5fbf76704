package Ejercicio3;
public class ListaSE {
		public Nodo primerNodo;
		public Nodo ultimoNodo;

		public ListaSE()
		{
			primerNodo=ultimoNodo=null;
		}

		public void insertarAlFrente(Polinomio est)
		{
			if(estaVacia()) 
				primerNodo=ultimoNodo=new Nodo(est);
			else
				primerNodo=new Nodo(est, primerNodo);
		}


		public boolean estaVacia()
		{
			return primerNodo==null;
		}

		public void insertarAlFinal(Polinomio est)
		{
			if(estaVacia()) 
				primerNodo=ultimoNodo=new Nodo(est);
			else
				ultimoNodo=ultimoNodo.siguiente =new Nodo(est);

		}


	}



