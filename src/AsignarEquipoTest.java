import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEquipoTest {
	
	/*---------------------------------------------------------------------
	          EMPIEZAN LOS TEST DE SET JUGADOR DE ASIGNAR EQUIPO
	-----------------------------------------------------------------------*/
	
	//Jugador inexistente
	//El resultado esperado es que sea INVÁLIDO
	@Test
	void testSetJugadorInexistente() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
			Jugador jugador = new Jugador();
			jugador.setNombreJugador("");
			jugador.setEdad(0);
			jugador.setIdioma("");
			
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertNull(jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertNull(jugadorGuardado.getIdioma());
	
	}
	
	//Asignar jugador que exista y tenga todos los campos válidos
	//El resultado esperado es que sea VÁLIDO
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista y tenga el campo nombre inválido
	//El resultado esperado es que sea INVÁLIDO
	@Test
	void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con algún campo inválido*/
		Jugador jugador = new Jugador();
		String nombreInvalido = "Ana";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombreInvalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}	

	//Asignar jugador que exista y tenga el campo edad inválido
	//El resultado esperado es que sea INVÁLIDO
	@Test
	void testSetJugadorEdadInvalida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con algún campo inválido*/
		Jugador jugador = new Jugador();
		String nombreValido = "Manuel";
		int edadInvalida = 16;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadInvalida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombreValido, jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}	
	
	//Asignar jugador que exista y tenga el campo idioma inválido
	//El resultado esperado es que sea INVÁLIDO
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con algún campo inválido*/
		Jugador jugador = new Jugador();
		String nombreValido = "Manuel";
		int edadValida = 20;
		String idiomaInvalido = "Chino";
		jugador.setNombreJugador(nombreValido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaInvalido);
			
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
			
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombreValido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}	
	
	//Asignar jugador que exista y tenga el nombre vacío
	//El resultado esperado es que sea INVÁLIDO
	@Test
	void testSetJugadorSinNombre() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}		
	
	//Asignar jugador que exista y tenga la edad vacía
	//El resultado esperado es que sea INVÁLIDO
		@Test
		void testSetJugadorSinEdad() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombreValido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombreValido);
		jugador.setIdioma(idiomaValido);
			
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombreValido, jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}	
	
		//Asignar jugador que exista y tenga el idioma vacío
		//El resultado esperado es que sea INVÁLIDO
			@Test
			void testSetJugadorSinIdioma() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			/*Creamos un jugador con todos los campos válidos*/
			Jugador jugador = new Jugador();
			String nombreValido = "Antonio";
			int edadValida = 20;
			String idiomaValido = "Español";
			jugador.setNombreJugador(nombreValido);
			jugador.setEdad(edadValida);
				
			/*Asignar el jugador creado en asignar equipo*/
			asignarEquipo.setJugador(jugador);
			
			Jugador jugadorGuardado = asignarEquipo.getJugador(); 
			assertNotNull(jugadorGuardado);
			assertEquals(nombreValido, jugadorGuardado.getNombreJugador());
			assertEquals(edadValida, jugadorGuardado.getEdad());
			assertEquals(null, jugadorGuardado.getIdioma());
		}
	
	

	/*---------------------------------------------------------------------
			   EMPIEZAN LOS TEST DE SET EQUIPO DE ASIGNAR EQUIPO
	-----------------------------------------------------------------------*/
	
	//Asignar equipo que exista y tenga todos los campos válidos
	//El resultado esperado es que sea válido
	@Test
	void testSetEquipoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con todos los campos válidos*/
		Equipo equipo = new Equipo();
		String nombreValido = "Betis";
		int rankingValido = 7;
		equipo.setNombreEquipo(nombreValido);
		equipo.setRanking(rankingValido);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(nombreValido, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	
	//Asignar equipo que no exista
	//El resultado esperado es que sea inválido
	@Test
	void testSetEquipoInexistente() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con algún campo inválido*/
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("");
		equipo.setRanking(-1);
			
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
				
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertNull(equipoGuardado.getNombreEquipo());
		assertEquals(-1, equipoGuardado.getRanking());
	}		

	//Asignar equipo que exista y tenga el campo nombre inválido
	//El resultado esperado es que sea inválido
	@Test
	void testSetEquipoNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con algún campo inválido*/
		Equipo equipo = new Equipo();
		String nombreInvalido = "Rea";
		int rankingValido = 7;
		equipo.setNombreEquipo(nombreInvalido);
		equipo.setRanking(rankingValido);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	//Asignar equipo que exista y tenga el campo ranking inválido
	//El resultado esperado es que sea inválido
	@Test
	void testSetEquipoRankingInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con algún campo inválido*/
		Equipo equipo = new Equipo();
		String nombreValido = "Barcelona";
		int rankingInvalido = 13;
		equipo.setNombreEquipo(nombreValido);
		equipo.setRanking(rankingInvalido);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
	
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(nombreValido, equipoGuardado.getNombreEquipo());
		assertEquals(-1, equipoGuardado.getRanking());
	}		
	
	//Asignar equipo que exista y tenga el campo nombre vacío
	//El resultado esperado es que sea inválido
	@Test
	void testSetEquipoNombreVacío() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con algún campo inválido*/
		Equipo equipo = new Equipo();
		String nombreValido = "Betis";
		int rankingValido = 7;
		equipo.setRanking(rankingValido);
			
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
			
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}	
	
	//Asignar equipo que exista y tenga el campo ranking vacío
	//El resultado esperado es que sea inválido
	@Test
	void testSetEquipoRankingVacío() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un equipo con algún campo inválido*/
		Equipo equipo = new Equipo();
		String nombreValido = "Betis";
		
		equipo.setNombreEquipo(nombreValido);
				
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
				
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		assertNotNull(equipoGuardado);
		assertEquals(nombreValido, equipoGuardado.getNombreEquipo());
		assertEquals(0, equipoGuardado.getRanking());
		}		
}
