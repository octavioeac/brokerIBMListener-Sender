package com.frida.analizaxml;

import com.frida.singleton.sender.singletonQueue;

public class pruebaXML {

	public static void main(String[] args) {
	pruebaXML caden=new pruebaXML();
	/*	xmlAnalytic k=new xmlAnalytic(caden.getConsultaPuertos());
		k.detonaProceso();
		*/
		singletonQueue objeto=new singletonQueue();
		
		
		
		
	String envio=caden.Puerto();
	//	String envio=caden.getConsultaPuertos();
		//String envio=caden.tarjeta();
		//String envio=caden.Equipo();
		//String envio="";
		objeto.mandarMensaje(envio);
		
	}

	public String getConsultaPuertos(){
	
		String cadena="<PsConsultaPuerto>"
				+ "<ID_Peticion>HOLA ID_Peticion 1</ID_Peticion>"
				+ "<IDEquipoARM>HOLA IDEquipoARM 2</IDEquipoARM>"
				+ "<IDPuertoARM>HOLA IDPuertoARM 3 </IDPuertoARM>"
				+ "<NombrePuertoARM>HOLA NombrePuertoARM 4</NombrePuertoARM>"
				+ "<IDPuertoFrida>HOLA IDPuertoFrida 5</IDPuertoFrida>"
				+ "<PuntoConexionDestino>HOLA PuntoConexionDestino 6</PuntoConexionDestino>"
				+ "<EstadoAprovisionamiento>HOLA EstadoAprovisionamiento 7</EstadoAprovisionamiento>"
				+ "<TipoConector>HOLA TipoConector 8</TipoConector>"
				+ "<Longitud>HOLA Longitud 9</Longitud>"
				+ "<TipoJumper>HOLA TipoJumper 10</TipoJumper>"
				+ "<UbicacionDelPuerto>HOLA UbicacionDelPuerto 11</UbicacionDelPuerto>"
				+ "<Repisa>HOLA Repisa 12</Repisa>"
				+ "<Contacto>HOLA Contacto 13</Contacto>"
				+ "<TipoBDFO>HOLA TipoBDFO 14</TipoBDFO>"
				+ "<TipoDFO>HOLA TipoDFO 15</TipoDFO>"
				+ "<TipoServicio>HOLA TipoServicio 16</TipoServicio>"
				+ "<EstatusOcupacion>HOLA EstatusOcupacion 17</EstatusOcupacion>"
				+ "<INFRA>HOLA INFRA 18</INFRA>"
				+ "</PsConsultaPuerto>";
		return cadena;
	}
	
	
	public String Equipo(){
		String cadena="<PsEquipo>"
				+ "<NombreEquipo></NombreEquipo>"
				+ "<IdentificadorARM></IdentificadorARM>"
				+ "<ID_Nodo></ID_Nodo>"
				+ "</PsEquipo>";
		return cadena;
	}
	
	
	public String Puerto(){
		String cadena="<PsPuerto>"
				+ "<NombrePuerto>Puerto 1</NombrePuerto>"
				+ "<IDPuerto>ESTE ES ID  PUERTO</IDPuerto>"
				+ "<IDPuertoFRIDA>ID PUERTO FRIDA PRUEBA</IDPuertoFRIDA>"
				+ "</PsPuerto>";
		return cadena;
		
	}
	
	
	public String tarjeta(){
String cadena="<PsTarjeta>"
		+ "<IDTarjetaFrida></IDTarjetaFrida>"
		+ "<IDTarjetaARM></IDTarjetaARM>"
		+ "<NombreTarjeta></NombreTarjeta>"
		+ "</PsTarjeta>";
return cadena;

	}
	
	
}
