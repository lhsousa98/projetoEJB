package br.com.alura.exception;

import java.util.ArrayList;
import java.util.List;

public class BusinessException extends Exception {

	/**
	 * @author lhsousa
	 */
	private static final long serialVersionUID = 1L;
	private List<String> mensagens;

	public List<String> getMensagens() {
		return mensagens;
	}

	// adicionando nova mensagem na lista
	public void addMensagens(String mensagem) {
		this.mensagens.add(mensagem);
	}

	// Mensagem de exce��o
	public BusinessException() {
		super();
	}

	// Mensagem de exce��o herdando
	public BusinessException(String mensagem) {
		super(mensagem);
		mensagens = new ArrayList<>();
		mensagens.add(mensagem);
	}
}
