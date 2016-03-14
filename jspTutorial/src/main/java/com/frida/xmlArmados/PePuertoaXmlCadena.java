package com.frida.xmlArmados;

import com.frida.xmlPojo.PePuerto;
import com.frida.xmlPojo.PeTarjeta;

public class PePuertoaXmlCadena {

	public String getxmlPuerto(PePuerto puerto){
		String cadena="<PePuerto>"
				+ "<Movimiento>"+puerto.getMovimiento()+"</Movimiento>"
				+ "<IDNodo>"+puerto.getIdnodo()+"</IDNodo>"
				+ "<IDTarjetaFrida>"+puerto.getIdTarjetaFrida()+"</IDTarjetaFrida>"
				+ "<Puerto>"+puerto.getPuerto()+"</Puerto>"
				+ "<IDpuertoFrida>"+puerto.getIdPuertoFrida()+"</IDpuertoFrida>"
				+ "<TipoPuerto>"+puerto.getTipoPuerto()+"</TipoPuerto>"
				+ "<PuntoConexionDestino>"+puerto.getPuntoConexionDestino()+"</PuntoConexionDestino>"
				+ "<Velocidad>"+puerto.getVelocidad()+"</Velocidad>"
				+ "<EstadoAprovisionamiento>"+puerto.getEstadoAprovisonamiento()+"</EstadoAprovisionamiento>"
				+ "<NombreOficialPisa>"+puerto.getNombreOficialPisa()+"</NombreOficialPisa>"
				+ "<Descripcion>"+puerto.getDescripciones()+"</Descripcion>"
				+ "<Nombre>"+puerto.getNombre()+"</Nombre>"
				+ "<INFRA>"+puerto.getInfra()+"</INFRA>"
				+ "<TipoServicio>"+puerto.getTipoServicio()+"</TipoServicio>"
				+ "<EstatusOcupacion>"+puerto.getEstatusOcupacion()+"</EstatusOcupacion>"
				+ "<TipoConector>"+puerto.getTipoConector()+"</TipoConector>"
				+ "<Longitud>"+puerto.getLongitud()+"</Longitud>"
				+ "<TipoJumper>"+puerto.getTipoJumper()+"</TipoJumper>"
				+ "<UbicacionPuerto>"+puerto.getUbicacionPuerto()+"</UbicacionPuerto>"
				+ "	<Repisa>"+puerto.getRepisa()+"</Repisa>"
				+ "<Contacto>"+puerto.getContacto()+"</Contacto>"
				+ "<TipoBDFO>"+puerto.getTipoBDFO()+"</TipoBDFO>"
				+ "<TIPODFO>"+puerto.getTipoDFO()+"</TIPODFO>"
				+ "<FechaMovimiento>"+puerto.getFechaMoviento()+"</FechaMovimiento>"
				+ "<MessageID>"+puerto.getMessageID()+"</MessageID>"
				+ "</PePuerto>";
		
		return cadena;
		
			}
	
}
