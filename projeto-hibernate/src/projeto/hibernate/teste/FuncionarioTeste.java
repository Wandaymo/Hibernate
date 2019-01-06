package projeto.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.modelo.Funcionario;
import projeto.hibernate.modelo.Projeto;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		
		//Configuração correta para a versão 5.3.7
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Projeto projeto1 = new Projeto();
		projeto1.setNome("Projeto 1");
		
		Projeto projeto2 = new Projeto();
		projeto2.setNome("Projeto 2");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Wandaymo Gomes");
		funcionario.setSalario(2500.0);
		
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Radynalva Gomes");
		funcionario2.setSalario(400.0);
		
		
		funcionario.getProjetos().add(projeto1);
		funcionario.getProjetos().add(projeto2);
		
		funcionario2.getProjetos().add(projeto1);
		
		projeto1.getFuncionario().add(funcionario);
		
		projeto2.getFuncionario().add(funcionario);
		projeto2.getFuncionario().add(funcionario);
		
		session.save(funcionario);
		session.save(funcionario2);
		//session.save(projeto1);
		//session.save(projeto2);
		
		
		
		session.getTransaction().commit();
		session.close();
	}

}
