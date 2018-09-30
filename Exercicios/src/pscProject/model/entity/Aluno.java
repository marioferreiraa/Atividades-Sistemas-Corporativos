package pscProject.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Aluno implements Serializable, IEntidade{
	
	@Id
	@Column(name="CPF", length=14)
	private String cpfAluno;
	
	@Column(name="nome_aluno")
	private String nomeAluno;
	
	@ManyToMany
	private List<Disciplinas> listaDisciplinas;
	
	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public List<Disciplinas> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(List<Disciplinas> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	@Override
	public Object getChavePrimaria() {
		// TODO Auto-generated method stub
		return this.cpfAluno;
	}
	
}
