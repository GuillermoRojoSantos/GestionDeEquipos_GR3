import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	//Test del campo nombre del Equipo Vacio
	//Se espera que de error 
	void testSetNombreEquipoNombreVacio() {
		Equipo equipo =new Equipo();
		String nombre= "";
		equipo.setNombreEquipo(nombre);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con insuficientes caracteres, menor que 4
	//Se espera que de error 
	void testSetNombreEquipoNombreValorInsuficiente() {
		Equipo equipo =new Equipo();
		String nombre= "ANA";
		equipo.setNombreEquipo(nombre);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor minimo de caracteres, 4
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValorMinimo() {
		Equipo equipo =new Equipo();
		String nombre= "JOSE";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor correcto de caracteres, entre 4 y 20
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValido() {
		Equipo equipo =new Equipo();
		String nombre= "JOSE ANTONIO";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor maximo de caracteres, 20
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValorMaximo() {
		Equipo equipo =new Equipo();
		String nombre= "ANA MARIA DEL CARMEN";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con un valor por encima del
	//valor maximo de caracteres
	//Se espera que de error
	void testSetNombreEquipoNombreLargo() {
		Equipo equipo =new Equipo();
		String nombre= "ANA MARIA DE LA CONCEPCION";
		equipo.setNombreEquipo(nombre);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el uso de caracteres especiales
	//y numeros
	//Se espera que de error
	void testSetNombreEquipoNombreInvalido() {
		Equipo equipo = new Equipo();
		String nombre= "@er56#PQ*";
		equipo.setNombreEquipo(nombre);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con el valor nulo
	//Se espera que de error
	void testSetRankingVacio() {
		Equipo equipo =new Equipo();
		int posicion= -1;
		equipo.setRanking(posicion);
		assertEquals(-1,equipo.getRanking());
		//assertEquals(null,(Integer) ranking.getRanking());
	}
	
	@Test
	//Test del campo ranking del Equipo con un valor por debajo del minimo
	//Se espera que de error
	void testSetRankingMenorCero() {
		Equipo equipo =new Equipo();
		int posicion=-2;
		equipo.setRanking(posicion);
		assertEquals(-1,equipo.getRanking());
		//assertNull(equipo.getRanking());
	}

	@Test
	//Test del campo ranking del Equipo con el valor minimo, 0
	//Se espera que se acepte
	void testSetRankingValorMinimo() {
		Equipo equipo =new Equipo();
		int posicion=0;
		equipo.setRanking(posicion);
		assertEquals(posicion,equipo.getRanking());
	}

	@Test
	//Test del campo ranking del Equipo con un valor valido
	//Se espera que se acepte
	void testSetRankingValido() {
		Equipo equipo =new Equipo();
		int posicion=4;
		equipo.setRanking(posicion);
		assertEquals(posicion,equipo.getRanking());
	}
	
	@Test
	//Test del campo ranking del Equipo con el valor maximo, 10
	//Se espera que se acepte
	void testSetRankingValorMaximo() {
		Equipo equipo =new Equipo();
		int posicion=10;
		equipo.setRanking(posicion);
		assertEquals(posicion,(Integer)equipo.getRanking());
	}
	
	@Test
	//Test del campo ranking del Equipo con un valor por encima del maximo
	//Se espera que de error
	void testSetRankingValorGrande() {
		Equipo equipo =new Equipo();
		int posicion=27;
		equipo.setRanking(posicion);
		assertEquals(-1,equipo.getRanking());
	}
	
	@Test
	//Test del campo ranking del Equipo con una entrada invalida,
	//cadena de caracteres, caracteres especiales...
	//Se espera que de error
	void testSetRankingInvalido() {
		Equipo equipo =new Equipo();
		NumberFormatException thrown = assertThrows(NumberFormatException.class ,()->{
		int posicion= Integer.parseInt("#me45P");
		equipo.setRanking(posicion);},"El ranking debe ser un entero");
		assertNull(thrown.getCause());
	}
	
}
