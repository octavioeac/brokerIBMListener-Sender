package www.frida.modelo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.frida.singleton.sender.generadorFecha;
import com.frida.singleton.sender.singletonQueue;

import www.frida.modelo.CatAnillo;
import www.frida.modelo.HibernateUtil;
import www.frida.modelo.admfridaarm;

public class admfridaarmOTFrida {

	
	public String getServicioArm(String idOT,String estatus_cns,String estatus_envio, String nom_ele){
		admfridaarmOTFrida j=new admfridaarmOTFrida();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		newSession.beginTransaction();
		 Criteria cr = newSession.createCriteria(admfridaarm.class);
		 Criterion a=Restrictions.eq("idOtTrabajo", idOT);
		 Criterion b=Restrictions.eq("estatusCns",estatus_cns);
		 Criterion c=Restrictions.eq("estatuArm",estatus_envio);
		 Criterion d=Restrictions.eq("nomElement",nom_ele);
		 Criterion and1=Restrictions.and(a,b);
		 Criterion and2=Restrictions.and(c,d);
		 
		 
		 cr.add(Restrictions.and(and1,and2));
		 System.out.println(cr.list());
		List<admfridaarm> result = cr.list();
		 
		 newSession.getTransaction().commit();
		
		  
		  for(admfridaarm k:result){
			  	
				generadorFecha on=new generadorFecha();
			    String ca=	on.getCadenaAlfanumAleatoria(20);
			    String cadenaAleatoria=ca+on.gener();
			    			  
	 catAnilloBusqueda objeto=new catAnilloBusqueda();
	 
	 
	 
		String cadena= objeto.getPeEquipo(k.getIdElementoArm(), estatus_cns,cadenaAleatoria);
		singletonQueue mensa=new singletonQueue();
		mensa.mandarMensaje(cadena,cadenaAleatoria);
		 j.getUpdateEstatus("ENVIADO", k.getIdElementoArm(),cadenaAleatoria);
		if(estatus_cns=="CANCELADO"){
			j.getDeleteElemento( k.getIdElementoArm(),"ENVIADO","CANCELADO");
		} 
			  
		  }
		  
		 
		 return null;
		
		
		
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




public void getDeleteElemento(String id_elmento,String estaudArm,  String  estatusCns ){

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session newSession = sessionFactory.openSession();
     Transaction tx = null;
     try{
         newSession.beginTransaction();
        Query query = newSession.createQuery("delete admfridaarm where  idElementoArm = :idElementoArm and estatuArm = :estatuArm and estatusCns= :estatusCns");
        System.out.println(query.getQueryString());
          query.setParameter("idElementoArm", id_elmento);
          query.setParameter("estatuArm", estaudArm);
          query.setParameter("estatusCns", estatusCns);
           int result = query.executeUpdate();
           System.out.println(result);
        
        if (result > 0) {
            System.out.println("REMOVIDO");
        }
        newSession.getTransaction().commit();
        newSession.close();
     }catch (HibernateException e) {
     
     }finally {
      //  newSession.close(); 
     }

}






	
	public static void main(String[] args) {
		admfridaarmOTFrida k=new admfridaarmOTFrida();
		k.getServicioArm("CE_GUSLMO_001CNOO","GESTIONADO","PENDIENTE","NODO");
		k.getServicioArm("CE_GUSLMO_001CNOO","CANCELADO","ENVIADO","NODO");
//		k.getDeleteElemento("GSVEXSGU009-DIST2-7450","ENVIADO","CANCELADO");
		
        //k.getUpdateEstatus("ENVIADO", "GSVEXSGU009-DIST2-7450");
        
       
		
        
	}

	
	
	
}

