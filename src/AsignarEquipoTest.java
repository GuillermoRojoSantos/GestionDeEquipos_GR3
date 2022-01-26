import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEquipoTest {

    @Test
    void testNombreJugadorDeMenosCaracteres(){
        //añadimos un nombre de jugador de menos de 4 caracteres
        //en primer lugar creamos un jugador y un equipo
        Jugador jugador = new Jugador();
        Equipo equipo = new Equipo();
        String nombreJugador = "Mik";
        jugador.setNombreJugador(nombreJugador);
        int longitudNombreMinima = 4;
        int longitudNombreMaxima = 20;
        assertEquals(longitudNombreMinima, jugador.getNombreJugador().length());
    }

    @Test
    void Nombre4y20Caracteres(){
        //creamos un nuevo jugador y le asignamos un nombre
        //para esta prueba hemos determinado que el nombre debería ser 9 letras
        //usamos el setter del jugador para asignar un nombre y el getter para el
        //assertEquals
       Jugador jugador = new Jugador();
       Equipo equipo = new Equipo();
       String nombreJugador= "Cristiano";
       jugador.setNombreJugador(nombreJugador);
        int longitudNombreAdecuada = 9;
        assertEquals(longitudNombreAdecuada, jugador.getNombreJugador().length());
    }

    @Test
    void NombreMas20Caracteres(){
        //creamos un nuevo jugador y le asignamos un nombre de mas de 20 caracteres
        //en el assertEquals introducimos la longitud maxima (20) y el getter más el
        //.length para saber la longitud del nombre
        Jugador jugador = new Jugador();
        Equipo equipo = new Equipo();
        String nombreJugador= "Bullaunancheathrairaluinn";
        jugador.setNombreJugador(nombreJugador);
        int longitudNombreMaxima = 20;
        assertEquals(longitudNombreMaxima, jugador.getNombreJugador().length());
    }

    @Test
    void NombreEquipoMenosCaracteres(){
        Jugador jugador = new Jugador();
        Equipo equipo = new Equipo();
        String nombreEquipo = "asd";
        equipo.setNombreEquipo(nombreEquipo);
        int longitudNombreMinima = 4;
        int longitudNombreMaxima = 20;
        assertEquals(longitudNombreMinima, equipo.getNombreEquipo().length());
    }


    @Test
    void NombreEquipoEntre4y20Caracteres(){
        Jugador jugador = new Jugador();
        Equipo equipo = new Equipo();
        String nombreEquipo = "tomates";
        equipo.setNombreEquipo(nombreEquipo);
        int longitudNombreAdecuada = 7;
        assertEquals(longitudNombreAdecuada, equipo.getNombreEquipo().length());
    }


    @Test
    void NombreEquipoMásCaracteres(){
        Jugador jugador = new Jugador();
        Equipo equipo = new Equipo();
        String nombreEquipo = "supercalifragilisticoespialidoso";
        equipo.setNombreEquipo(nombreEquipo);
        int longitudNombreMaxima = 20;
        assertEquals(longitudNombreMaxima, equipo.getNombreEquipo().length());
    }

}