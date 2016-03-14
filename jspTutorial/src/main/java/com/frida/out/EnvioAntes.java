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
		System.out.println("Envio de información"+mensage);
		singletonQueue objeto=new singletonQueue();
		String cadenaxml="<prueba>"+mensage+"</prueba>";
		objeto.mandarMensaje(cadenaxml,"SDIUUSIDUISDU");
		System.out.println("Se envio la  información"+mensage);
	}
	

	@PreDestroy
	public void cleanUp()throws Exception{
		System.out.println("Ahí se ven");
	}
	
}
