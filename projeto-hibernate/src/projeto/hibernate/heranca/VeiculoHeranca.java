package projeto.hibernate.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
 

@Entity
//Define que os dados de todas as classes serão armazenadas em um única tabela(single table)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//Une os dados através da operação join do Banco de dados
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "tipo_ veiculo", discriminatorType = DiscriminatorType.STRING)
public abstract class VeiculoHeranca {

	private Integer id;
	private String marca;
	private String modelo;
	private Integer ano;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

}
