package Unidad1;

import java.util.Scanner;

public class Principal {
	private Alumnos[] a;
	private static int opc, n;
	private String nc;
	private IngresarAlumno ia = new IngresarAlumno();
	private BusquedaSecuencial bs = new BusquedaSecuencial();
	private static Burbuja burbuja = new Burbuja();
	private static ShellSort shell = new ShellSort();
	private static QuickSort quick = new QuickSort();
	private static BusquedaBinaria binaria = new BusquedaBinaria();

	public static void main(String[] args) {
		Principal p = new Principal();
		System.out.print(" Numero de elementos: ");
		Scanner leer = new Scanner(System.in);
		p.n = leer.nextInt();

		p.a = new Alumnos[p.n];
		p.ia.ingresar(p.n, p.a);

		p.opc = 0;

		while (p.opc != 6) {
			System.out.println("...:: Menú De Opciones ::...");
			System.out.println("1.Busqueda Secuencial");
			System.out.println("2.Busqueda Binaria");
			System.out.println("3.Burbuja");
			System.out.println("4.QuickSort");
			System.out.println("5.MergeSort");
			System.out.println("6.ShellSort ");
			System.out.println("7.Imprimir la base de datos");
			System.out.println("8.Terminar");
			System.out.println("Seleccione la opcion que se decea");
			p.opc = leer.nextInt();

			switch (p.opc) {
			case 1:
				System.out.print("Ingresa número de control a buscar:");
				p.nc = leer.next();
				if (p.bs.buscar(p.nc, p.a)) {
					System.out.println("Se encontro el alumno");
				} else {
					System.out.println("No se encontro el alumno");
				}
				break;
			case 2:
				System.out.print("Buscar:");
				p.nc = leer.next();
				break;
			case 3:
				System.out.println("Ingrese el pivote:");
				p.nc = leer.next();
				System.out.println("Ingrese el puntero:");
				p.nc = leer.next();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Gracias!!");
			default:
				System.out.println("Selecciona una opción correcta");
			}
		}

	}

}
