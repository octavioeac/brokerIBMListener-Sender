package com.frida.analizaxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class xmlAnalytic {

	private String documentoxml;

	
public xmlAnalytic(String documento){
	this.documentoxml=documento;		
	}

public void detonaProceso(){
	String analiza=extraeNombreXMl();
	
	if(analiza=="PsPuerto"){
	       System.out.println( "HOLA: "+analiza+" 1" );
	}
	if(analiza=="PsConsultaPuerto"){
    	  System.out.println( "HOLA: "+analiza+" 2"  );
	}
	if(analiza=="PsTarjeta"){
   	  System.out.println( "HOLA: "+analiza+" 3"  );
	}
	if(analiza=="PsEquipo"){
   	  System.out.println( "HOLA: "+analiza+" 4"  );
	}
   
	if(analiza=="prueba"){
      	  System.out.println( "HOLA: "+analiza+" 4"  );
	}
          
     	
	 
}

public String extraeNombreXMl(){
	
	
	XmlConvertido xmlana=new XmlConvertido();
	Document doc=xmlana.convierteSCadenaDocumentoXML(documentoxml);
	Element cadena=doc.getDocumentElement();
	String nombreTag=cadena.getTagName();
	return nombreTag;
	
}

}
