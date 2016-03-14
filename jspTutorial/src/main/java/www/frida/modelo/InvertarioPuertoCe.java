package www.frida.modelo;

import java.util.Date;

public class InvertarioPuertoCe {

	private String Id;
	private String idNodo; 
	private String repisat; 
	private String posicionTarjeta; 
	private String subslot; 
	private String tipoPuerto;	
	private String capacidadPuerto; 	
	private String gestionada; 	
	private String nombreOficialPisa;	
	private String observaciones; 	
	private String ptoTroncal;	
	private String tabla;	
	private String estatus; 	
	private String tipoConector; 	
	private String longJumper;	
	private String tipoJumper;	
	private String ubicacionBdfo;	
	private String contactoBdfo; 	
	private String tipoBdfoAmdocs; 	
	private String tipoDfoAmdocs;
	private String puerto;
	private Date fechaAlta;
	public InvertarioPuertoCe(String id, String idNodo, String repisat, String posicionTarjeta, String subslot,
			String tipoPuerto, String capacidadPuerto, String gestionada, String nombreOficialPisa,
			String observaciones, String ptoTroncal, String tabla, String estatus, String tipoConector,
			String longJumper, String tipoJumper, String ubicacionBdfo, String contactoBdfo, String tipoBdfoAmdocs,
			String tipoDfoAmdocs, String puerto, Date fechaAlta) {
		super();
		Id = id;
		this.idNodo = idNodo;
		this.repisat = repisat;
		this.posicionTarjeta = posicionTarjeta;
		this.subslot = subslot;
		this.tipoPuerto = tipoPuerto;
		this.capacidadPuerto = capacidadPuerto;
		this.gestionada = gestionada;
		this.nombreOficialPisa = nombreOficialPisa;
		this.observaciones = observaciones;
		this.ptoTroncal = ptoTroncal;
		this.tabla = tabla;
		this.estatus = estatus;
		this.tipoConector = tipoConector;
		this.longJumper = longJumper;
		this.tipoJumper = tipoJumper;
		this.ubicacionBdfo = ubicacionBdfo;
		this.contactoBdfo = contactoBdfo;
		this.tipoBdfoAmdocs = tipoBdfoAmdocs;
		this.tipoDfoAmdocs = tipoDfoAmdocs;
		this.puerto = puerto;
		this.fechaAlta = fechaAlta;
	}
	
   public InvertarioPuertoCe(){
	   
   }

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getIdNodo() {
	return idNodo;
}

public void setIdNodo(String idNodo) {
	this.idNodo = idNodo;
}

public String getRepisat() {
	return repisat;
}

public void setRepisat(String repisat) {
	this.repisat = repisat;
}

public String getPosicionTarjeta() {
	return posicionTarjeta;
}

public void setPosicionTarjeta(String posicionTarjeta) {
	this.posicionTarjeta = posicionTarjeta;
}

public String getSubslot() {
	return subslot;
}

public void setSubslot(String subslot) {
	this.subslot = subslot;
}

public String getTipoPuerto() {
	return tipoPuerto;
}

public void setTipoPuerto(String tipoPuerto) {
	this.tipoPuerto = tipoPuerto;
}

public String getCapacidadPuerto() {
	return capacidadPuerto;
}

public void setCapacidadPuerto(String capacidadPuerto) {
	this.capacidadPuerto = capacidadPuerto;
}

public String getGestionada() {
	return gestionada;
}

public void setGestionada(String gestionada) {
	this.gestionada = gestionada;
}

public String getNombreOficialPisa() {
	return nombreOficialPisa;
}

public void setNombreOficialPisa(String nombreOficialPisa) {
	this.nombreOficialPisa = nombreOficialPisa;
}

public String getObservaciones() {
	return observaciones;
}

public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
}

public String getPtoTroncal() {
	return ptoTroncal;
}

public void setPtoTroncal(String ptoTroncal) {
	this.ptoTroncal = ptoTroncal;
}

public String getTabla() {
	return tabla;
}

public void setTabla(String tabla) {
	this.tabla = tabla;
}

public String getEstatus() {
	return estatus;
}

public void setEstatus(String estatus) {
	this.estatus = estatus;
}

public String getTipoConector() {
	return tipoConector;
}

public void setTipoConector(String tipoConector) {
	this.tipoConector = tipoConector;
}

public String getLongJumper() {
	return longJumper;
}

public void setLongJumper(String longJumper) {
	this.longJumper = longJumper;
}

public String getTipoJumper() {
	return tipoJumper;
}

public void setTipoJumper(String tipoJumper) {
	this.tipoJumper = tipoJumper;
}

public String getUbicacionBdfo() {
	return ubicacionBdfo;
}

public void setUbicacionBdfo(String ubicacionBdfo) {
	this.ubicacionBdfo = ubicacionBdfo;
}

public String getContactoBdfo() {
	return contactoBdfo;
}

public void setContactoBdfo(String contactoBdfo) {
	this.contactoBdfo = contactoBdfo;
}

public String getTipoBdfoAmdocs() {
	return tipoBdfoAmdocs;
}

public void setTipoBdfoAmdocs(String tipoBdfoAmdocs) {
	this.tipoBdfoAmdocs = tipoBdfoAmdocs;
}

public String getTipoDfoAmdocs() {
	return tipoDfoAmdocs;
}

public void setTipoDfoAmdocs(String tipoDfoAmdocs) {
	this.tipoDfoAmdocs = tipoDfoAmdocs;
}

public String getPuerto() {
	return puerto;
}

public void setPuerto(String puerto) {
	this.puerto = puerto;
}

public Date getFechaAlta() {
	return fechaAlta;
}

public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
}
   
   
	
	
	
}
