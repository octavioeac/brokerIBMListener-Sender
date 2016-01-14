package com.frida.analizaxml;

import com.frida.singleton.sender.singletonQueue;

public class pruebaXML {

	public static void main(String[] args) {
		pruebaXML caden=new pruebaXML();
		xmlAnalytic k=new xmlAnalytic(caden.Puerto());
		k.detonaProceso();
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
				+ "<ID_Peticion>HOLA</ID_Peticion>"
				+ "<IDEquipoARM></IDEquipoARM>"
				+ "<IDPuertoARM></IDPuertoARM>"
				+ "<NombrePuertoARM></NombrePuertoARM>"
				+ "<IDPuertoFrida></IDPuertoFrida>"
				+ "<PuntoConexionDestino></PuntoConexionDestino>"
				+ "<EstadoAprovisionamiento></EstadoAprovisionamiento>"
				+ "<TipoConector></TipoConector>"
				+ "<Longitud></Longitud>"
				+ "<TipoJumper></TipoJumper>"
				+ "<UbicacionDelPuerto></UbicacionDelPuerto>"
				+ "<Repisa></Repisa>"
				+ "<Contacto></Contacto>"
				+ "<TipoBDFO></TipoBDFO>"
				+ "<TipoDFO></TipoDFO>"
				+ "<TipoServicio></TipoServicio>"
				+ "<EstatusOcupacion></EstatusOcupacion>"
				+ "<INFRA></INFRA>"
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
				+ "<NombrePuerto></NombrePuerto>"
				+ "<IDPuerto></IDPuerto>"
				+ "<IDPuertoFRIDA></IDPuertoFRIDA>"
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
