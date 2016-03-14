package com.frida.negocio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.frida.pojoXML.PsEquipo;
import com.frida.pojoXML.PsTarjeta;

import www.frida.modelo.Dao.ArmResponsePsTarjetaDAO;
import www.frida.modelo.Dao.getPuertosFridaDao;

public class PsTarjetaNegocioImple implements negocioFridaCarrier {


	private Document doc;
	
	private String xml;
	 
	private PsTarjeta tarjeta;
	
	
	
	public PsTarjeta getTarjeta() {
		return tarjeta;
	}



	public void setTarjeta(PsTarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}



	public PsTarjetaNegocioImple(Document doc,String xml) {
		super();
		this.doc = doc;
		this.xml=xml;
		getNegocioXML();
	}
	
	
	
	public void getNegocioXML() {
		this.getTarjetaARM();
		ArmResponsePsTarjetaDAO ope=new ArmResponsePsTarjetaDAO();
		PsTarjeta ca=this.getTarjeta();
		System.out.println(ca);
		String cadena="IDTarjetaFrida :"+ca.getIDTarjetaFrida()+"\n"
				+ " IDTarjetaARM:  "+ca.getIDTarjetaARM()+"\n"
				+ "NombreTarjeta: "+ca.getNombreTarjeta()+"\n"
				+ "messageID: "+ca.getMeesageID()+"\n";
		
		
		
		ope.insertTarjetaHistorico(ca, xml);
		getPuertosFridaDao h=new getPuertosFridaDao();
		h.getTarjeta(ca.getMeesageID());
		
		System.out.println(cadena);

	}

	
	private void getTarjetaARM(){
		PsTarjeta objeto=new PsTarjeta();
		
		
		NodeList nod0=doc.getElementsByTagName("IDTarjetaFrida");
		Element ele0=(Element) nod0.item(0);
		String IDTarjetaFrida=ele0.getTextContent();
		objeto.setIDTarjetaFrida(IDTarjetaFrida);
		
		NodeList nod1=doc.getElementsByTagName("IDTarjetaARM");
		Element ele1=(Element) nod1.item(0);
		String IDTarjetaARM=ele1.getTextContent();
		objeto.setIDTarjetaARM(IDTarjetaARM);
		
		
		NodeList nod2=doc.getElementsByTagName("NombreTarjeta");
		Element ele2=(Element) nod2.item(0);
		String NombreTarjeta=ele2.getTextContent();
		objeto.setNombreTarjeta(NombreTarjeta);

		NodeList nod3=doc.getElementsByTagName("messageID");
		Element ele3=(Element) nod3.item(0);
		String messageID=ele3.getTextContent();
		objeto.setMeesageID(messageID);

		this.setTarjeta(objeto);
	}

	
	
}
