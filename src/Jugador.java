
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {
		if (nombre.length()<4 ||nombre.length()>20){
			this.nombre=null;
		}else if (nombre==null){
			this.nombre=null;
		}else{
			this.nombre=nombre;
		}
	}

	public void setEdad(int edad) {
		if (edad<18){
			this.edad=0;
		}else{
			this.edad=edad;
		}
	}
	public void setIdioma(String idioma) {
		if (idioma=="inglés"||idioma=="español"||idioma=="alemán"||idioma=="francés") {
			this.idioma=idioma;
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
