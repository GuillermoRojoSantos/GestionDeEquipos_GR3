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
		this.nombre = condicionesNombreJugador(nombre);
	}

	/**
	 * Método setEdad guarda la edad del jugador si es mayor de edad
	 * @param 	edad del jugador que desea guardarse
	 */
	public void setEdad(int edad) {
		this.edad = condicionesEdadJugador(edad);
	}

	/**
	 * Método set idioma guarda el idioma del jugador si recibe inglés, español, alemán o francés
	 * @param idioma Este metodo guarda los idiomas aceptados
	 */
	public void setIdioma(String idioma) {
		this.idioma = condicionesIdiomaJugador(idioma);
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
	 * método que recibe 3 parámetros y asigna una categoría segun la edad
	 * @param edad edad del jugador
	 * @param nombre nombre del jugador
	 * @param idioma idioma del jugador
	 * @return String tipoJugador Devuelve el tipo de jugador dependiendo de los parámetros introducidos
	 */
	public String tipoJugador(int edad, String nombre, String idioma) {
		String tipoJugador = "";
		if (edad != 0 && nombre != null && idioma != null) {

			int edadMinimaJunior = 18;
			int edadMaximaJunior = 25;
			int edadMinimaSenior = 26;
			int edadMaximaSenior = 35;
			if (edad >= edadMinimaJunior && edad <= edadMaximaJunior) {

				tipoJugador = "Junior";

			}else if(edad >= edadMinimaSenior && edad <= edadMaximaSenior){

				tipoJugador = "Senior";

			}else {

				tipoJugador = "Master";

			}

		}

		else {
			tipoJugador = null;
		}

		return tipoJugador;
	}

	/**
	 * 
	 * @param nombre del jugador que queremos guardar
	 * @return String nombreFinal Devuelve el nombre Final
	 */
	public static String condicionesNombreJugador(String nombre) {
		String nombreFinal=null;
		if (nombre != null) {
			if (nombre.length() >= 4 && nombre.length() <= 20) {
				for (int i = 0; i < nombre.length(); i++) {
					if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z' || nombre.charAt(i) == ' ') {
						nombreFinal = nombre;
					} else {
						nombreFinal = null;
						i = nombre.length();
					}
				}
			}
		} else {
			nombreFinal = null;
		}
		
		return nombreFinal;
	}

	/**
	 * 
	 * @param edad del jugador que queremos guardar
	 * @return int edadFinal Devuelve el resultado de la edad 
	 */
	public static int condicionesEdadJugador(int edad) {
		int edadFinal;
		int edadMinima = 18;
		if (edad < edadMinima) {
			edadFinal = 0;
		} else {
			edadFinal = edad;
		}
		
		return edadFinal;
	}

	/**
	 * 
	 * @param idioma del jugador que queremos guardar
	 * @return String idiomaFinal devuelve el resultado del idioma
	 */
	public static String condicionesIdiomaJugador(String idioma) {
		String idiomaFinal = null;
		if (idioma != null) {
			if (idioma.equals("Inglés") || idioma.equals("Español") || idioma.equals("Alemán")
					|| idioma.equals("Francés")) {
				idiomaFinal = idioma;
			} else {
				idiomaFinal = null;
			}
		}
		
		return idiomaFinal;
	}
}
