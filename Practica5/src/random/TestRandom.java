package random;

public class TestRandom {

	public static void main(String[] args) {
		int random;
		for (int i = 0; i < 100; i++) {
			random = GeneraRandom.obtenerRandom();
			if (random <= 0 || random > GeneraRandom.MAXIMO_VALOR) {
				System.out.println("Fuera de rango");
			} else{
				System.out.println("OK");
			}
		}
	}
}
