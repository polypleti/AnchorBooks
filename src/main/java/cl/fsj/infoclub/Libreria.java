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
	
	ArrayList <Book> libros = new ArrayList<Book>();
	ArrayList <BookDetail> detalleLibros = new ArrayList <BookDetail>();

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
		for(Book libro: libros) {
			System.out.println("Los libros que hay en la libreria son: \n");
			System.out.println(libro.getAuthor() + ": " + libro.getTitle());
		}
	}
	
}
