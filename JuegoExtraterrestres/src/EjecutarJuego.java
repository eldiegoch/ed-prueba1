import personajes.Extraterrestre;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class EjecutarJuego {

	/**sdfsadfsadfds
	 * @param args
	 */
	public static void main(String[] args) {
		Extraterrestre miEt = new Extraterrestre();
		String dialogoEt = miEt.hablar();
		System.out.println(dialogoEt);
		
		double numeroD = 60;
		numeroD = numeroD * 150;
		numeroD = hacerLogaritmo(numeroD);
		
		System.out.println("El logaritmo es: " + numeroD);
	}
	
	private static double hacerLogaritmo(double numero) {
		double resultado = Math.log(numero);
		resultado = sumarNumero(resultado, 20);
		return resultado;
	}
	
	
	private static double sumarNumero(double numero, double numeroASumar) {
		double resultadoSuma = numero + numeroASumar;
		return resultadoSuma;
	}
	
	
	
	
	
	
	
	
	
	

}
