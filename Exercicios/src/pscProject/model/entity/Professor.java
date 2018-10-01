package pscProject.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor extends Pessoa implements Serializable, IEntidade{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo_professor")
	private Integer codigoProfessor;
	
	@Column(name="salario")
	private Double salarioProfessor;
	
	public Integer getCodigoProfessor() {
		return codigoProfessor;
	}

	public void setCodigoProfessor(Integer codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}

	public Double getSalarioProfessor() {
		return salarioProfessor;
	}

	public void setSalarioProfessor(Double salarioProfessor) {
		this.salarioProfessor = salarioProfessor;
	}
	
	@Override
	public Object getChavePrimaria() {
		// TODO Auto-generated method stub
		return this.codigoProfessor;
	}

}
