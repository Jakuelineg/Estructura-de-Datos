package Unidad2;

public class ListaSimple {
	private NodoSimple cabeza;
	
public ListaSimple() {
	this.cabeza=null;
}

public NodoSimple getCabeza() {
	return cabeza;
}

public void setCabeza(NodoSimple cabeza) {
	this.cabeza = cabeza;
}

public boolean isVacio() {
	boolean respuesta=true;
	if(this.cabeza!=null) {
		respuesta=false;
	}
	return respuesta;
}

public void insertar(int valor) {
	NodoSimple nuevo=new NodoSimple();
	nuevo.setDato(valor);
	nuevo.setSiguiente(null);
	this.cabeza=nuevo;
}

public void insertarPrincipio(int valor) {
	if(this.isVacio()) {
		this.insertar(valor);
	}else {
		NodoSimple nuevo=new NodoSimple();
		nuevo.setDato(valor);
		nuevo.setSiguiente(this.cabeza);
		this.cabeza=nuevo;		
	}
}

public void insertarFinal(int valor) {
	if(this.isVacio()) {
		this.insertar(valor);
	}else {
		NodoSimple nuevo=new NodoSimple();
		nuevo.setDato(valor);
		nuevo.setSiguiente(null);
		
		NodoSimple temporal=this.cabeza;
		while(temporal.getSiguiente()!=null) {
			temporal=temporal.getSiguiente();
		}
		temporal.setSiguiente(nuevo);
	}
}
public int contar() {
	int respuesta=0;
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		respuesta++;
		temporal=temporal.getSiguiente();
	}
	return respuesta;
}
public NodoSimple encontrar(int posicion) {
	NodoSimple temporal=this.cabeza;
	NodoSimple anterior=null;
	int i=0;
	while(i<posicion) {
		i++;
		anterior=temporal;
		temporal=temporal.getSiguiente();
	}
	return anterior;
}
public void insertarPosicion(int valor, int posicion) {
	if(posicion>0 && this.contar()>1 && posicion<=this.contar()) {
		if(posicion==1) {
			this.insertarPrincipio(valor);
		}else if(posicion==this.contar()) {
			this.insertarFinal(valor);
		}else {
			NodoSimple anterior=this.encontrar(posicion-1);
			NodoSimple nuevo=new NodoSimple();
			nuevo.setDato(valor);
			nuevo.setSiguiente(anterior.getSiguiente());
			anterior.setSiguiente(nuevo);
		}
		
	}
}
public boolean localizar(int valor) {
	boolean respuesta=false;
	
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		if(temporal.getDato()==valor) {
			respuesta=true;
		}
		temporal=temporal.getSiguiente();
	}
	
	return respuesta;
}

public void buscar(int valor) {
	boolean respuesta=false;
	
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		if(temporal.getDato()==valor) {
			respuesta=true;
			System.out.println("El valor encontrado es:"+temporal.getDato());
		}
		temporal=temporal.getSiguiente();
	}
	if(respuesta==false) {
		System.out.println("El valor no fue encontrado");
	}
	
}

public boolean eliminar(int posicion) {
	boolean respuesta=false;
	if(posicion==1) {
		this.setCabeza(this.cabeza.getSiguiente());
		respuesta=true;
	}else {
		NodoSimple temporal=this.encontrar(posicion-1);
		temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
		respuesta=true;
	}
	return respuesta;
}

public StringBuilder imprimir() {
	StringBuilder cadena=new StringBuilder();
	cadena.append("Cabeza-->");
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		cadena.append(temporal.getDato());
		cadena.append("-->");
		temporal=temporal.getSiguiente();
	}
	cadena.append("NULL");
	return cadena;
}


}
