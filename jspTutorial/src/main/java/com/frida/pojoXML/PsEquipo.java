package com.frida.pojoXML;

public class PsEquipo {

	private String NombreEquipo;
	private String IdentificadorARM;
	private String ID_Nodo;
	private String messageId;
	
	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getNombreEquipo() {
		return NombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		NombreEquipo = nombreEquipo;
	}
	public String getIdentificadorARM() {
		return IdentificadorARM;
	}
	public void setIdentificadorARM(String identificadorARM) {
		IdentificadorARM = identificadorARM;
	}
	public String getID_Nodo() {
		return ID_Nodo;
	}
	public void setID_Nodo(String iD_Nodo) {
		ID_Nodo = iD_Nodo;
	}
	
}
