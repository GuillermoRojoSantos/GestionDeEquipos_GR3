public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;

	public void setEquipo(Equipo equipo) {
		if (EquipoValido(equipo)) {
			if (comprobarCadena(equipo.getNombreEquipo())) {
				if (comprobarInt(equipo.getRanking())) {
					this.equipo = equipo;
				}
			}
		}
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setJugador(Jugador jugador) {
		if (JugadorValido(jugador)) {
			if (jugador.getNombreJugador()!=null) {
				if (jugador.getEdad()!=0) {
					if (comprobarCadena(jugador.getIdioma())) {
						this.jugador = jugador;
					}
				}
			}
		} else {
			this.jugador = null;
		}
	}

	public Jugador getJugador() {
		return this.jugador;
	}

	private boolean JugadorValido(Jugador jugador) {
		boolean valido = true;

		if (jugador == null) {
			valido = false;
		} else {
			valido = true;
		}

		return valido;
	}

	private boolean EquipoValido(Equipo equipo) {
		boolean valido = true;

		if (equipo == null) {
			valido = false;
		} else {
			valido = true;
		}

		return valido;
	}

	private boolean comprobarInt(int ranking) {
		boolean hasRanking = true;

		if (ranking != 0) {
			hasRanking = true;
		} else {
			hasRanking = false;
		}

		return hasRanking;
	}

	private boolean comprobarCadena(String name){
        boolean nombreCorrecto = true;

        if (name != null){
            if (name.length()>0){
                nombreCorrecto = true;
            } else {
                nombreCorrecto = false;
            }
        } else {
            nombreCorrecto = false;
        }
        return nombreCorrecto;
    }
}
