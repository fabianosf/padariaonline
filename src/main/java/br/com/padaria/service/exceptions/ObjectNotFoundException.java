package br.com.padaria.service.exceptions;

/*
 * É uma classe para tratamento de erros
 * relacionado aos SERVICES da aplicacao. 
 * msg = uma mensage configurada
 * causa = aqui fala a causa que deu *
 * 
 */


public class ObjectNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	

}
