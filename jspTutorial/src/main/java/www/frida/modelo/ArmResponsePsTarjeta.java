package www.frida.modelo;

import java.util.Date;

public class ArmResponsePsTarjeta {
	
	private int Id;
	
	private String idTarjetaFrida;
	
	private String  idTarjetaArm;
		
	private String nombreTarjeta;
		
	private String  meesageId;

	private String  xmlMessage;

	private Date fechaMensaje;

	public ArmResponsePsTarjeta(){
		
	}

	public ArmResponsePsTarjeta(int id, String idTarjetaFrida, String idTarjetaArm, String nombreTarjeta,
			String meesageId, String xmlMessage, Date fechaMensaje) {
		super();
		Id = id;
		this.idTarjetaFrida = idTarjetaFrida;
		this.idTarjetaArm = idTarjetaArm;
		this.nombreTarjeta = nombreTarjeta;
		this.meesageId = meesageId;
		this.xmlMessage = xmlMessage;
		this.fechaMensaje = fechaMensaje;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getIdTarjetaFrida() {
		return idTarjetaFrida;
	}

	public void setIdTarjetaFrida(String idTarjetaFrida) {
		this.idTarjetaFrida = idTarjetaFrida;
	}

	public String getIdTarjetaArm() {
		return idTarjetaArm;
	}

	public void setIdTarjetaArm(String idTarjetaArm) {
		this.idTarjetaArm = idTarjetaArm;
	}

	public String getNombreTarjeta() {
		return nombreTarjeta;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	public String getMeesageId() {
		return meesageId;
	}

	public void setMeesageId(String meesageId) {
		this.meesageId = meesageId;
	}

	public String getXmlMessage() {
		return xmlMessage;
	}

	public void setXmlMessage(String xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

	public Date getFechaMensaje() {
		return fechaMensaje;
	}

	public void setFechaMensaje(Date fechaMensaje) {
		this.fechaMensaje = fechaMensaje;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
