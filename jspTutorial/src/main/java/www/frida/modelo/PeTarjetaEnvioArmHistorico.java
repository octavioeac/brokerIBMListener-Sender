package www.frida.modelo;

import java.util.Date;

public class PeTarjetaEnvioArmHistorico {
	
	private int id;
	private String movimiento; 
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
	private String codigoClei;  
	private String folioOrdenTrabajoExterna;  
	private String idElementoPep;  
	private String proyectoIdDocumento;  
	private Date fechaInstalacion;  
	private Date fechaGestion;  
	private String proveedor;   
	private Date fechaBaja;  
	private String  mensajexml;
	private String  messageID;
	private Date fechaEnvioArm;
	
	public PeTarjetaEnvioArmHistorico(){
		
	}
	
	
	
	
	public PeTarjetaEnvioArmHistorico(int id, String movimiento, String idNodo, String idTarjetaFrida, String repisa,
			String slot, String subSlot, String modeloTarjeta, String estadoAprovisionamiento, Date fechaPlaneacion,
			String numeroSerie, String idTarjetaPadre, String codigoClei, String folioOrdenTrabajoExterna,
			String idElementoPep, String proyectoIdDocumento, Date fechaInstalacion, Date fechaGestion,
			String proveedor, Date fechaBaja, String mensajexml, String messageID, Date fechaEnvioArm) {
		super();
		this.id = id;
		this.movimiento = movimiento;
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
		this.codigoClei = codigoClei;
		this.folioOrdenTrabajoExterna = folioOrdenTrabajoExterna;
		this.idElementoPep = idElementoPep;
		this.proyectoIdDocumento = proyectoIdDocumento;
		this.fechaInstalacion = fechaInstalacion;
		this.fechaGestion = fechaGestion;
		this.proveedor = proveedor;
		this.fechaBaja = fechaBaja;
		this.mensajexml = mensajexml;
		this.messageID = messageID;
		this.fechaEnvioArm = fechaEnvioArm;
	}
	public Date getFechaEnvioArm() {
		return fechaEnvioArm;
	}
	public void setFechaEnvioArm(Date fechaEnvioArm) {
		this.fechaEnvioArm = fechaEnvioArm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
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
	public String getCodigoClei() {
		return codigoClei;
	}
	public void setCodigoClei(String codigoClei) {
		this.codigoClei = codigoClei;
	}
	public String getFolioOrdenTrabajoExterna() {
		return folioOrdenTrabajoExterna;
	}
	public void setFolioOrdenTrabajoExterna(String folioOrdenTrabajoExterna) {
		this.folioOrdenTrabajoExterna = folioOrdenTrabajoExterna;
	}
	public String getIdElementoPep() {
		return idElementoPep;
	}
	public void setIdElementoPep(String idElementoPep) {
		this.idElementoPep = idElementoPep;
	}
	public String getProyectoIdDocumento() {
		return proyectoIdDocumento;
	}
	public void setProyectoIdDocumento(String proyectoIdDocumento) {
		this.proyectoIdDocumento = proyectoIdDocumento;
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
	public String getMensajexml() {
		return mensajexml;
	}
	public void setMensajexml(String mensajexml) {
		this.mensajexml = mensajexml;
	}
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	} 
	

}
