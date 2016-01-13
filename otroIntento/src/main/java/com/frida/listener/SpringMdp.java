package com.frida.listener;
import java.util.logging.Level;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import java.util.logging.*;



import com.frida.dao.Snippet;
import com.sun.nio.sctp.Notification;

public class SpringMdp extends DefaultMessageListenerContainer implements MessageListener {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringMdp.class); 
	
	
	   public void onMessage(Message message) {
		   try{
			   TextMessage msg = null;
				 msg=(TextMessage)message;
				 String text = msg.getText();
					System.out.println(text);
	            //logger.info("HOLA MENSAJE");
				 logger.info(message.toString());
				 logger.info("HOLA MENSAJE 2");  
           System.out.println("HOLA MUNDO MDB");
           Snippet julio=new Snippet();
   		julio.pruebaStore();
           //System.out.println(message.getJMSDeliveryMode());
           //System.out.println(message.toString());
           System.out.println(message);
	        }
	     catch(JMSException e){
		   System.out.println(e.getMessage());
	   }
	    
	}
	   
}	   