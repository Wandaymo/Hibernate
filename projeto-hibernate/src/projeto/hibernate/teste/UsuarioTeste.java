package projeto.hibernate.teste;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import projeto.hibernate.modelo.Endereco;
import projeto.hibernate.modelo.EstadoCivil;
import projeto.hibernate.modelo.Usuario;
import projeto.hibernate.modelo.Veiculo;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		//usuario.setId(2);
		usuario.setNome("Wandaymo 2");
		usuario.setDataNascimento(new Date());
		//usuario.setIdade(26);
		usuario.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		Veiculo monza = new Veiculo("Monza", 1998);
		Veiculo santana = new Veiculo("Santana", 1996);
		
		usuario.getVeiculos().add(monza);
		usuario.getVeiculos().add(santana);
		
		//usuario.setVeiculo(monza);
		//monza.setUsuario(usuario);
		//santana.setUsuario(usuario);
	
		
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. Boa Esperança");
		endereco.setNumero(1425);
		endereco.setCidade("Teresina");
		
		Endereco enderecoComercial = new Endereco();
		enderecoComercial.setLogradouro("Rua Riachuelo");
		enderecoComercial.setNumero(4319);
		enderecoComercial.setCidade("Jataí");
	
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		/*usuario.getEnderecos().add(endereco);
		usuario.getEnderecos().add(enderecoComercial);*/
		
		session.save(usuario);
		session.save(monza);
		session.save(santana);
		
		
		
		session.getTransaction().commit();
		
		Usuario usuarioGet = (Usuario) session.get(Usuario.class, 3);
		System.out.println("Nome :" + usuarioGet.getNome());
		//System.out.println("Endereço: " + usuarioGet.getEnderecos().get(0).getLogradouro());
		session.close();
	}
	
	
}
