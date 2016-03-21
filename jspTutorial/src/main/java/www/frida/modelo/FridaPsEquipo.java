package www.frida.modelo;

import java.util.Date;

public class FridaPsEquipo {
	private int id;
	private String Movimiento;	
	private String idNodo;	
	private String idTarjetaFrida;	
	private String repisa;	
	private String slot;	
	private String subSlot;	
	private String modeloTarjeta;	
	private String estadoAprovisionamiento;	
	private Date fechaPlaneacion;	
	private String numeroSerie;	
	private String idTarjetaPadre;	
	private String codigoCLEI;	
	private String folioOrdenTrabajoExterna;	
	private String idElementoPEP;	
	private String proyectoIDDocumento;	
	private Date fechaInstalacion;	
	private Date fechaGestion;	
	private String proveedor; 	
	private Date fechaBaja;
	private String xmlMessage;
	private Date fechaMensajeArm;
	private String  messageID;
	
	public FridaPsEquipo(){}
	
	public FridaPsEquipo(int id, String movimiento, String idNodo, String idTarjetaFrida, String repisa, String slot,
			String subSlot, String modeloTarjeta, String estadoAprovisionamiento, Date fechaPlaneacion,
			String numeroSerie, String idTarjetaPadre, String codigoCLEI, String folioOrdenTrabajoExterna,
			String idElementoPEP, String proyectoIDDocumento, Date fechaInstalacion, Date fechaGestion,
			String proveedor, Date fechaBaja, String xmlMessage, Date fechaMensajeArm, String messageID) {
		super();
		this.id = id;
		Movimiento = movimiento;
		this.idNodo = idNodo;
		this.idTarjetaFrida = idTarjetaFrida;
		this.repisa = repisa;
		this.slot = slot;
		this.subSlot = subSlot;
		this.modeloTarjeta = modeloTarjeta;
		this.estadoAprovisionamiento = estadoAprovisionamiento;
		this.fechaPlaneacion = fechaPlaneacion;
		this.numeroSerie = numeroSerie;
		this.idTarjetaPadre = idTarjetaPadre;
		this.codigoCLEI = codigoCLEI;
		this.folioOrdenTrabajoExterna = folioOrdenTrabajoExterna;
		this.idElementoPEP = idElementoPEP;
		this.proyectoIDDocumento = proyectoIDDocumento;
		this.fechaInstalacion = fechaInstalacion;
		this.fechaGestion = fechaGestion;
		this.proveedor = proveedor;
		this.fechaBaja = fechaBaja;
		this.xmlMessage = xmlMessage;
		this.fechaMensajeArm = fechaMensajeArm;
		this.messageID = messageID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovimiento() {
		return Movimiento;
	}

	public void setMovimiento(String movimiento) {
		Movimiento = movimiento;
	}

	public String getIdNodo() {
		return idNodo;
	}

	public void setIdNodo(String idNodo) {
		this.idNodo = idNodo;
	}

	public String getIdTarjetaFrida() {
		return idTarjetaFrida;
	}

	public void setIdTarjetaFrida(String idTarjetaFrida) {
		this.idTarjetaFrida = idTarjetaFrida;
	}

	public String getRepisa() {
		return repisa;
	}

	public void setRepisa(String repisa) {
		this.repisa = repisa;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getSubSlot() {
		return subSlot;
	}

	public void setSubSlot(String subSlot) {
		this.subSlot = subSlot;
	}

	public String getModeloTarjeta() {
		return modeloTarjeta;
	}

	public void setModeloTarjeta(String modeloTarjeta) {
		this.modeloTarjeta = modeloTarjeta;
	}

	public String getEstadoAprovisionamiento() {
		return estadoAprovisionamiento;
	}

	public void setEstadoAprovisionamiento(String estadoAprovisionamiento) {
		this.estadoAprovisionamiento = estadoAprovisionamiento;
	}

	public Date getFechaPlaneacion() {
		return fechaPlaneacion;
	}

	public void setFechaPlaneacion(Date fechaPlaneacion) {
		this.fechaPlaneacion = fechaPlaneacion;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getIdTarjetaPadre() {
		return idTarjetaPadre;
	}

	public void setIdTarjetaPadre(String idTarjetaPadre) {
		this.idTarjetaPadre = idTarjetaPadre;
	}

	public String getCodigoCLEI() {
		return codigoCLEI;
	}

	public void setCodigoCLEI(String codigoCLEI) {
		this.codigoCLEI = codigoCLEI;
	}

	public String getFolioOrdenTrabajoExterna() {
		return folioOrdenTrabajoExterna;
	}

	public void setFolioOrdenTrabajoExterna(String folioOrdenTrabajoExterna) {
		this.folioOrdenTrabajoExterna = folioOrdenTrabajoExterna;
	}

	public String getIdElementoPEP() {
		return idElementoPEP;
	}

	public void setIdElementoPEP(String idElementoPEP) {
		this.idElementoPEP = idElementoPEP;
	}

	public String getProyectoIDDocumento() {
		return proyectoIDDocumento;
	}

	public void setProyectoIDDocumento(String proyectoIDDocumento) {
		this.proyectoIDDocumento = proyectoIDDocumento;
	}

	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}

	public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}

	public Date getFechaGestion() {
		return fechaGestion;
	}

	public void setFechaGestion(Date fechaGestion) {
		this.fechaGestion = fechaGestion;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getXmlMessage() {
		return xmlMessage;
	}

	public void setXmlMessage(String xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

	public Date getFechaMensajeArm() {
		return fechaMensajeArm;
	}

	public void setFechaMensajeArm(Date fechaMensajeArm) {
		this.fechaMensajeArm = fechaMensajeArm;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	
	
	
	
	
	
	
	

}
