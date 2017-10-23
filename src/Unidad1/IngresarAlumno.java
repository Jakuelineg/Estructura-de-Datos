package Unidad1;

import java.util.Scanner;

public class IngresarAlumno {

	public boolean ingresar(int n, Alumnos[] a) {
		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			a[i] = new Alumnos();
			System.out.println("Ingrese  el numero de contro del alumno:  " + (i + 1));
			a[i].setNumerocontrol(leer.nextLine());

			System.out.println("Ingrese el nombre del alumno:  " + (i + 1));
			a[i].setNombre(leer.nextLine());

			System.out.println("ingrese la direccion del alumno:  " + (i + 1));
			a[i].setDireccion(leer.nextLine());

		}

		return false;

	}

}
