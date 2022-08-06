package cl.fsj.infoclub;



public class MainClass {

	public static void main(String[] args) {
		
		Libreria libreria = new Libreria();
		libreria.guardarLibrosAPI();
		libreria.mostrarLibros();
		System.out.println("\n*************************");
		libreria.dosLibros(3,8);
		libreria.mostrarLibrosAPI();
		libreria.mostrarLibrosUnknown();
		libreria.mostrarLibrosDelivery();
	}

}
