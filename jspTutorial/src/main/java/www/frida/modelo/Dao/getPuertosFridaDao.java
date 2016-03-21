package www.frida.modelo.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.frida.analizacadenas.AnalizaPuertos;
import com.frida.analizacadenas.AnalizaTarjetas;
import com.frida.analizacadenas.analizacadenasRespuestas;
import com.frida.singleton.sender.generadorFecha;
import com.frida.singleton.sender.singletonQueue;
import com.frida.xmlArmados.PePuertoaXmlCadena;
import com.frida.xmlArmados.PeTarjetaxmlCadena;
import com.frida.xmlPojo.PePuerto;
import com.frida.xmlPojo.PeTarjeta;

import www.frida.modelo.HibernateUtil;
import www.frida.modelo.InventarioTarjetasCe;
import www.frida.modelo.InvertarioPuertoCe;
import www.frida.modelo.admfridaarm;

public class getPuertosFridaDao {
	
	
	public List<admfridaarm> getTarjeta(String correlatioId){
		List<admfridaarm> lista=null;
		
try{
	System.out.println("1");
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println("2");
		session.beginTransaction();
	Query query = session.createSQLQuery("select * "
			+ "from adm_frida_arm where "
			+ "id_elemento_padre=(select id_elemento_arm from "
			+ "adm_frida_arm where correlation_id=:correlatioId "
			+ "and  estatu_arm='ALTA')and estatu_arm='PENDIENTE';")
	.addEntity(admfridaarm.class).setParameter("correlatioId", correlatioId);
	
	
	 lista=query.list();
	for(admfridaarm k:lista){
		generadorFecha on=new generadorFecha();
	    String ca=	on.getCadenaAlfanumAleatoria(20);
	    String cadenaAleatoria=ca+on.gener();
	    AnalizaPuertos j=new AnalizaPuertos(k.getIdElementoArm());
	    
System.out.println(getXMLPuerto(j,k.getIdElementoArm(),cadenaAleatoria,k.getIdElementoPadre()));
		System.out.println(k.getIdElementoArm());
		System.out.println(k.getIdElementoPadre());
	
		
	}
	
	session.getTransaction().commit();  
	session.close();
	  
		
			  
}catch (HibernateException e) {
    
}finally {
 //  newSession.close(); 
}
	
			
	return lista;							   
			
	}
	
	public String getXMLPuerto(AnalizaPuertos analizapuerto,String puerto,String messageID,String tarjeta){
		String cadenaXml=null;
		try{
			
			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
   			session.beginTransaction();
   			Criteria cr=session.createCriteria(InvertarioPuertoCe.class);
   			Criterion a=Restrictions.eq("idNodo",analizapuerto.getIdNodo());
   			Criterion b=Restrictions.eq("repisat",analizapuerto.getRepisat());
   			Criterion c=Restrictions.eq("posicionTarjeta",analizapuerto.getPosicionTarjeta());
   			Criterion d=Restrictions.eq("subslot",analizapuerto.getSubslot());
   			Criterion f=Restrictions.eq("puerto",analizapuerto.getPuerto());
   			 
   			
   cr.add(Restrictions.and(Restrictions.and(a,b),Restrictions.and(Restrictions.and(c,d),f)));
   			List<InvertarioPuertoCe> re=cr.list();
   			for(InvertarioPuertoCe ob: re){
   				System.out.println("HOLA PUERTOS");
   				System.out.println(puerto);
   				PePuerto o=new PePuerto();
   				o.setMovimiento("ALTA");
   				o.setIdnodo(ob.getIdNodo());
   				o.setIdTarjetaFrida(tarjeta);
   				o.setPuerto(ob.getPuerto());
   				o.setIdPuertoFrida(puerto);
   				o.setTipoPuerto(ob.getTipoPuerto());
   				o.setPuntoConexionDestino("");
   				o.setVelocidad(ob.getCapacidadPuerto());
   				o.setEstadoAprovisonamiento(ob.getGestionada());
   				o.setNombreOficialPisa(ob.getNombreOficialPisa());
   				o.setDescripciones(ob.getObservaciones());
   				o.setNombre("");
   				o.setInfra(ob.getPtoTroncal());
   				o.setTipoServicio(ob.getTabla());
   				o.setEstatusOcupacion(ob.getEstatus());
   				o.setTipoConector(ob.getTipoConector());
   				o.setLongitud(ob.getLongJumper());
   				o.setUbicacionPuerto(ob.getUbicacionBdfo());
   				o.setRepisa(ob.getRepisat());
   				o.setContacto(ob.getContactoBdfo());
   				o.setTipoBDFO(ob.getTipoBdfoAmdocs());
   				o.setTipoDFO(ob.getTipoDfoAmdocs());
   				o.setFechaMoviento(ob.getFechaAlta());
   				
   				System.out.println(ob.getContactoBdfo());  			
   				PePuertoaXmlCadena xml=new PePuertoaXmlCadena();
			cadenaXml=xml.getxmlPuerto(o);
               singletonQueue envio=new singletonQueue();
   				envio.mandarMensaje(cadenaXml, messageID);
   				this.getUpdateEstatus("ENVIADO",puerto,messageID);

   				   				
   			}
		}
		catch(HibernateException e) {
		    System.out.println(e.getCause());
		}finally {
		 //  newSession.close(); 
		}
		return cadenaXml;
	}
	

	public void getUpdateEstatus(String estaudArm,String id_elmento,String correlaID){
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session newSession = sessionFactory.openSession();
	     Transaction tx = null;
	     try{
	         newSession.beginTransaction();
	        Query query = newSession.createQuery("update admfridaarm set estatuArm = :estatuArm , correlationId=:correlationId" + " where idElementoArm = :idElementoArm");
	        query.setParameter("estatuArm", estaudArm);
	        query.setParameter("idElementoArm", id_elmento);
	        query.setParameter("correlationId", correlaID);
	        query.executeUpdate();
	        newSession.getTransaction().commit();
	        newSession.close();
	     }catch (HibernateException e) {
	     
	     }finally {
	      //  newSession.close(); 
	     }
		
	     
	}
		
	
	
	
	public static void main(String args[]){
		getPuertosFridaDao k=new getPuertosFridaDao();
		k.getTarjeta("TP0UHOIM43CPQ602H8QM2016211133749");
		
	}
	
	
	

}
