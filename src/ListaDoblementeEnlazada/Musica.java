package ListaDoblementeEnlazada;

public class Musica {
	
	private int id;
	private String nombre, artista, genero, album;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Musica [id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", genero=" + genero + ", album="
				+ album + "]";
	}
}


