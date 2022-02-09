
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		if (nombre != null) {
			if (nombre.length() < 4 || nombre.length() > 20) {
				this.nombre = null;
			} else {
				this.nombre = nombre;
			}
		}else{
			this.nombre=null;
		}
	}

	public void setEdad(int edad) {
		if (edad != 0) {
			if (edad < 18) {
				this.edad = 0;
			} else {
				this.edad = edad;
			}
		}else {
			this.edad=0;
		}
	}
	public void setIdioma(String idioma) {
		if (idioma != null) {
			if (idioma.equals("Inglés") || idioma.equals("Español") || idioma.equals("Alemán") || idioma.equals("Francés")) {
				this.idioma = idioma;
			} else {
				this.idioma = null;
			}
		}else{
			this.idioma=null;
		}
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
