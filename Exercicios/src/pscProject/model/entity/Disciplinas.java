package pscProject.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Disciplinas implements Serializable, IEntidade {

	@Id
	@Column(name="codigo_disciplina")
	private Integer codigoDisciplina;
	
	@Column(name="nome_disciplina")
	private String nomeDisciplina;
	
	@ManyToMany
	private List<Aluno> listaAlunos;
	
	public Integer getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(Integer codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	@Override
	public Object getChavePrimaria() {
		// TODO Auto-generated method stub
		return this.codigoDisciplina;
	}

}
