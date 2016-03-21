package com.frida.negocio;

public class objectFactory {

	
	private negocioFridaCarrier inter;
	
	
	

	public objectFactory(negocioFridaCarrier inter) {
		super();
		this.inter = inter;
	}

	public negocioFridaCarrier getInter() {
		return inter;
	}

	public void setInter(negocioFridaCarrier inter) {
		this.inter = inter;
	}
	
	
}
