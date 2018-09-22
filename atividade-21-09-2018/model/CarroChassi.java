package alyssonJava.modelo.dao.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
	uniqueConstraints=@UniqueConstraint(
		name="UK_PREFIXO_NUMERO",
		columnNames={"Prefixo_Placa", "Numero_Placa"}
	)
)
public class CarroChassi implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_chassi", length=3)
	private long chassi;
	
	@Column(name="Numero_Placa")
	private long numero;
	
	@Column(name="Prefixo_Placa")
	private String prefixo;
	
	/*
	 *Getters and setters 
	 */

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

}
