package Unidad1;

public class QuickSort {
	public void procedimientoquick(Alumnos[] a, int izquierda, int derecho) {

		Alumnos remplazar;
		Alumnos piv = a[izquierda];
		int i = izquierda;
		int derecha = derecho;

		while (i < derecha) {
			while (a[i].compareTo(piv) <= 0 && i < derecha) {
				i++;
			}
			while (a[i].compareTo(piv) > 0) {
				derecha--;
			}
			if (i < derecha) {
				remplazar = a[i];
				a[i] = a[derecha];
				a[derecha] = remplazar;
			}
		}
		a[izquierda] = a[derecha];
		a[derecha] = piv;

		if (izquierda < derecha - 1) {
			procedimientoquick(a, izquierda, derecha - 1);
		}

		if (derecha + 1 < derecho) {
			procedimientoquick(a, derecha + 1, derecho);
		}
	}
}
