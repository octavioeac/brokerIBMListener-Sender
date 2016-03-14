package www.frida.modelo;

public class InventarioTarjetasCe {
	private int id;
	private String idNodo;
	private String repisat;
	private String posicionTarjeta;
	private String subslot;
	private String modeloTarjeta;
	private String estatus;
	
	public InventarioTarjetasCe(){}
	
	
	public InventarioTarjetasCe(int id, String idNodo, String repisat, String posicionTarjeta, String subslot,
			String modeloTarjeta, String estatus) {
		super();
		this.id = id;
		this.idNodo = idNodo;
		this.repisat = repisat;
		this.posicionTarjeta = posicionTarjeta;
		this.subslot = subslot;
		this.modeloTarjeta = modeloTarjeta;
		this.estatus = estatus;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	public String getModeloTarjeta() {
		return modeloTarjeta;
	}
	public void setModeloTarjeta(String modeloTarjeta) {
		this.modeloTarjeta = modeloTarjeta;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	

}
