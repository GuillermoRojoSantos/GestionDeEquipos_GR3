import java.util.Objects;

public class AsignarEquipo {
private Equipo equipo;
private Jugador jugador;

public void setEquipo(Equipo equipo) {
if (equipo.getNombreEquipo().length() >= 4 && equipo.getNombreEquipo().length() <= 20
&& equipo.getNombreEquipo() != null) {
if (equipo.getRanking() >= 0 && equipo.getRanking() <= 10) {
this.equipo = equipo;
} else {
this.equipo = null;
}
} else {
this.equipo = null;
}
}

public void setJugador(Jugador jugador) {
if (jugador.getNombreJugador().length() >= 4 && jugador.getNombreJugador().length() <= 20
&& jugador.getNombreJugador() != null) {
if (jugador.getEdad() > 0) {
if (Objects.equals(jugador.getIdioma(), "Frances") || Objects.equals(jugador.getIdioma(), "Español")
|| Objects.equals(jugador.getIdioma(), "Aleman")) {
this.jugador = jugador;
} else {
this.jugador = null;
}
}
} else {
this.jugador = null;
}
}

public Equipo getEquipo() {
return equipo;
}

public Jugador getJugador() {
return jugador;
}

}
