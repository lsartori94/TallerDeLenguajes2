package random;

public abstract class GeneraRandom {
	// Max value
	protected static int MAXIMO_VALOR = 999999999;

	public static int obtenerRandom(){
		double tmp = 0.0;
		while(tmp == 0.0){
			tmp = Math.random();
		}
		return (int)(tmp * (double)MAXIMO_VALOR);
	}
}