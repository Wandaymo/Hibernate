package projeto.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.heranca.VeiculoDuasRodas;
import projeto.hibernate.heranca.VeiculoQuatroRodas;
import projeto.hibernate.modelo.Funcionario;
import projeto.hibernate.modelo.Projeto;

public class VeiculoHerancaTeste {
	
	public static void main(String[] args) {
		
		
		//Configuração correta para a versão 5.3.7
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		VeiculoQuatroRodas chevette = new VeiculoQuatroRodas();
		chevette.setMarca("Chevrolet");
		chevette.setModelo("Chevette");
		chevette.setAno(1994);
		chevette.setQuantidadePortas(2);
		
		VeiculoDuasRodas moto = new VeiculoDuasRodas();
		moto.setMarca("Honda");
		moto.setModelo("Fan");
		moto.setAno(2015);
		moto.setCilindradas(150);
		
		
		session.save(chevette);
		session.save(moto);
		
		
		
		session.getTransaction().commit();
		session.close();
	}

}
