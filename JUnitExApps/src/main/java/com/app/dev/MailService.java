package com.app.dev;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.app.prop.LoadPropertices;

public class MailService {
	public static LoadPropertices loadPropertices = new LoadPropertices();

	public static boolean sendEmail(String toAddr, String subject, String text) {
		boolean isMailSent = true;
		try {
			Properties prop = loadPropertices.getProperticesObject();
			final String userName = prop.getProperty("username");
			final String passWord = prop.getProperty("password");
			Properties props = new Properties();
			// System.out.println(props + "...>" + prop + "..>" + userName);
			props.put(prop.getProperty("AuthKey"), "true");
			// System.out.println(props);
			props.put(prop.getProperty("TLSKey"), "true");
			// System.out.println(props);
			props.put(prop.getProperty("HostKey"), "smtp.gmail.com");
			// System.out.println(props);
			props.put(prop.getProperty("PortKey"), "587");
			// System.out.println(props);
			Session session = Session.getInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, passWord);
				}
			});
//			System.out.println(session);
			Message message = new MimeMessage(session);
			InternetAddress netAddr = new InternetAddress(userName);
			message.setFrom(netAddr);
			message.setRecipients(Message.RecipientType.TO, netAddr.parse(toAddr));
			message.setSubject(subject);// subject
			message.setText(text);// message
			Transport.send(message);
			System.out.println("Done");
		} catch (Exception e) {
			isMailSent = false;
			e.printStackTrace();
		}
		return isMailSent;
	}
}
