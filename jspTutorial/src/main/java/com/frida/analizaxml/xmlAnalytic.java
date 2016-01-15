package com.frida.analizaxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.frida.negocio.PsConsultaPuertoNegocioImple;
import com.frida.negocio.PsEquipoNegocioImple;
import com.frida.negocio.PsPuertoNegocioImple;
import com.frida.negocio.PsTarjetaNegocioImple;
import com.frida.negocio.objectFactory;

public class xmlAnalytic {

	private String documentoxml;

	
public xmlAnalytic(String documento){
	this.documentoxml=documento;		
	}

public void detonaProceso(){
	String analiza=extraeNombreXMl();
	 
	if(analiza=="PsPuerto"){
		objectFactory objeto=new objectFactory(new PsPuertoNegocioImple(getDocumentoXml()));
		    
	}
	if(analiza=="PsConsultaPuerto"){
		
		objectFactory objeto=new objectFactory(new PsConsultaPuertoNegocioImple(getDocumentoXml()));
    
	}
	if(analiza=="PsTarjeta"){
		objectFactory objeto=new objectFactory(new PsTarjetaNegocioImple(getDocumentoXml()));
		
	}
	if(analiza=="PsEquipo"){
		
		objectFactory objeto=new objectFactory(new PsEquipoNegocioImple(getDocumentoXml()));
   	
	}
   
	if(analiza=="prueba"){
      	  System.out.println( "HOLA: "+analiza+" 5"  );
	}
          
     	
	 
}

public String extraeNombreXMl(){
	
	
	XmlConvertido xmlana=new XmlConvertido();
	Document doc=xmlana.convierteSCadenaDocumentoXML(documentoxml);
	Element cadena=doc.getDocumentElement();
	String nombreTag=cadena.getTagName();
	return nombreTag;
	
}


public Document getDocumentoXml(){
	XmlConvertido xmlana=new XmlConvertido();
	Document doc=xmlana.convierteSCadenaDocumentoXML(documentoxml);
	return doc;
	
}

}
