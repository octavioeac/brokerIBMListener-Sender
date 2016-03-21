package com.frida.prueba;

import java.util.Date;

import com.frida.singleton.sender.singletonQueue;

public class pruebaMensaje {

	public static void main(String[] args) {
		
		String mensage="HOLA MDB";
		System.out.println("Envio de información"+mensage);
		singletonQueue objeto=new singletonQueue();
		String cadenaxml="<prueba>"+mensage+"</prueba>";
		objeto.mandarMensaje(cadenaxml,"");

	}

}
