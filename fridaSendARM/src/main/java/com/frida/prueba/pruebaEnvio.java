package com.frida.prueba;

import com.frida.singleton.sender.singletonQueue;

public class pruebaEnvio {

	public static void main(String[] args) {
		String cadenaxml="<PsEquipo>"
				+ "<NombreEquipo>ARM-NOMBRE</NombreEquipo>"
				+ "<IdentificadorARM>GSVEXSGU009-DIST2-7450-ARM-GENERACION</IdentificadorARM>"
				+ "<ID_Nodo>GSVEXSGU009-DIST2-7450</ID_Nodo>"
				+ "<messageID>00001</messageID></PsEquipo>";
		singletonQueue j=new singletonQueue();
		j.mandarMensaje(cadenaxml, "ldfsnkd");

	}

}
