package com.cda.ilot4.initial;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class InitialMain {
	
	private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 587;
    private static final boolean SSL_FLAG = true;

		public static void main(String [] args) {    

			String userName = "H.BOGRAND@GMAIL.COM";
	        String password = "";
	         
	        String fromAddress="H.BOGRAND@GMAIL.COM";
	        String toAddress =  "jessy.guillemot@hotmail.fr";
	        String subject = "Test Mail";
	        String message = "Hello from Apache Mail";
	         
	        try {
	            Email email = new SimpleEmail();
	            email.setHostName(HOST);
	            email.setSmtpPort(PORT);
	            email.setAuthenticator(new DefaultAuthenticator(userName, password));
	            email.setSSLOnConnect(SSL_FLAG);
	            email.setFrom(fromAddress);
	            email.setSubject(subject);
	            email.setMsg(message);
	            email.addTo(toAddress);
	            email.send();
	        }catch(Exception ex){
	            System.out.println("Unable to send email");
	            System.out.println(ex);
	        }
	    }
}