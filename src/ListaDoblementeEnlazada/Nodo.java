package ListaDoblementeEnlazada;

public class Nodo {
	private Musica dato;
	private Nodo anterior;
	private Nodo siguiente;
	
	public Musica getDato() {
		return dato;
	}
	
	public void setDato(Musica dato) {
		this.dato = dato;
	}
	
	public Nodo getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}