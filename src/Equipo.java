/**
 * 
 * @author Adrian López Espejo
 *
 */
public class Equipo {

	private String nombreEquipo;
	private int ranking;

	/**
	 * Constructor vacío de equipo
	 */
	public Equipo() {
	}

	/**
	 * Método que comprueba que la longitud del nombre del equipo es correcta
	 * 
	 * @param nombreEquipo del equipo que quiere guardarse
	 * @return boolean nombreLength (true si el nombre del equipo está entre 4 y 20
	 *         caracteres)
	 */
	public boolean nombreLength(String nombreEquipo) {
		boolean nombreLength = false;
		if (nombreEquipo.length() >= 4 && nombreEquipo.length() <= 20) {
			nombreLength = true;
		} 
		return nombreLength;
	}

	/**
	 * Método que comprueba que el ranking se encuentra en el rango permitido
	 * 
	 * @param ranking del equiop que se quiere guardar
	 * @return boolean rangeRanking (devuelve true si el ranking se encuentra entre
	 *         0 y 10)
	 */
	public boolean rangeRanking(int ranking) {
		boolean rangeRanking = false;
		if (ranking >= 0 && ranking <= 10) {
			rangeRanking = true;
		} else {
			rangeRanking = false;
		}
		return rangeRanking;
	}

	/**
	 * Método que comprueba si el nombre es nulo
	 * 
	 * @param nombreEquipo del equipo que se desea guardar
	 * @return boolean isNull (true si el nombre no es nulo)
	 */
	public boolean isNull(String nombreEquipo) {
		boolean isNull = false;
		if (nombreEquipo != null) {
			isNull = true;
		} 
		return isNull;
	}

	/**
	 * Método que comprueba que no haya caracteres especiales en el nombre
	 * 
	 * @param nombreEquipo del equipo que se quiere guardar
	 * @return boolean isLetter (true si el nombre tiene algún caracter especial)
	 */
	public boolean isLetter(String nombreEquipo) {
		boolean isLetter = false;
		for (int i = 0; i < nombreEquipo.length(); i++) {
			if (nombreEquipo.charAt(i) >= 'A' && nombreEquipo.charAt(i) <= 'Z' || nombreEquipo.charAt(i) == ' ') {
				isLetter = true;
			} else {
				isLetter = false;
				i = nombreEquipo.length();
			}
		}
		return isLetter;
	}

	/**
	 * Este método guarda el nombre del equipo siempre que cumpla con las
	 * condiciones necesarias
	 * 
	 * @param nombreEquipo del equipo que se desea guardar
	 */
	public void setNombreEquipo(String nombreEquipo) {
		if (isLetter(nombreEquipo)) {
			if (nombreLength(nombreEquipo)) {
					if (isNull(nombreEquipo)) {
						this.nombreEquipo = nombreEquipo;
					}
				
			}
		} else {
			this.nombreEquipo = null;
		}
	}

	/**
	 * Este método guarda el ranking del equipo siempre que cumpla con las
	 * condiciones
	 * 
	 * @param ranking del equipo que se desea guardar
	 */
	public void setRanking(int ranking) {
		if (rangeRanking(ranking)) {
			this.ranking = ranking;
		} else {
			this.ranking = -1;
		}
	}

	/**
	 * getter del nombre del equipo
	 * 
	 * @return String nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;

	}

	/**
	 * getter del ranking del equipo
	 * 
	 * @return int ranking
	 */
	public int getRanking() {
		return ranking;

	}
}
