package in.ineuron.service;

import java.util.Arrays;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderImpl implements IPurchaseOrder {
	
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {
		double amt=0;
		for(double price: prices) {
			amt=amt+price;
		}
		String msg=Arrays.toString(items)+" with Price "+Arrays.toString(prices)+" are purchase with bill amount "+amt;
		
		String status=sendMail(msg,toEmails);
	
		return msg +"---->"+status;
		
		
	}

	private String sendMail(String msg, String[] toEmails) {
		System.out.println("Sender Implemenatation class is "+sender.getClass().getName());
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom(fromEmail);
			helper.setCc(toEmails);
			helper.setSubject("Open it to konw it");
			helper.setSentDate(new Date());
			helper.setText(msg);
//			helper.addAttachment("ineuron.jpg", new
//			ClassPathResource("ineuron.jpg"));
			sender.send(message);
		} catch (MailException e) {
			
			e.printStackTrace();
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		return "mail-sent";
	}

}
