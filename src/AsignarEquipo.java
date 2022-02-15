/**
 * Esta clase guarda un equipo y un jugador si recibe correctos todos los campos 
 * @author LUIS GUTIÉRREZ CHAMIZO
 *
 */

public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;

	/**
	 * Este método guarda un equipo si recibe de los campos con el formato correcto 
	 * @param equipo que se quiere guardar
	 */
	public void setEquipo(Equipo equipo) {
		if (EquipoValido(equipo)) {
			if (comprobarCadena(equipo.getNombreEquipo())) {
				if (comprobarInt(equipo.getRanking())) {
					this.equipo = equipo;
				}
			}
		}
	}

	/**
	 * Getter de equipo 
	 * @return equipo
	 */
	public Equipo getEquipo() {
		return this.equipo;
	}

	/**
	 * Método que guarda un jugador si todos sus campos son correctos
	 * @param jugador que se quiere guardar
	 */
	public void setJugador(Jugador jugador) {
		if (JugadorValido(jugador)) {
			if (jugador.getNombreJugador()!=null) {
				if (jugador.getEdad()!=0) {
					if (comprobarCadena(jugador.getIdioma())) {
						this.jugador = jugador;
					}
				}
			}
		} 
	}

	/**
	 * Getter de jugador
	 * @return jugador 
	 */
	public Jugador getJugador() {
		return this.jugador;
	}

	/**
	 * 
	 * @param jugador que se quiere guardar
	 * @return boolean valido (true si jugador no es null)
	 */
	private boolean JugadorValido(Jugador jugador) {
		boolean valido = false;

		if (jugador != null) {
			valido = true;
		} 

		return valido;
	}

	/**
	 * 
	 * @param equipo que se quiere guardar
	 * @return boolean valido (true si el equipo no es null)
	 */
	private boolean EquipoValido(Equipo equipo) {
		boolean valido = false;

		if (equipo != null) {
			valido = true;
		} 

		return valido;
	}

	/**
	 * @param ranking del equipo que se quiere guardar
	 * @return boolean hasRanking (true si el ranking es distinto de 0)
	 */
	private boolean comprobarInt(int ranking) {
		boolean hasRanking = true;

		if (ranking != -1) {
			hasRanking = true;
		} else {
			hasRanking = false;
		}

		return hasRanking;
	}

	/**
	 * 
	 * @param name del jugador que se quiere guardar
	 * @return boolean nombreCorrecto (devuelve true si el nombre es correcto)
	 */
	private boolean comprobarCadena(String name){
        boolean nombreCorrecto = false;

        if (name != null){
            if (name.length()>0){
                nombreCorrecto = true;
            } 
        } 
        return nombreCorrecto;
    }
}
