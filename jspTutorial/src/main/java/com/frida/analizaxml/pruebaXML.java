package com.frida.analizaxml;

import javax.jms.Message;

import org.apache.axis.transport.jms.Handler;

import com.frida.analizacadenas.AnalizaPuertos;
import com.frida.analizacadenas.analizacadenasRespuestas;
import com.frida.singleton.sender.singletonQueue;

public class pruebaXML {

	public static void main(String[] args) {
		pruebaXML caden=new pruebaXML();
		String envio=caden.getConsultaPuertos();		
		
		xmlAnalytic k=new xmlAnalytic(caden.tarjeta());
k.detonaProceso();
		 
		//AnalizaPuertos l=new AnalizaPuertos("GSVEXSGU009-DIST2-7450/01/01/01/01");
		
		
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
				+ "<NombreEquipo>ARM-NOMBRE</NombreEquipo>"
				+ "<IdentificadorARM>GSVEXSGU009-DIST2-7450-ARM-GENERACION</IdentificadorARM>"
				+ "<ID_Nodo>GSVEXSGU009-DIST2-7450</ID_Nodo>"
				+ "<messageID>00001</messageID>"
				+ "</PsEquipo>";
		return cadena;
	}
	
	
	public String Puerto(){
		String cadena="<PsPuerto>"
				+ "<NombrePuerto>HOLA PUERTO PARAMETRO 1</NombrePuerto>"
				+ "<IDPuerto>ESTE ES ID  PUERTO</IDPuerto>"
				+ "<IDPuertoFRIDA>ID PUERTO FRIDA PRUEBA</IDPuertoFRIDA>"
				+ "</PsPuerto>";
		return cadena;
		
	}
	
	
	public String tarjeta(){
String cadena="<PsTarjeta>"
		+ "<IDTarjetaFrida>GSVEXSGU009-DIST2-7450/01/01/01</IDTarjetaFrida>"
		+ "<IDTarjetaARM>2</IDTarjetaARM>"
		+ "<NombreTarjeta>3</NombreTarjeta>"
		+ "<messageID>TP0UHOIM43CPQ602H8QM2016211133749</messageID>"
		+ "</PsTarjeta>";
return cadena;

	}
	
	public String hola(){
		String cadena="<prueba>HOLA MUNDO</prueba>";
		return cadena;

			}
	
	
}
