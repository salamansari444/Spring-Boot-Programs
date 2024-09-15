package in.ineuron;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import in.ineuron.bo.MarriageSeeKer;
import in.ineuron.dao.IMarriageDao;
import in.ineuron.service.IMarriageService;

@SpringBootApplication
public class DaoSpringDataJpaBlobClobApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpaBlobClobApplication.class, args);

		IMarriageService bean = context.getBean(IMarriageService.class);
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter the Name"); String name=sc.next();
		 * 
		 * System.out.println("Enter the Address"); String address=sc.next();
		 * 
		 * System.out.println("Enter the photoPath"); String photo=sc.next();
		 * 
		 * System.out.println("Enter the bioDataPath"); String bio=sc.next();
		 * 
		 * System.out.println("Is Person is Indian"); Boolean indian=sc.nextBoolean();
		 * 
		 * FileInputStream fis = new FileInputStream(photo); byte[] photodata = new
		 * byte[fis.available()]; fis.read(photodata);
		 * 
		 * File file = new File(bio); FileReader reader = new FileReader(file); char[]
		 * bioDataContent = new char[(int) file.length()]; reader.read(bioDataContent);
		 * 
		 * MarriageSeeKer seeker = new MarriageSeeKer(name, address, photodata,
		 * LocalDateTime.of(1999, 12, 12, 20, 15), bioDataContent, indian); String
		 * registerMarriageSeeker = bean.registerMarriageSeeker(seeker);
		 * System.out.println(registerMarriageSeeker); fis.close(); reader.close();
		 * sc.close();
		 */
		Optional<MarriageSeeKer> optional = bean.searchSeekerById(1L);
		if (optional.isPresent()) {
			MarriageSeeKer seeker = optional.get();
			System.out.println(
					seeker.getId() + " " + seeker.getName() + " " + seeker.getAddress() + " " + seeker.getIndian());

			OutputStream os = new FileOutputStream("retrieve_image.jpg");
			os.write(seeker.getPhoto());
			os.flush();

			Writer writer = new FileWriter("retrive_biodata.txt");
			writer.write(seeker.getBio());
			writer.flush();

			os.close();
			writer.close();

			System.out.println("LOBS are retrieved...");

		} else {
			System.out.println("Record not available");
		}
		
		((FileInputStream) context).close();
	
	}

}
