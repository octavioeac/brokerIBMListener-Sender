package www.frida.modelo.Dao;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.frida.pojoXML.PsTarjeta;

import www.frida.modelo.ArmResponsePsTarjeta;
import www.frida.modelo.HibernateUtil;

public class ArmResponsePsTarjetaDAO {
	
	
	public void insertTarjetaHistorico(PsTarjeta tarjeta, String xml){
		
		try{
			
			
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session newSession = sessionFactory.openSession();
			
			 newSession.beginTransaction();
			 ArmResponsePsTarjeta j=new ArmResponsePsTarjeta();
				j.setIdTarjetaArm(tarjeta.getIDTarjetaARM());
				j.setIdTarjetaFrida(tarjeta.getIDTarjetaFrida());
				j.setNombreTarjeta(tarjeta.getNombreTarjeta());
				j.setMeesageId(tarjeta.getMeesageID());
				j.setXmlMessage(xml);
				j.setFechaMensaje(new Date());
				 
			 newSession.persist(j);
			
			 newSession.getTransaction().commit();
             newSession.close();
			  		 	
			
		}
		
		catch(HibernateException e){
			
			
		}
		finally{
			
		}
	}
	

	
	
	
	
}
