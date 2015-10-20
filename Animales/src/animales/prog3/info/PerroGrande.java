package animales.prog3.info;

public class PerroGrande extends Perro {
	@Override
	public void saludo(){
		System.out.println("Guauuuuu!");
	}
	
	@Override
	public void saludo(Perro otro){
		System.out.println("Guauuuuu! Guauuuuu!");
	}

}
