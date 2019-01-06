package projeto.hibernate.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value = "quatro_rodas")
public class VeiculoQuatroRodas extends VeiculoHeranca{

	private Integer quantidadePortas;

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	
}
