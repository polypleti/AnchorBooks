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
		
		Libreria libreria = new Libreria();
		libreria.guardarLibrosAPI();
		
	}

}
