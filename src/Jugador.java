/**
 * Esta clase define los parametros para guardar un jugador
 * Author: Loren Lynch / Jose Luis Dommarco 
 * version: 11/02/2022
 *
 */

public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	 /**
     * Método setNombreJugador guarda el nombre del jugador si tiene entre 4 y 20 caracteres
     * @param nombre del jugador que desea guardarse
     */
	
	
	public void setNombreJugador(String nombre) {
		if (nombre != null) {
			if (nombre.length() >= 4 && nombre.length() <= 20) {
				for (int i = 0; i < nombre.length(); i++) {
					if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z' || nombre.charAt(i) == ' ') {
						this.nombre = nombre;
					} else {
						this.nombre = null;
						i = nombre.length();
					}
				}

			}
		} else {
			this.nombre = null;
		}
	}

	 /**
     * Método setEdad guarda la edad del jugador si es mayor de edad
     * @param 	edad del jugador que desea guardarse
     */
	public void setEdad(int edad) {
		if (edad < 18) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}
	}

	 /**
     * Método set idioma guarda el idioma del jugador si recibe inglés, español, alemán o francés
     * @param idioma Este metodo guarda los idiomas aceptados
     */
	public void setIdioma(String idioma) {
		if (idioma != null) {
			if (idioma.equals("Inglés") || idioma.equals("Español") || idioma.equals("Alemán")
					|| idioma.equals("Francés")) {
				this.idioma = idioma;
			} else {
				this.idioma = null;
			}
		}
	}
	/***
	 * 
	 * @return String idioma Este método nos devuelve el idioma de jugador cuando se llama al metodo
	 */
	public String getIdioma() {
		return idioma;
	}
	/***
	 * @return String nombre Este metodo devuelve el nombre del jugador cuando se llame al metodo
	 * 
	 */
	public String getNombreJugador() {
		return nombre;
	}
	/***
	 * @return int edad Este metodo devuelve la edad del jugador cuando se llame al metodo
	 * 
	 */

	public int getEdad() {
		return edad;
	}

	 /**
     * Constructor para setNombreJugador
	 * @return String tipoJugador Devuelve el tipo de jugador dependiendo de los parámetros introducidos
     */
	public String tipoJugador() {
		String tipoJugador = "";
		Jugador jugador = new Jugador();
		if (jugador.getEdad() != 0 && jugador.getNombreJugador() != null && jugador.getIdioma() != null) {
			if (edad >= 18 && edad <= 25) {
				tipoJugador = "Junior";
			} else if (edad >= 26 && edad <= 35) {
				tipoJugador = "Senior";
			} else {
				tipoJugador = "Master";
			}
		} else {
			tipoJugador = null;
		}
		return tipoJugador;
	}
}
