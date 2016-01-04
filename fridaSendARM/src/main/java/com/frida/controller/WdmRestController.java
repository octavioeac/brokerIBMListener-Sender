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

import com.frida.controller.pojo.GeneralData;
import com.frida.controller.pojo.Objetito;
import com.frida.singleton.sender.singletonQueue;



@RestController
public class WdmRestController {
	
	

	
	@RequestMapping(value = "/nodes/{supplier}/{wdm}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getNodos(@PathVariable("supplier") String supplier,@PathVariable("wdm") String wdm){
		
		return "HOLA MUNDO";
		
	}

	@RequestMapping(value="/json/{lastName}",method = RequestMethod.GET)
	  public String get(@PathParam("lastName") String lastName) {
	    return lastName+"HOLA MUNDO";
	  }
	
	@RequestMapping(value="/prueba", method=RequestMethod.POST,
			                         consumes=MediaType.APPLICATION_JSON_VALUE,
			                        		 produces=MediaType.APPLICATION_JSON_VALUE)
	public Objetito getPrueba(@RequestBody GeneralData gral)throws Exception{
		System.out.println("HOLA JSON");
		System.out.println(gral.getNombre()+gral.getNombre());
		Objetito k=new Objetito();
		String cadena="<PeEquipo>"
				+ "<ID_Nodo>Prueba Frida para1</ID_Nodo>"
				+ "<ID_Nodo_Nuevo>Prueba Frida para2</ID_Nodo_Nuevo>"
				+ "<Movimiento>Prueba Frida para3</Movimiento>"
				+ "<CLLIEdificio>Prueba Frida para4</CLLIEdificio>"
				+ "<UbicacionEquipo>Prueba Frida para5</UbicacionEquipo>"
				+ "<CLLI>Prueba Frida para6</CLLI>"
				+ "<Cluster>Prueba Frida para7</Cluster>"
				+ "<Modelo>Prueba Frida para8</Modelo>"
				+ "<Division>Prueba Frida para9</Division>"
				+ "<CLEI>Prueba Frida para10</CLEI>"
				+ "<TipoNodoTelmex>Prueba Frida para11</TipoNodoTelmex>"
				+ "<OSPF>Prueba Frida para12</OSPF>"
				+ "<Repisa>Prueba Frida para13</Repisa>"
				+ "<IPSistema>Prueba Frida para14</IPSistema>"
				+ "<IPGestion>Prueba Frida para15</IPGestion>"
				+ "<EstadoAprovisionamiento>Prueba Frida para16</EstadoAprovisionamiento>"
				+ "<FechaGestion>Prueba Frida para17</FechaGestion>"
				+ "<FolioOrdenTrabajo>Prueba Frida para18</FolioOrdenTrabajo>"
				+ "<Notas>Prueba Frida para19</Notas>"
				+ "<VersionSistemaOperativo>Prueba Frida para20</VersionSistemaOperativo>"
				+ "<TipoGestion>Prueba Frida para21</TipoGestion>"
				+ "<VLANGestion>Prueba Frida para22</VLANGestion>"
				+ "<ConexionPorTunel>Prueba Frida para23</ConexionPorTunel>"
				+ "<SwitchRCDT>Prueba Frida para24</SwitchRCDT>"
				+ "<PuertoRCDT>Prueba Frida para25</PuertoRCDT>"
				+ "<Velocidad>Prueba Frida para26</Velocidad>"
				+ "<FolioRCDT>Prueba Frida para27</FolioRCDT>"
				+ "<PEP_Element_ID>Prueba Frida para28</PEP_Element_ID>"
				+ "<FechaBaja>Prueba Frida para29</FechaBaja>"
				+ "<FechaAlta>Prueba Frida para30</FechaAlta>"
				+ "<FechaCambio>Prueba Frida para31</FechaCambio>"
				+ "<Proveedor>Prueba Frida para32</Proveedor>"
				+ "</PeEquipo>";
		singletonQueue j=new singletonQueue();
		j.mandarMensaje(cadena);
		
		k.setNombre("HOLA");
		k.setRef_sisa("RFC-787-HJUI");
		return k;
		
		
		
	}
	
		
	}

