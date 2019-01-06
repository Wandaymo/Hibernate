package projeto.hibernate.teste;




import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.modelo.Funcionario;

public class TesteHql1 {
	
	public static void main(String[] args) {
		
		 Session session = GeradorSessionFactory.obterSessionFactory().openSession();
		 
		 Query consulta = session.createQuery("from Funcionario order by nome");
		 
		 List<Funcionario> funcionarios = consulta.getResultList();
		 
		  
		 
		 for(Funcionario funcionario : funcionarios) {
			 System.out.println("Nome: " + funcionario.getNome());
			 System.out.println("CPF: " + funcionario.getCpf());
			 System.out.println("------------------------------\n");
		 }
		 
		 session.close();
	}
	
	private static SessionFactory obterSessionFactory() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		return factory;
	}

}
