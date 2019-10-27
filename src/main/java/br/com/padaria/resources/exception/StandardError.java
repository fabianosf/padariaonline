package br.com.padaria.resources.exception;

import java.io.Serializable;

/*
 * Essa classe esta relacionado ao ResourceException Handler, pois 
 * ela vai mostrar as respostas de erro do HTTP de uma forma mais legivel 
 * para o usuario final ou para outrem !
 * 
 */

public class StandardError implements Serializable{	

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	 

}
