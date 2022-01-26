
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setIdioma(String idioma) {
		this.idioma= idioma;
	}


	public String getIdioma() {
		return idioma;
	}
	
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
