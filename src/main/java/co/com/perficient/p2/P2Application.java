package co.com.perficient.p2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P2Application {
	//TODO endpoint 1.listado de carros, filtrar y ordenar por atributos del carro
	//Swagger (http://localhost:8080/swagger-ui/index.html)

	//TODO endpoint que filtre por nombre, fecha de nacimiento(con un rango:entre año x a y)

	public static void main(String[] args) {
		SpringApplication.run(P2Application.class, args);
	}

}
