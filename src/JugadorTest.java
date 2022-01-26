import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * 
 */
/**
 * @author loren
 *
 */
class JugadorTest {
	/**
	 * Guardar jugador con más de 4 caracteres
	 */
	@Test
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Antonio";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}
	/**
	 * Guardar jugador con menos de 4 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pep";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	/**
	 * Guardar jugador con 4 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}
	/**
	 * Guardar jugador con 20 caracteres
	 */
	@Test
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PepePepePepePepePepe";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}
	/**
	 * Guardar jugador con más de 20 caracteres
	 */
	@Test
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}
	/**
	 * Guardar jugador null
	 */
	@Test
	void testSetNombreJugadorInvalidoNulo() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}


	//Set idioma con valor valido
	@Test
	void testSetIdiomaValido() {
		Jugador jugador = new Jugador();
		String idioma = "español";
		jugador.setIdioma("español");
		assertEquals(idioma, jugador.getIdioma());
	}
	//Set idioma con valor no valido
	@Test
	void testSetIdiomaInvalido() {
		Jugador jugador = new Jugador();
		String idioma = "fráces";
		jugador.setIdioma("fránces");
		assertEquals(null, jugador.getIdioma());
	}
	//Set idioma con valor vacio
	@Test
	void testSetIdiomaVacio() {
		Jugador jugador = new Jugador();
		String idioma = "";
		jugador.setIdioma("");
		assertEquals(null, jugador.getIdioma());
	}
	//Set edad correcta
	@Test
	void testSetEdad() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		assertEquals(edad, jugador.getEdad());
	}
	//Set edad no valida
	@Test
	void testSetEdadIncorrecta() {
		Jugador jugador = new Jugador();
		int edad = 15;
		jugador.setEdad(edad);
		assertEquals(null, (Integer)jugador.getEdad());
	}
	//Set edad vacía
	@Test
	void testSetVacia() {
		Jugador jugador = new Jugador();
		int edad = 0 ;
		jugador.setEdad(edad);
		assertEquals(null, (Integer)jugador.getEdad());
	}
}