import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	//Test del campo nombre del Equipo Vacio
	//Se espera que de error 
	void testSetNombreEquipoNombreVacio() {
		Equipo equipo =new Equipo();
		String nombre= null;
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con insuficientes caracteres, menor que 4
	//Se espera que de error 
	void testSetNombreEquipoNombreValorInsuficiente() {
		Equipo equipo =new Equipo();
		String nombre= "Ana";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor minimo de caracteres, 4
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValorMinimo() {
		Equipo equipo =new Equipo();
		String nombre= "Jose";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor correcto de caracteres, entre 4 y 20
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValido() {
		Equipo equipo =new Equipo();
		String nombre= "Jose Antonio";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el valor maximo de caracteres, 20
	//Se espera que se acepte el nombre
	void testSetNombreEquipoNombreValorMaximo() {
		Equipo equipo =new Equipo();
		String nombre= "Ana Maria del Carmen";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con un valor por encima del
	//valor maximo de caracteres
	//Se espera que de error
	void testSetNombreEquipoNombreLargo() {
		Equipo equipo =new Equipo();
		String nombre= "Ana Maria de la Concepcion";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo nombre del Equipo con el uso de caracteres especiales
	//y numeros
	//Se espera que de error
	void testSetNombreEquipoNombreInvalido() {
		Equipo equipo =new Equipo();
		String nombre= "@er56#PQ*";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con el valor nulo
	//Se espera que de error
	void testSetRankingVacio() {
		Equipo ranking =new Equipo();
		int posicion=null;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con un valor por debajo del minimo
	//Se espera que de error
	void testSetRankingMenorCero() {
		Equipo ranking =new Equipo();
		int posicion=-2;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}

	@Test
	//Test del campo ranking del Equipo con el valor minimo, 0
	//Se espera que se acepte
	void testSetRankingValorMinimo() {
		Equipo ranking =new Equipo();
		int posicion=0;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}

	@Test
	//Test del campo ranking del Equipo con un valor valido
	//Se espera que se acepte
	void testSetRankingValido() {
		Equipo ranking =new Equipo();
		int posicion=4;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con el valor maximo, 10
	//Se espera que se acepte
	void testSetRankingValorMaximo() {
		Equipo ranking =new Equipo();
		int posicion=10;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con un valor por encima del maximo
	//Se espera que de error
	void testSetRankingValorGrande() {
		Equipo ranking =new Equipo();
		int posicion=27;
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}
	
	@Test
	//Test del campo ranking del Equipo con una entrada invalida,
	//cadena de caracteres, caracteres especiales...
	//Se espera que de error
	void testSetRankingInvalido() {
		Equipo ranking =new Equipo();
		int posicion= "@#me45P";
		ranking.setRanking(posicion);
		assertEquals(posicion,ranking.getNombreEquipo());
	}
	
}
