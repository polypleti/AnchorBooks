package cl.fsj.infoclub;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class MainClass {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		Invocation.Builder invocacionBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAPI = invocacionBuilder.get();
		
		List<Book> lista = respuestaAPI.readEntity(new GenericType<List<Book>>(){});
		System.out.println(lista.get(0));
	}

}
