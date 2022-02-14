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
            //Comprobamos si es null
            if (JugadorValido(jugador)) {
                  if (comprobarCadena(jugador.getNombreJugador())) {
                        if (comprobarInt(jugador.getEdad())) {
                              if (comprobarCadena(jugador.getIdioma())) {
                                    this.jugador = jugador;
                              }
                        }
                  }
            }
      }


      public Jugador getJugador() {
            return this.jugador;
      }

      //Nos devuelve un true si es distinto a nulo.
      private Boolean JugadorValido(Jugador comprobar) {
            boolean valido = true;

            if (comprobar == null) {
                  valido = false;
            } else {
                  valido = true;
            }

            return valido;
      }

      private boolean EquipoValido(Equipo comprobar) {
            boolean valido = true;

            if (comprobar == null) {
                  valido = false;
            } else {
                  valido = true;
            }

            return valido;
      }

      private boolean comprobarInt(int rank) {
            boolean hasRanking = true;

            if (rank != 0) {
                  hasRanking = true;
            } else {
                  hasRanking = false;
            }

            return hasRanking;
      }

      private boolean comprobarCadena(String name) {
            boolean nombreCorrecto = true;

            if (name != null) {
                  if (name.length() > 0) {
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
