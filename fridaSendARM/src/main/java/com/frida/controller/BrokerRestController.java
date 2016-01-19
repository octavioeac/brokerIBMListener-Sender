package com.frida.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frida.controller.pojo.Equipo;
import com.frida.controller.pojo.MensajeEquipo;
import com.frida.singleton.sender.singletonQueue;

import www.frida.modelo.Snippet;
import www.frida.modelo.Dao.catAnilloBusqueda;



@RestController
public class BrokerRestController {
	
	

	
	@RequestMapping(value = "/nodes/{supplier}/{wdm}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getNodos(@PathVariable("supplier") String supplier,@PathVariable("wdm") String wdm){
		
		
		return "HOLA MUNDO";
		
	}

	@RequestMapping(value="/json/{lastName}",method = RequestMethod.GET)
	  public String get(@PathParam("lastName") String lastName) {
	    return lastName+"HOLA MUNDO";
	  }
	
	
	
	
	@RequestMapping(value="/equipo", method=RequestMethod.POST,
			                         consumes=MediaType.APPLICATION_JSON_VALUE,
			                        		 produces=MediaType.APPLICATION_JSON_VALUE)
	public MensajeEquipo sendEquipo(@RequestBody Equipo gral)throws Exception{
		MensajeEquipo k=new MensajeEquipo()	;
		
		catAnilloBusqueda cadena=new catAnilloBusqueda();
		singletonQueue j=new singletonQueue();
		j.mandarMensaje(cadena.getPeEquipo(gral.getIdEquipo()));
		
		k.setMensaje("OK");
		
		return k;
		
		
		
	}
	
		
	}

