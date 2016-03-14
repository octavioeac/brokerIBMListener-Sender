package com.frida.out;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.frida.singleton.sender.singletonQueue;

public class EnvioAntes {
	
	String mensage;

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}
	
	
	@PostConstruct
	public void initIt()throws Exception{
		System.out.println("Envio de informaci�n"+mensage);
		singletonQueue objeto=new singletonQueue();
		String cadenaxml="<prueba>"+mensage+"</prueba>";
		objeto.mandarMensaje(cadenaxml,"SDIUUSIDUISDU");
		System.out.println("Se envio la  informaci�n"+mensage);
	}
	

	@PreDestroy
	public void cleanUp()throws Exception{
		System.out.println("Ah� se ven");
	}
	
}
