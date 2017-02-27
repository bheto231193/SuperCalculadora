public class NodoDoble {
	private NodoDoble siguiente;
	private  int dato;
	private NodoDoble anterior;
	
	public NodoDoble (){}
	public NodoDoble (int d){
		this.dato = d;
		this.siguiente = null;
		this.anterior = null;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	
}