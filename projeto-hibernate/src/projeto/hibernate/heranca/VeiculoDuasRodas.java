package projeto.hibernate.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//Define o nome dos objetos adicionados à base
@DiscriminatorValue(value = "duas_rodas")
public class VeiculoDuasRodas extends VeiculoHeranca {

	private Integer cilindradas;

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

}
