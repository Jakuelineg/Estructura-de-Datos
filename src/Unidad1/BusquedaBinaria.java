package Unidad1;

public class BusquedaBinaria {
	public void procedimientoburbuja(Alumnos[] a) {
		Alumnos replace;

		for (int piv = 0; piv < a.length; piv++) {
			for (int pun = piv + 1; pun < a.length; pun++) {
				if (a[piv].compareTo(a[pun]) > 0) {
					replace = a[piv];
					a[piv] = a[pun];
					a[pun] = replace;
				}

				if (pun == a.length) {

				}
			}
		}
	}

}
