package projeto.hibernate.teste;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GeradorSessionFactory { 
	
	public static SessionFactory obterSessionFactory() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
