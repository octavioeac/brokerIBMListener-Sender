package com.frida.negocio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.frida.pojoXML.PsConsultaPuerto;

public class PsConsultaPuertoNegocioImple implements negocioFridaCarrier {
 
	private Document doc;
	
	
	
	public PsConsultaPuertoNegocioImple(Document doc) {
		super();
		this.doc = doc;
		getNegocioXML();
	}



	public void getNegocioXML() {
		PsConsultaPuerto objeto=getConsultaPuertoXML();
	
	String cadena="{\n"
			+ "ID_Peticion :"+objeto.getID_Peticion()+", \n"
			+ "IDEquipoARM :"+objeto.getIDEquipoARM()+", \n"
		    + "IDPuertoARM :"+objeto.getIDPuertoARM()+", \n"
		    + "NombrePuertoARM :"+objeto.getNombrePuertoARM()+", \n"
		    + "IDPuertoFrida :"+objeto.getIDPuertoFrida()+", \n"
		    + "PuntoConexionDestino :"+objeto.getPuntoConexionDestino()+", \n"	
		    + "EstadoAprovisionamiento :"+objeto.getEstadoAprovisionamiento()+", \n"
		    + "TipoConector :"+objeto.getTipoConector()+", \n"
        	+ "Longitud :"+objeto.getLongitud()+", \n"
  			+ "TipoJumper :"+objeto.getTipoJumper()+", \n"
    		+ "UbicacionDelPuerto :"+objeto.getUbicacionDelPuerto()+", \n"
    		+ "Repisa :"+objeto.getRepisa()+", \n"
        	+ "Contacto :"+objeto.getContacto()+", \n"
            + "TipoBDFO :"+objeto.getTipoBDFO()+", \n"
            + "TipoDFO :"+objeto.getTipoDFO()+", \n"
            + "TipoServicio :"+objeto.getTipoServicio()+", \n"
            + "EstatusOcupacion :"+objeto.getEstatusOcupacion()+", \n"
            + "INFRA :"+objeto.getINFRA()+", \n"
            		+ "}";
           
        													
	

					
		    
		    
		
		System.out.println(cadena);
	}

	
private PsConsultaPuerto getConsultaPuertoXML(){
	PsConsultaPuerto objeto=new PsConsultaPuerto();
	
	NodeList nod0=doc.getElementsByTagName("ID_Peticion");
	Element ele0=(Element) nod0.item(0);
	String nomID_Peticion=ele0.getTextContent();
	objeto.setID_Peticion(nomID_Peticion);
	
	NodeList nod1=doc.getElementsByTagName("IDEquipoARM");
	Element ele1=(Element) nod1.item(0);
	String nomIDEquipoARM=ele1.getTextContent();
	objeto.setIDEquipoARM(nomIDEquipoARM);
	
	NodeList nod2=doc.getElementsByTagName("IDPuertoARM");
	Element ele2=(Element) nod2.item(0);
	String nomIDPuertoARM=ele2.getTextContent();
	objeto.setIDPuertoARM(nomIDPuertoARM);
	
	NodeList nod3=doc.getElementsByTagName("NombrePuertoARM");
	Element ele3=(Element) nod3.item(0);
	String nomNombrePuertoARM=ele3.getTextContent();
	objeto.setNombrePuertoARM(nomNombrePuertoARM);
	
	NodeList nod4=doc.getElementsByTagName("IDPuertoFrida");
	Element ele4=(Element) nod4.item(0);
	String nomIDPuertoFrida=ele4.getTextContent();
	objeto.setIDPuertoFrida(nomIDPuertoFrida);
	
	NodeList nod5=doc.getElementsByTagName("PuntoConexionDestino");
	Element ele5=(Element) nod5.item(0);
	String nomPuntoConexionDestino=ele5.getTextContent();
	objeto.setPuntoConexionDestino(nomPuntoConexionDestino);
	
	NodeList nod6=doc.getElementsByTagName("EstadoAprovisionamiento");
	Element ele6=(Element) nod6.item(0);
	String nomEstadoAprovisionamiento=ele6.getTextContent();
	objeto.setEstadoAprovisionamiento(nomEstadoAprovisionamiento);
	
	
	NodeList nod7=doc.getElementsByTagName("TipoConector");
	Element ele7=(Element) nod7.item(0);
	String nomTipoConector=ele7.getTextContent();
    objeto.setTipoConector(nomTipoConector);
	
    NodeList nod8=doc.getElementsByTagName("Longitud");
	Element ele8=(Element) nod8.item(0);
	String nomLongitud=ele8.getTextContent();
	objeto.setLongitud(nomLongitud);
	
	NodeList nod9=doc.getElementsByTagName("TipoJumper");
	Element ele9=(Element) nod9.item(0);
	String nomTipoJumper=ele9.getTextContent();
	objeto.setTipoJumper(nomTipoJumper);
	
	NodeList nod10=doc.getElementsByTagName("UbicacionDelPuerto");
	Element ele10=(Element) nod10.item(0);
	String nomUbicacionDelPuerto=ele10.getTextContent();
	objeto.setUbicacionDelPuerto(nomUbicacionDelPuerto);
	
	NodeList nod11=doc.getElementsByTagName("Repisa");
	Element ele11=(Element) nod11.item(0);
	String nomRepisa=ele11.getTextContent();
	objeto.setRepisa(nomRepisa);
	
	NodeList nod12=doc.getElementsByTagName("Contacto");
	Element ele12=(Element) nod12.item(0);
	String nomContacto=ele12.getTextContent();
	objeto.setContacto(nomContacto);
	
	NodeList nod13=doc.getElementsByTagName("TipoBDFO");
	Element ele13=(Element) nod13.item(0);
	String nomTipoBDFO=ele13.getTextContent();
	objeto.setTipoBDFO(nomTipoBDFO);
	
	NodeList nod14=doc.getElementsByTagName("TipoDFO");
	Element ele14=(Element) nod14.item(0);
	String nomTipoDFO=ele14.getTextContent();
	objeto.setTipoDFO(nomTipoDFO);
	
	NodeList nod15=doc.getElementsByTagName("TipoServicio");
	Element ele15=(Element) nod15.item(0);
	String nomTipoServicio=ele15.getTextContent();
	objeto.setTipoServicio(nomTipoServicio);
	
	NodeList nod16=doc.getElementsByTagName("EstatusOcupacion");
	Element ele16=(Element) nod16.item(0);
	String nomEstatusOcupacion=ele16.getTextContent();
	objeto.setEstatusOcupacion(nomEstatusOcupacion);
	
	NodeList nod17=doc.getElementsByTagName("INFRA");
	Element ele17=(Element) nod17.item(0);
	String nomINFRA=ele17.getTextContent();
	objeto.setINFRA(nomINFRA);
	
	return objeto;
	
}	
	
	
}
