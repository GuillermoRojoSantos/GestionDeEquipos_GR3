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
		String idioma ="Español";
		jugador.setIdioma(idioma);
		assertEquals(idioma,jugador.getIdioma());
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
		assertEquals(0, (Integer)jugador.getEdad());
	}
	//Set edad vacía
	@Test
	void testSetVacia() {
		Jugador jugador = new Jugador();
		int edad = 0 ;
		jugador.setEdad(edad);
		assertEquals(0, (Integer)jugador.getEdad());
	}/*
	//El jugador tiene la edad mínima para ser junior(válido)
	@Test
	void testTipoJugadorJuniorEdadMinima() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Junior");
	}
	//El jugador tiene entre 18 y 25 años(válido)
	@Test
	void testTipoJugadorJunior() {
		Jugador jugador = new Jugador();
		int edad = 20;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Junior");
	}
	//Si el jugador tiene la edad maxima para ser junior(válido)
		@Test
		void testTipoJugadorJuniorEdadMaxima() {
			Jugador jugador = new Jugador();
			int edad = 25;
			jugador.setEdad(edad);
			String nombre="Romeo";
			jugador.setNombreJugador(nombre);
			String idioma="español";
			jugador.setIdioma(idioma);
			assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Junior");
		}
	//Si el jugador tiene entre 25 y 35 años, devuelve tipo Senior(válido)
	@Test
	void testTipoJugadorSenior() {
		Jugador jugador = new Jugador();
		int edad = 30;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Senior");
	}
	//El jugador tiene la edad minima para ser senior
	@Test
	void testTipoJugadorSeniorEdadMinima() {
		Jugador jugador = new Jugador();
		int edad = 26;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Senior");
	}
	//El jugador tiene la edad máxima para ser senior
	@Test
	void testTipoJugadorSeniorEdadMaxima() {
		Jugador jugador = new Jugador();
		int edad = 35;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Senior");
	}
	//Si el jugador tiene más de 35 años, devuelve tipo Master(válido)
	@Test
	void testTipoJugadorMaster() {
		Jugador jugador = new Jugador();
		int edad = 40;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),"Master");
	}
	//El campo nombre está vacío (inválido)
	@Test
	void testTipoJugadorConNombreVacio() {
		Jugador jugador = new Jugador();
		int edad = 20;
		jugador.setEdad(edad);
		String nombre="";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),null);
	}
	//El campo edad está vacío(inválido)
	@Test
	void testTipoJugadorConEdadVacia() {
		Jugador jugador = new Jugador();
		int edad = 0;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="español";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),null);
	}
	//El campo idioma está vacío(inválido)
	@Test
	void testTipoJugadorConIdiomaVacio() {
		Jugador jugador = new Jugador();
		int edad = 20;
		jugador.setEdad(edad);
		String nombre="Romeo";
		jugador.setNombreJugador(nombre);
		String idioma="";
		jugador.setIdioma(idioma);
		assertEquals(jugador.tipoJugador(edad, nombre, idioma),null);
	}*/
}
