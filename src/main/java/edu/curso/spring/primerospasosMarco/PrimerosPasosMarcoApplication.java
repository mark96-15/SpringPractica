package edu.curso.spring.primerospasosMarco;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PrimerosPasosMarcoApplication {
	
	private static Logger log = LoggerFactory.getLogger(PrimerosPasosMarcoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PrimerosPasosMarcoApplication.class, args);
		log.info("Termino de cargar Spring Boot");
		log.info("Hola Mundo");
		log.debug("Iniciando aplicacion");
		log.warn("Este es un mensaje de advertencia para probar");
		log.error("Este es un mensaje de error para probar");
	}

}
