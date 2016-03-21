package www.frida.modelo.Dao;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.frida.pojoXML.PsEquipo;

import www.frida.modelo.ArmResponsePsEquipo;
import www.frida.modelo.HibernateUtil;

public class armReponsePsEquipoDAO {

	public void insertaMensaje(PsEquipo equipo,String xml){
		
		try{
		ArmResponsePsEquipo objeto=new ArmResponsePsEquipo();
		objeto.setIdentificadorArm(equipo.getIdentificadorARM());
		objeto.setIdNodo(equipo.getID_Nodo());
		objeto.setMessageId(equipo.getMessageId());
		objeto.setNombreEquipo(equipo.getNombreEquipo());
		objeto.setXmlMessage(xml);
		objeto.setFechaMensajeArm(new Date());
		
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session newSession = sessionFactory.openSession();
		 newSession.beginTransaction();
		 
		 
		 newSession.persist(objeto);
		   newSession.getTransaction().commit();
	        newSession.close();
		  }catch (HibernateException e) {
			     
		     }finally {
		      //  newSession.close(); 
		     }
		 
	}
	
	
	
}
