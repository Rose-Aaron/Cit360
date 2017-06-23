package hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Config {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Contact contact1 = new Contact("Luke", "Lskywalker@hotmail.com", "Hoth", "4089162345");
		session.persist(contact1);

		Contact contact2 = new Contact("Han", "Hsolo@hotmail.com", "Degabah", "2054379966");
		Serializable id = session.save(contact2);
		System.out.println("created id: " + id);

		Contact contact3 = (Contact) session.get(Contact.class, new Integer(1));
		if (contact3 == null) {
			System.out.println("Sorry no Contact with id=1");
		} else {
			System.out.println("Contact3's name: " + contact3.getName());
		}

		Contact contact4 = (Contact) session.load(Contact.class, new Integer(4));
		System.out.println("Contact4's name: " + contact4.getName());

		Contact contact5 = (Contact) session.load(Contact.class, new Integer(5));
		contact5.setEmail("newjedi@hotmail.com");
		contact5.setTelephone("1051259500");
		session.update(contact5);

		Contact contact6 = new Contact("Leah", "PrincessLeah@hotmail.com", "Tattooine", "3067215983");
		session.update(contact6);

		Contact contact7 = new Contact();
		contact7.setId(7);
		session.delete(contact7);

		Contact contact8 = (Contact) session.load(Contact.class, new Integer(8));
		session.delete(contact8);

		session.getTransaction().commit();
		session.close();

	}

}
