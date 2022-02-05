import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEquipoTest {

    @Test
    void TestEquipoNoExiste(){
        Equipo equipo= null;
        assertEquals(null,equipo);
    }
/*Tests de quipo correcto dividido en dos pruebas para el nombre y ranking*/
    @Test
    void TestNombreEquipoCorrecto(){
        Equipo equipo = new Equipo();
        String nombreEquipo= "Real Madrid";
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(4);
        assertEquals(nombreEquipo, equipo.getNombreEquipo());
    }
    @Test
    void TestRankingEquipoCorrecto() {
        Equipo equipo = new Equipo();
        String nombreEquipo = "Real Madrid";
        int rankingEquipo=4;
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(rankingEquipo);
        assertEquals(rankingEquipo,equipo.getRanking());
    }

    @Test
    void TestNombreEquipoIncorrecto(){
        Equipo equipo=new Equipo();
        String nombreEquipo="Rea";
        int rankingEquipo=4;
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(rankingEquipo);
        assertEquals(null,equipo.getNombreEquipo());
    }

    @Test
    void TestRankingEquipoIncorrecto(){
        Equipo equipo=new Equipo();
        String nombreEquipo="Real Madrid";
        int rankingEquipo=52425;
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(rankingEquipo);
        assertEquals(0, equipo.getRanking());
    }

}