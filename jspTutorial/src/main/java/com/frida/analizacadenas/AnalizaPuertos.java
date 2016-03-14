package com.frida.analizacadenas;

public class AnalizaPuertos {

	private String idNodo;
	private String repisat;
	private String posicionTarjeta;
	private String subslot;
	private String puerto;  	

	
	
	
	public String getPuerto() {
		return puerto;
	}



	public void setPuerto(String puerto) {
		this.puerto = puerto;
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



	public AnalizaPuertos(String tarjeta){
		this.ParteTarjeta(tarjeta);
		
	}
	
	
	
	public void ParteTarjeta(String cadena){
		
		System.out.println("HOLA MUNDO CADENA"); 
		String [] campos = cadena.split("/");
		this.setIdNodo(campos[0]);
		this.setRepisat(campos[1]);
		this.setPosicionTarjeta(campos[2]);
	System.out.println(campos.length);
	if(campos[3].equals("ND")){
		
		this.setSubslot("");
		}		
	
	else{
			
		this.setSubslot(campos[3]);
			
	}
	this.setPuerto(campos[4]);	
	
		System.out.println("idNOdo: "+this.getIdNodo()+", repisat :"+this.getRepisat()+","
				+ "posicion Tarjeta:"+this.getPosicionTarjeta()+", subslot:"+this.getSubslot() 
				+", puerto:"+this.getPuerto());
		
	}
	

	
	
}
