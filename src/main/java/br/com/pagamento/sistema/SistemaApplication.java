package br.com.pagamento.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Anotation => Indica que é um projeto SprinfBoot
@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		//Ele cria um contexto que é uma palicação Spring
		//Varredura, das lasses antes de Iniciar
		//Inicia a Aplicação
		SpringApplication.run(SistemaApplication.class, args);
	}

}
