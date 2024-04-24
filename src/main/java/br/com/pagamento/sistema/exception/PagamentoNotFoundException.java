package br.com.pagamento.sistema.exception;

public class PagamentoNotFoundException extends RuntimeException{
	
	// Identificador de versão
	// Classe Serializable
	// Final a variável é definida uma unica vez
	// long => um int com maior quantidade de números disponíveis
	private static final long serialVersionUID = 1L;
	
	// Construtor vazio
	public PagamentoNotFoundException() {
		super();
	}
	
	// Construtor com uma mensagem
	public PagamentoNotFoundException(String mensagemCostumizada) {
		super(mensagemCostumizada);
	}
}
