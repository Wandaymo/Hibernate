package projeto.hibernate.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

//Informa que o Usuario será um tabela do banco
@Entity

// Usamos para definir um nome diferente diferente da classe para a tabela
// @Entity(name = "NomeDaTabela")

// Uma segunda forma para mudar o valor da tabela
// @Table(name = "NomeDaTabela")
public class Usuario {

	private Integer id;
	private String nome;
	private Date dataNascimento;
	private Integer idade;
	private EstadoCivil estadoCivil;
	//private Endereco endereco;
	
	//private List<Endereco> enderecos = new ArrayList<>();
	
	private List<Veiculo> Veiculos = new ArrayList<>();
	
	//private Veiculo veiculo;

	// Define a chave primária
	@Id
	@GeneratedValue
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

	// Define como a data é salva, neste caso somente a data é salva, descartando as
	// horas.
	@Temporal(TemporalType.DATE)
	// @Collum(name = "data_nascimento") -> Muda o nome da coluna para o valor
	// definido
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Não salva o atributo idade no banco
	@Transient
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// Salva o enum como string ao invés de número
	//@Enumerated(EnumType.STRING)
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "id_usuario")
	
	//Gera uma terceira tabela definindo o seu nome
	//@JoinTable(name = "nome_tabela", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_veiculo"))
	public List<Veiculo> getVeiculos() {
		return Veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		Veiculos = veiculos;
	}
	
	
	//Cria um relacionamento um-pra-um
	//@OneToOne
	
	/*//Salva em modo cascata no relacionamento um-pra-um
	//@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_veiculo")
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}*/

	
	
	/*//Cria uma segunda tabela no banco
	@ElementCollection
	
	//Modos de funcionamento do @ElementCollection
	//@ElementCollection(fetch = FetchType.EAGER) Busca todos os dados de uma vez
	//@ElementCollection(fetch = FetchType.LAZY) Busca os dados por partes
	//O modo padrão é o Lazy
	
	//Define o nome da nova tabela a ser criada
	@JoinTable(name = "usu_endereco", joinColumns = @JoinColumn(name = "id_usuario"))
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}*/

	/*// Utilizado para adicionar dados na tabela já criada
	@Embedded
	//Utilizado para mudar o nome de alguma coluna em um banco já criado, DEVE ser adicionado antes do getEndereco
	@AttributeOverrides({ 
		@AttributeOverride(name = "logradouro", column = @Column(name = "rua")) 
	})
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/
	
	
	
	
	

}
