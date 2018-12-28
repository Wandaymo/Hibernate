package projeto.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.modelo.Usuario;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNome("Wandaymo");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(usuario);
		
		session.getTransaction().commit();
		session.close();
	}
	
	
}
