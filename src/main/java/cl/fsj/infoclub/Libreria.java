package cl.fsj.infoclub;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Libreria {
	
	private ArrayList <Book> libros = new ArrayList<Book>();
	private ArrayList <BookDetail> detalleLibros = new ArrayList <BookDetail>();

	public Libreria() {
		super();
	}

	public void guardarLibrosAPI() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		Invocation.Builder invocacionBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAPI = invocacionBuilder.get();
		
		libros = respuestaAPI.readEntity(new GenericType<ArrayList<Book>>(){});
	}
	
	public void guardarDetallesLibros() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("bookDetail");
		Invocation.Builder invocacionBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAPI = invocacionBuilder.get();
		detalleLibros = respuestaAPI.readEntity(new GenericType<ArrayList<BookDetail>>(){});
	}
	
	
	public void mostrarLibros() {
		System.out.println("Los libros que hay en la libreria son: \n");

		for(Book libro: libros) {
			System.out.println(libro.getAuthor() + ": " + libro.getTitle());
		}
	}
	
	public void dosLibros(int pos1, int pos2) {
		System.out.println("Libro número "+pos1+": "+libros.get(pos1).getAuthor()+", "
				+libros.get(pos1).getTitle()+", "+libros.get(pos1).getCountry()
		);
		System.out.println("Libro número "+pos2+": "+libros.get(pos2).getAuthor()+", "
				+libros.get(pos2).getTitle()+", "+libros.get(pos2).getCountry()
		);
	}
	
	public void mostrarLibrosAPI() {
		ArrayList<BookDetail> librosAPI;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("bookDetail");
		Invocation.Builder invocacionBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAPI = invocacionBuilder.get();
		librosAPI = respuestaAPI.readEntity(new GenericType<ArrayList<BookDetail>>(){});
		System.out.println("Los Libros del API son: ");
		for(BookDetail libro: librosAPI) {
			System.out.println("\n " + libro);
		}
	}
	
	
	public void mostrarLibrosUnknown() {
		System.out.println("Los libros que tienen autor desconocido son: \n");
		for(Book libro: libros) {
			if(libro.getAuthor().equalsIgnoreCase("Unknown"))
				System.out.println(libro.getAuthor() + ": " + libro.getTitle());
		}
	}
	
	public void mostrarLibrosDelivery() {
		System.out.println("Los libros que tienen delivery disponible son: \n");
		for(BookDetail libro: detalleLibros) {
			if(libro.getDelivery() == true)
				System.out.println(libro.getAuthor() + ": " + libro.getTitle());
		}
	}
}
