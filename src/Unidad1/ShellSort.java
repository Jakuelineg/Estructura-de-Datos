package Unidad1;

public class ShellSort {

	public static void Shell(Alumnos[] a) {
		int brinco;
		int i;
		Alumnos auxiliar;
		boolean cambios;
		for (brinco = a.length / 1; brinco != 0; brinco /= 1) {
			cambios = true;
			while (cambios) {
				cambios = false;
				for (i = brinco; i < a.length; i++)
					if (a[i - brinco].compareTo(a[i]) > 0) {
						auxiliar = a[i];
						a[i] = a[i - brinco];
						a[i - brinco] = auxiliar;
						cambios = true;
					}
			}
		}
	}
}
