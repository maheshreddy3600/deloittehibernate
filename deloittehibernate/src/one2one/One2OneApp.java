package one2one;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import hbn.Employee;

public class One2OneApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*Student std = new Student();
		std.setRno(127);
		std.setName("deloitte");
		Student std1 = new Student();
		std1.setRno(128);
		std1.setName("nexwave");
		
		Address addr = new Address();
		addr.setAddressid(12);
		addr.setCity("hyd");
		addr.setStudent(std);
		Address addr1 = new Address();
		addr1.setAddressid(13);
		addr1.setCity("banglore");
		addr1.setStudent(std1);
		session.save(addr);
		session.save(addr1);*/
		
		Query query = session.createQuery("from Address");
		List<Address> addr = query.list();
		for(Address a:addr){
			System.out.println(a.getStudent().getRno()+" "+a.getStudent().getName()+" "+a.getAddressid());
		}
		tx.commit();
		session.close();
	}
}
