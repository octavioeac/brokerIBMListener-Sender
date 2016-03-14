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

import com.frida.analizaxml.pruebaXML;
import com.frida.analizaxml.xmlAnalytic;
import com.sun.nio.sctp.Notification;

import www.frida.modelo.Snippet;

public class SpringMdp extends DefaultMessageListenerContainer implements MessageListener {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringMdp.class); 
	
	
	   public void onMessage(Message message) {
		   try{
			   TextMessage msg = null;
				 msg=(TextMessage)message;
				 String text = msg.getText();
				 System.out.println("HOLA MUNDO");
				 logger.info("HOLA LOGGER");
					System.out.println(text);
	          	 logger.info(message.toString());
				xmlAnalytic k=new xmlAnalytic(text);
					k.detonaProceso();
           System.out.println(message);
	        }
	     catch(JMSException e){
		   System.out.println(e.getMessage());
	   }
	    
	}
	   
}	   