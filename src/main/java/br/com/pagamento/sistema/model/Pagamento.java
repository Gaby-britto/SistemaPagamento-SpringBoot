package br.com.pagamento.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Entidade indicando que é um Objeto
@Data // Gera automaticamente o getts and setters
@NoArgsConstructor //Não recebe argumentos
//@AllArgsConstructor
public class Pagamento {
	@Id
	@GeneratedValue
	
	private Long id;
	
	private String nome;
	private String localizacao;
	private double valor;
	
	
}
