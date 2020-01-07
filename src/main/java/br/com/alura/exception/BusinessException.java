package br.com.alura.exception;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.ApplicationException;

//quando tem rollback o email n�o � salvo e enviado, RuntimeException gera um rollback
//JTA(java transaction api)
@ApplicationException(rollback = true)
public class BusinessException extends RuntimeException {

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
