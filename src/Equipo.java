public class Equipo {
	private String nombreEquipo;
	private int ranking;
	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo.length() >= 4 && nombreEquipo.length() <= 20) {
			for (int i = 0; i < nombreEquipo.length(); i++) {
				if (nombreEquipo.toLowerCase().charAt(i) >= 'a' && nombreEquipo.toLowerCase().charAt(i) <= 'z' || nombreEquipo.charAt(i) == ' ') 
				{
					this.nombreEquipo = nombreEquipo;
				} else {
					this.nombreEquipo = null;
					i = nombreEquipo.length();
				}
			}
		} else {
			this.nombreEquipo = null;
		}
	}
	
	public void setRanking(int ranking) {
		if (ranking >= 0 && ranking <= 10) {
			this.ranking = ranking;
		} else {
			this.ranking = -1;
		}
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public int getRanking() {
		return ranking;
	}
	public String categoriaEquipo() {
		if(ranking!=-1 && nombreEquipo!=null) {
			if(ranking>=7 && ranking<=10) {
				return "Primera";
			}
			else if(ranking>=3 && ranking<=6) {
				return "Segunda";
			}
			else if(ranking>=0 && ranking<=2) {
				return "Tercera";
			}
			else {
				return null;
			}
		}else {
			return null;}
	}
}
