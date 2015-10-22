package par_generico;

public class TestParGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParGenerico<String, Integer> posiciones= new ParGenerico<String, Integer>();
		posiciones.setParams("Jorge", new Integer(1));
		System.out.println(posiciones.toString());
		posiciones.setParams("Alan", new Integer(2));
		System.out.println(posiciones.toString());
		posiciones.setParams("Luca", new Integer(3));
		System.out.println(posiciones.toString());
		posiciones.setParams("Agustin", new Integer(4));
		System.out.println(posiciones.toString());
	}
}
