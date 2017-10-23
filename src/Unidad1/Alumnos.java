package Unidad1;

public class Alumnos implements Comparable {
	private String Numerocontrol;
	private String Nombre;
	private String Direccion;

	public String getNumerocontrol() {
		return Numerocontrol;
	}

	public void setNumerocontrol(String numerocontrol) {
		this.Numerocontrol = numerocontrol;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public int compareTo(String arg0) {
		return Direccion.compareTo(arg0);
	}

	@Override
	public String toString() {

		return "Numero de control: " + this.Numerocontrol + " Nombre del alumno" + this.Nombre
				+ " Direccion del alumno:" + this.Direccion;
	}

	@Override
	public int compareTo(Object o) {

		Alumnos alumno = (Alumnos) o;
		return this.getNumerocontrol().compareTo(alumno.getNumerocontrol());
	}

}
