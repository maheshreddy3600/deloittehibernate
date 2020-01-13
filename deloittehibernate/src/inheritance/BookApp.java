package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		
		Book book = new Book();
		book.setBookid(1001);
		book.setTitle("Oracle");
		book.setAuthor("xyz");
		book.setPrice(6000);
		
		DotnetBook dotnet = new DotnetBook();
		dotnet.setBookid(2001);
		dotnet.setTitle("ASP.net");
		dotnet.setAuthor("abcde");
		dotnet.setPrice(700);
		dotnet.setCds(3);
		
		JavaBook java =new JavaBook();
		java.setBookid(4001);
		java.setTitle("Spring prog");
		java.setAuthor("Rod johnson");
		java.setPrice(900);
		java.setDiscount(25);

		ssn.save(book);
		ssn.save(java);
		ssn.save(dotnet);
		tx.commit();
		ssn.close();
	}

}
