package projeto.hibernate.modelo;

import javax.persistence.Embeddable;

//Utilizado para criar uma nova tabela na mesma base de dados já existente com chave estrangeira
@Embeddable
public class Endereco {
	private String logradouro;
	private Integer numero;
	private String cidade;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
