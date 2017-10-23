package Unidad1;

public class BusquedaSecuencial {

	public boolean buscar(String nc, Alumnos[] a) {
		boolean respuesta = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i].getNumerocontrol().equals(nc)) {
				respuesta = true;
			}
		}

		return respuesta;
	}

}