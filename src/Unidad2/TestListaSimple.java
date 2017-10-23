package Unidad2;

import java.util.Scanner;

public class TestListaSimple {
	//declarar la variable
	private ListaSimple lista=new ListaSimple();
	
    // es metodo main
	public static void main(String[] args) {
		//declaracion de nuestra clase
		TestListaSimple tls=new TestListaSimple();
		//tipo de dato y nuestra variable
		int opcion=0;
		Scanner leer=new Scanner(System.in);
		do {
			//son las opciones que se mostraran en el menu:
			System.out.println("Menu de opciones");
			System.out.println("1.-Vacio");
			System.out.println("2.- Insertar Principio");
			System.out.println("3.- Insertar Final");
			System.out.println("4.- Insertar Posición");
			System.out.println("5.- Localizar");
			System.out.println("6.- Buscar");
			System.out.println("7.- Eliminar");
			System.out.println("8.- Imprimir");
			System.out.println("9.- Salir");
			System.out.print("Seleccione opción:");
			opcion=leer.nextInt();
			
			//dentro del switch tenemos la variable que declaramos al principio de nuestro metodo
			switch(opcion) {
			// este es el caso 1 donde la opcion es de vacio
			case 1: 
				//en este caso si entra la opcion se mostrara que la lista esta vacia
				if(tls.lista.isVacio()) {
					System.out.println("lista vacia");
			    // en caso de que no se mostrara en un mensaje que la lista no esta vacia
				}else {
					System.out.println("lista no vacia");
				}
				//sale de la opcion 1
				break;
				//caso dos donde se selecciona la opcion y donde elor se va inserta al 
				//principio el valor que se de
			case 2:
				//solicita el el valor
				System.out.print("Ingresa valor a insertar:");
				//lee el valor 
				tls.lista.insertarPrincipio(leer.nextInt());
				//se mostrara el mensaje donde ya se ingreso el valor o se a insertado
				System.out.println("valor insertado");
				//sale de la opcion
				break;
				
				//caso 3 es donde el valor que agreges se va a insertar hasta el final despues
				// de haber agregado los demas valores
			case 3:
				//solicita el valor
				System.out.print("Ingresa valor a insertar:");
				//lee el valor
				tls.lista.insertarFinal(leer.nextInt());
				//mostrara un mensaje donde siga el valor fue insertado
				System.out.println("valor insertado");
				//sale de la opcion
				break;
				//en el caso cuatro es donde debes de insertar una posicion
			case 4:
				//solicita el valor
				System.out.print("Ingresa valor a insertar:");
				//se muestra nuestra variable con el tipo de datos y la va a leer.
				int valor=leer.nextInt();
				//debes de seleccionar la posicion
				System.out.print("Ingresa la posición:");
				//se  muestra nuestra variable con nuestro tipo de datos y la va a leer.
				int posicion=leer.nextInt();
				//se va a mostrar el valor y la posicion en la que se encuentra.
				tls.lista.insertarPosicion(valor, posicion);
				//se mostrara un mensaje donde el valor ya a sido insertado.
				System.out.println("valor insertado");
				// sale de nuestro caso
				break;
				// nuestrro metodo 5 es de localizar
			case 5:
				//solicita un valor
				System.out.print("Ingresa valor a localizar:");
				// si despues de haber agregado nuestro valor va entrar
				if(tls.lista.localizar(leer.nextInt())) {
					//en caso de que se haya agregado un valor mostrara el sigueinte mensaje
					System.out.println("nodo localizado");
					//en caso de que no
				}else {
					//si no se agrego un valor mostrara un menaje de que no a sido localizado
					System.out.println("nodo no localizado");
				}		
				//sale de nuestro caso
				break;
				//el caso 6 da la opcion de buscar
			case 6:
				//solicita un valor
				System.out.print("Ingresa valor a buscar:");
				//nuestro metodo buscar va a buscar y va a leer el valor
				tls.lista.buscar(leer.nextInt());		
				//sale de nuestro metodo
				break;
				// nuestro caso 5 es eliminar
			case 7:
				//solicita valor
				System.out.print("Ingresa la posición a eliminar:");
				tls.lista.eliminar(leer.nextInt());
				// sale de nuestro caso
				break;
			case 8:
				System.out.println(tls.lista.imprimir());
			}
		}while(opcion!=9);
		

	}

}