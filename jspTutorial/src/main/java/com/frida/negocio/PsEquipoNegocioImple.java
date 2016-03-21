package com.frida.negocio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.frida.pojoXML.PsEquipo;

import www.frida.modelo.Dao.armReponsePsEquipoDAO;
import www.frida.modelo.Dao.getTarjetasFridaDao;

public class PsEquipoNegocioImple implements negocioFridaCarrier {

private Document doc;
private String xml;
private PsEquipo equipo;	
	
	
	public void setEquipo(PsEquipo equipo) {
	this.equipo = equipo;
}
	
	public PsEquipo getEquipo() {
		return equipo;
	}
	


	public PsEquipoNegocioImple(Document doc,String xml) {
		super();
		this.doc = doc;
		this.xml=xml;
		getNegocioXML();
	}
	
	
	public void getNegocioXML() {
	this.getEquipoArm();
		PsEquipo ca=this.getEquipo();
		System.out.println(ca);
		String cadena="NombreEquipo :"+ca.getNombreEquipo()+"\n"
				+ " IdentificadorARM:  "+ca.getIdentificadorARM()+"\n"
				+ "ID_Nodo: "+ca.getID_Nodo()+"\n"
				+ "messageID: "+ca.getMessageId()+"\n";
		armReponsePsEquipoDAO j=new armReponsePsEquipoDAO();
		j.insertaMensaje(getEquipo(), xml);
		
		getTarjetasFridaDao k=new getTarjetasFridaDao();
		
        k.getTarjeta(ca.getMessageId());
		
		System.out.println(cadena);
		
		
		
		

	}

	private void getEquipoArm(){
		PsEquipo objeto=new PsEquipo();
		
		
		NodeList nod0=doc.getElementsByTagName("NombreEquipo");
		Element ele0=(Element) nod0.item(0);
		String nombreEquipo=ele0.getTextContent();
		objeto.setNombreEquipo(nombreEquipo);
		
		NodeList nod1=doc.getElementsByTagName("IdentificadorARM");
		Element ele1=(Element) nod1.item(0);
		String IdentificadorARM=ele1.getTextContent();
		objeto.setIdentificadorARM(IdentificadorARM);
		
		
		NodeList nod2=doc.getElementsByTagName("ID_Nodo");
		Element ele2=(Element) nod2.item(0);
		String ID_Nodo=ele2.getTextContent();
		objeto.setID_Nodo(ID_Nodo);

		NodeList nod3=doc.getElementsByTagName("messageID");
		Element ele3=(Element) nod3.item(0);
		String messageID=ele3.getTextContent();
		objeto.setMessageId(messageID);

		this.setEquipo(objeto);
	}



	
}
