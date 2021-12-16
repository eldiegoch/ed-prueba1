package personajes;

/**
 * Esta es una cla  mvjhvhhse que representa un Extraterrestre
 * en nuestro juego. 
 * @author Diego
 * 
 * @version 0.1
 *
 */
public class Extraterrestre {

	private String nombre;

	private int posX;
	private int posY;
	private boolean tieneAntenas;
	private String lenguaje;

	/**
	 * Este método genera una frase aleatoria que puede usarse
	 * para diálogos de un extraterrestre.
	 * @return Una frase aleatoria que habla el extraterrestre 
	 */
	public String hablar() {
		//TODO terminar este metodo, está incompleto
		return "Me llamo Paco y soy de fuera del planeta Tierra";
	}
	
	/**
	 * Mueve a un extraterrestre por el tablero, 
	 * basándose en los incrementos que llegan por 
	 * parámetros
	 * @param incX Un incremento para aumentar en el ejeX
	 * @param incY Un incremento para aumentar en el ejeY
	 */
	public void moverse(int incX, int incY) {
		//TODO completar
	}
	
	/**
	 * Este metodo mueve al personaje en el eje X
	 * @deprecated Este método se sustituye por el de moverse(int, int)
	 * @param incX
	 */
	public void moverse(int incX) {
		
	}
	/**
	 * Bla bla bla
	 * @param otro Instancia de Marciano del que se sacará una frase
	 * @return Frase que extraerá de la mente del otro
	 * @see Marciano
	 */
	public String leerMente(Marciano otro) {
		return "";
	}
	
	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public boolean isTieneAntenas() {
		return tieneAntenas;
	}

	public void setTieneAntenas(boolean tieneAntenas) {
		this.tieneAntenas = tieneAntenas;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

}
