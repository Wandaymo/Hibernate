package projeto.hibernate.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	private String cpf;
	private Date dataAdmissao;
	private List<Projeto> projetos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Double salario, String cpf, Date dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// @ManyToMany

	// Para não precisar salvar manualmente os projetos da classe FuncionarioTeste:
	// session.save(projeto1);
	// session.save(projeto2);
	// usamos este código:
	@ManyToMany(cascade = CascadeType.ALL)
	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_admissao")
	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
