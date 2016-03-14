package www.frida.modelo.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.frida.analizacadenas.AnalizaTarjetas;
import com.frida.singleton.sender.generadorFecha;
import com.frida.singleton.sender.singletonQueue;
import com.frida.xmlArmados.PeTarjetaxmlCadena;
import com.frida.xmlPojo.PeEquipoXml;
import com.frida.xmlPojo.PeTarjeta;

import www.frida.modelo.CatAnillo;
import www.frida.modelo.HibernateUtil;
import www.frida.modelo.InventarioTarjetasCe;
import www.frida.modelo.StoreProcedureSAIB;
import www.frida.modelo.admfridaarm;

public class getTarjetasFridaDao {


	
	
	public List<admfridaarm> getTarjeta(String correlatioId){
		List<admfridaarm> lista=null;
		
try{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
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
	    
		PeTarjeta obj=new PeTarjeta();
		System.out.println(k.getIdElementoArm());
		System.out.println(k.getIdElementoPadre());
		System.out.println(getTxProoverdor(k.getIdElementoPadre()));
		AnalizaTarjetas j=new AnalizaTarjetas(k.getIdElementoArm());
		System.out.println(getXMLEquipo(j,getTxProoverdor(k.getIdElementoPadre()),k.getIdElementoArm(),cadenaAleatoria));
		
	}
	
	session.getTransaction().commit();  
	session.close();
	  
		
			  
}catch (HibernateException e) {
    
}finally {
 //  newSession.close(); 
}
	
			
	return lista;							   
			
	}
	
	
	
	
	public String getTxProoverdor(String idNOdo){
		String texProovedor=null;
       		try{
       			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
       			session.beginTransaction();
       		 Criteria cr = session.createCriteria(CatAnillo.class);
       		  Criterion a=Restrictions.eq("idNodo",idNOdo);
       		 cr.add(a);
       		 List<CatAnillo> ok=cr.list();
       		for(CatAnillo j:ok){
       			
       			texProovedor=j.getProveedorTx();
       			
       		}
       		 
       			session.getTransaction().commit();
       	
	}catch (HibernateException e) {
	    System.out.println(e.getCause());
	}finally {
	 //  newSession.close(); 
	}
	return	texProovedor;
	}
	
	
	
	public String getXMLEquipo(AnalizaTarjetas analizaTarjetas,String txProveedor,String tarjeta,String messageID){
		String cadenaXml=null;
		try{
			
			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
   			session.beginTransaction();
   			Criteria cr=session.createCriteria(InventarioTarjetasCe.class);
   			Criterion a=Restrictions.eq("idNodo",analizaTarjetas.getIdNodo());
   			Criterion b=Restrictions.eq("repisat",analizaTarjetas.getRepisat());
   			Criterion c=Restrictions.eq("posicionTarjeta",analizaTarjetas.getPosicionTarjeta());
   			Criterion d=Restrictions.eq("subslot",analizaTarjetas.getSubslot());
   			
   			cr.add(Restrictions.and(Restrictions.and(a,b),Restrictions.and(c,d)));
   			List<InventarioTarjetasCe> re=cr.list();
   			for(InventarioTarjetasCe ob: re){
   				PeTarjeta j=new PeTarjeta();
   			
   				j.setMovimiento("ALTA");
   				j.setiDNodo(analizaTarjetas.getIdNodo());
   				j.setiDTarjetaFrida(tarjeta);
   				j.setRepisa(analizaTarjetas.getRepisat());
   				j.setSlot(analizaTarjetas.getPosicionTarjeta());
   				j.setSubSlot(analizaTarjetas.getSubslot());
   				j.setEstadoAprovisionamiento(ob.getEstatus());
   				j.setModeloTarjeta(ob.getModeloTarjeta());
   				j.setProveedor(txProveedor);
   				j.setMessageID(messageID);
   				PeTarjetaxmlCadena xml=new PeTarjetaxmlCadena();
   				  				
   				cadenaXml=xml.getxmlTarjeta(j);
               singletonQueue envio=new singletonQueue();
   				envio.mandarMensaje(cadenaXml, messageID);
   				this.getUpdateEstatus("ENVIADO",tarjeta,messageID);

   				   				
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
	
	
	
	public static void main(String[] args) {
		getTarjetasFridaDao k=new getTarjetasFridaDao();
           k.getTarjeta("00001");
		
	}

}
