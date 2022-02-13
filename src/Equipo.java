public class Equipo {
	private String nombreEquipo;
	private int ranking;

	public Equipo() {}

	public boolean nombreLenght(String nombreEquipo) {
		boolean nombreLenght = false;
		if (nombreEquipo.length() >= 4 && nombreEquipo.length() <= 20) {
			nombreLenght = true;
		} else {
			nombreLenght = false;
		}
		return nombreLenght;
	}

	public boolean rangeRanking(int ranking) {
		boolean rangeRanking = false;
		if (ranking >= 0 && ranking <= 10) {
			rangeRanking = true;
		} else {
			rangeRanking = false;
		}
		return rangeRanking;
	}

	public boolean isNull(String nombreEquipo) {
		boolean isNull = false;
		if (nombreEquipo.contains(null)) {
			isNull = false;
		} else {
			isNull = true;
		}
		return isNull;
	}

	public boolean isLetter(String nombreEquipo) {
		boolean isLetter = false;
		for (int i = 0; i < nombreEquipo.length(); i++) {
			if (Character.isLetter(nombreEquipo.charAt(i)) == false) {
				isLetter = false;
			} else {
				isLetter = true;
				i = nombreEquipo.length();
			}
		}
		return isLetter;
	}

	public boolean isUppercase(String nombreEquipo) {
		boolean isUppercase = false;
		for (int i = 0; i < nombreEquipo.length(); i++) {
			if (nombreEquipo.equals(nombreEquipo.toUpperCase())) {
				isUppercase = true;
			} else {
				isUppercase = false;
				i = nombreEquipo.length();
			}
		}
		return isUppercase;
	}

	public void setNombreEquipo(String nombreEquipo) {
		if (isLetter(nombreEquipo)) {
			if (nombreLenght(nombreEquipo)) {
				if (isUppercase(nombreEquipo)) {
					if (isNull(nombreEquipo)) {
						this.nombreEquipo = nombreEquipo;
					}
				}
			}
		} else {
			this.nombreEquipo = null;
		}
	}

	public void setRanking(int ranking) {
		if (rangeRanking(ranking)) {
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
}
