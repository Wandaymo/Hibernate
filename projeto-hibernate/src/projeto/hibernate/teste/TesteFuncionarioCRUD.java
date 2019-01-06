package projeto.hibernate.teste;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.modelo.Funcionario;

public class TesteFuncionarioCRUD {
	
	 
	
	public static void main(String[] args) {
		//CRUD
		Funcionario funcionario1 = new Funcionario("Wandaymo", 2500.0, "040.599.243-26", new Date());
		
		create(funcionario1);
		Funcionario funcionarioBanco = read(1);
		System.out.println("Nome: " + funcionarioBanco.getNome());
	}

	
	
	public static void create(Funcionario funcionario) {
		Session session = obterSessionFactory().openSession();
		session.beginTransaction();
		
		
		
		session.save(funcionario);
		
		session.getTransaction().commit();
	}
	
	public static Funcionario read(Integer idFuncionario) {
		Session session = obterSessionFactory().openSession();
		session.beginTransaction();
		
		Funcionario funcionario = (Funcionario) session.get(Funcionario.class, idFuncionario);
		
		return funcionario;
		
	}
	
	private static SessionFactory obterSessionFactory() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}
}
