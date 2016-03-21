package www.frida.modelo;

import java.sql.Date;

public class ArmResponsePsEquipo {
	 private int Id;
	 private String nombreEquipo;
	 private String identificadorArm;
	 private String idNodo;
	 private String messageId;
	 private String xmlMessage;
	 private java.util.Date fechaMensajeArm;
	 
	 public ArmResponsePsEquipo(){
		 
	 }
	 
	 public ArmResponsePsEquipo(int id, String nombreEquipo, String identificadorArm, String idNodo, String messageId,
				String xmlMessage, Date fechaMensajeArm) {
			super();
			Id = id;
			this.nombreEquipo = nombreEquipo;
			this.identificadorArm = identificadorArm;
			this.idNodo = idNodo;
			this.messageId = messageId;
			this.xmlMessage = xmlMessage;
			this.fechaMensajeArm = fechaMensajeArm;
		}

	 
	 


	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	public String getIdentificadorArm() {
		return identificadorArm;
	}


	public void setIdentificadorArm(String identificadorArm) {
		this.identificadorArm = identificadorArm;
	}


	public String getIdNodo() {
		return idNodo;
	}


	public void setIdNodo(String idNodo) {
		this.idNodo = idNodo;
	}

	
	public String getXmlMessage() {
		return xmlMessage;
	}


	public void setXmlMessage(String xmlMessage) {
		this.xmlMessage = xmlMessage;
	}


	public java.util.Date getFechaMensajeArm() {
		return fechaMensajeArm;
	}


	public void setFechaMensajeArm(java.util.Date date) {
		this.fechaMensajeArm = date;
	}
	 
	 
	 
	

}
