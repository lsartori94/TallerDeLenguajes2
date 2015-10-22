import java.util.Collection;
import java.util.HashSet;


public class TestHashSetCuentaAgregados {

	public static void main(String[] args) {
		HashSetCuentaAgregados<String> instrumentos = new HashSetCuentaAgregados<String>();
		Collection<String> c = new HashSet<String>();
		c.add("Violin"); c.add("Piano");c.add("Xilofon"); c.add("Violin");
		c.add("Bateria"); c.add("Guitarra"); c.add("Trompeta");
		instrumentos.addAll(c);
		System.out.println(" ");
		System.out.println(instrumentos.toString());
		System.out.println("La cantidad de agregados es: "+instrumentos.getCantidadAgregados());
	}

}
