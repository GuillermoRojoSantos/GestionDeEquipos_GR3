public class Jugador {
    private String nombre;
    private int edad;
    private String idioma;
    public void setNombreJugador(String nombre) {
        if (nombre != null) {
            if (nombre.length() >= 4 && nombre.length() <= 20) {
                for (int i = 0; i < nombre.length(); i++) {
                    if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z' || nombre.charAt(i) == ' ') {
                        this.nombre = nombre;
                    } else {
                        this.nombre = null;
                        i = nombre.length();
                    }
                }
            } else {
                this.nombre = null;
            }
        } else {
            this.nombre = null;
        }
    }
    public void setEdad(int edad) {
        if (edad<18){
            this.edad=0;
        }else{
            this.edad=edad;
        }
    }
    public void setIdioma(String idioma) {
        if(idioma!=null) {
            if (idioma.equals("Inglés")||idioma.equals("Español")||idioma.equals("Alemán")||idioma.equals("Francés")) {
                this.idioma=idioma;
            }else{
                this.idioma=null;
            }
        }
    }
    public String getIdioma() {
        return idioma;
    }
    public String getNombreJugador() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String tipoJugador(int edad,String nombre,String idioma){
        String tipoJugador="";
        if(edad!=0 && nombre!=null && idioma!=null) {
            if(edad>=18 && edad<=25) {
                tipoJugador="Junior";
            }
            else if(edad>=26 && edad<=35) {
                tipoJugador="Senior";
            }
            else {
                tipoJugador="Master";
            }
        }
        else {
            tipoJugador=null;
        }
        return tipoJugador;
    }
}
