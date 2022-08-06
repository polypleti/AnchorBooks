package cl.fsj.infoclub;



public class MainClass {

	public static void main(String[] args) {
		
		Libreria libreria = new Libreria();
		libreria.guardarLibrosAPI();
		libreria.guardarDetallesLibros();
		libreria.mostrarLibros();
		System.out.println("\n*************************");
		libreria.dosLibros(3,8);
		System.out.println("\n*************************");
		libreria.mostrarLibrosAPI();
		System.out.println("\n*************************");
		libreria.mostrarLibrosUnknown();
		System.out.println("\n*************************");
		libreria.mostrarLibrosDelivery();
	}

}
