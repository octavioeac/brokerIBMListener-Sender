package com.frida.negocio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.frida.pojoXML.PsPuerto;

public class PsPuertoNegocioImple implements negocioFridaCarrier{

     private Document doc;
	
	
	
	public PsPuertoNegocioImple(Document doc) {
		super();
		this.doc = doc;
		getNegocioXML();
	}
	
	
	public void getNegocioXML() {
		PsPuerto puert=getPuertoXML();
		System.out.println("{ NombrePuerto:"+puert.getNombrePuerto()+" ,IDPuerto: "+puert.getIDPuerto()+", IDPuertoFRIDA: "+puert.getIDPuertoFRIDA());
	}
	
	
	private PsPuerto getPuertoXML(){
		PsPuerto objeto=new PsPuerto();
		
		NodeList nod0=doc.getElementsByTagName("NombrePuerto");
		Element elenombre=(Element) nod0.item(0);
		String nombrePuerto=elenombre.getTextContent();
		
		NodeList nod1=doc.getElementsByTagName("IDPuerto");
		Element elementoIDPuerto=(Element) nod1.item(0);
		String nombrelementoIDPuerto=elementoIDPuerto.getTextContent();
		
		NodeList nod2=doc.getElementsByTagName("IDPuertoFRIDA");
		Element elementoIDPuertoFRIDA=(Element) nod2.item(0);
		String nombreIDPuertoFRIDA=elementoIDPuertoFRIDA.getTextContent();
		
		objeto.setNombrePuerto(nombrePuerto);
		objeto.setIDPuerto(nombrelementoIDPuerto);
		objeto.setIDPuertoFRIDA(nombreIDPuertoFRIDA);
		
		
		return objeto;
			
	}
	

}
