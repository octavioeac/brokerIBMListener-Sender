package com.frida.xmlArmados;

import com.frida.xmlPojo.PeTarjeta;

public class PeTarjetaxmlCadena {
	
	public String getxmlTarjeta(PeTarjeta equipo){
		
		String  cadena="<PeTarjeta>"
				+ "<Movimiento>"+equipo.getMovimiento()+"</Movimiento>"
			    + "<IDNodo>"+equipo.getiDNodo()+"</IDNodo>"
			    + "<IDTarjetaFrida>"+equipo.getiDTarjetaFrida()+"</IDTarjetaFrida>"
			    + "<Repisa>"+equipo.getRepisa()+"</Repisa>"
			    + "<Slot>"+equipo.getSlot()+"</Slot>"
			    + "<SubSlot>"+equipo.getSubSlot()+"</SubSlot>"
			    + "<ModeloTarjeta>"+equipo.getModeloTarjeta()+"</ModeloTarjeta>"
			    + "<EstadoAprovisionamiento>"+equipo.getEstadoAprovisionamiento()+"</EstadoAprovisionamiento>"
			    +"<FechaPlaneacion>"+equipo.getFechaPlaneacion()+"</FechaPlaneacion>"
			    +"<NumeroSerie>"+equipo.getNumeroSerie()+"</NumeroSerie>"
			    + "<IDTarjetaPadre>"+equipo.getiDTarjetaPadre()+"</IDTarjetaPadre>"
			    + "<CodigoCLEI>"+equipo.getCodigoCLEI()+"</CodigoCLEI>"
			    + "<FolioOrdenTrabajoExterna>"+equipo.getFolioOrdenTrabajoExterna()+"</FolioOrdenTrabajoExterna>"
			    + "<IDElementoPEP>"+equipo.getiDElementoPEP()+"</IDElementoPEP>"
			    + "<ProyectoIDDocumento>"+equipo.getProyectoIDDocumento()+"</ProyectoIDDocumento>"
			    + "<FechaInstalacion>"+equipo.getFechaInstalacion()+"</FechaInstalacion>"
			    + "<FechaGestion>"+equipo.getFechaGestion()+"</FechaGestion>"
			    + "<Proveedor >"+equipo.getProveedor()+"</Proveedor >"
			    + "<FechaBaja>"+equipo.getFechaBaja()+"</FechaBaja>"
			    + "<messageID>"+equipo.getMessageID()+"</messageID>"
			    + "</PeTarjeta>";
		
		return cadena;
	}
	

}
