package com.Adilen.Bodega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class BodegaApplication {
	public static void main(String[] args) {
		SpringApplication.run(BodegaApplication.class, args);
		
	}

	// Testing de la ruta principal(/) | Eliminar cuando se programe las otras
	// rutas.
	@RestController
	public class TestController {
		@GetMapping("/")
		public String Home() {
			return "This is the test lobby";
		}
	}
}
