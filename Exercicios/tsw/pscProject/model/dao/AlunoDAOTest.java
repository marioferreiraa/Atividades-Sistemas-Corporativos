package pscProject.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import pscProject.model.dao.AlunoDAO;
import pscProject.model.entity.Aluno;
import pscProject.model.entity.Disciplinas;

public class AlunoDAOTest {
	
	@Test
	public void testarCreateAluno() {
		/*Aluno aluno = new Aluno();
		aluno.setCpfAluno("492.858.970-02");
		aluno.setNome("Alucard Santos");
		
		AlunoDAO alunoDao = new AlunoDAO();
		alunoDao.inserir(aluno);
		
		List<Disciplinas> listaDisciplinas = new ArrayList<>();
		
		Disciplinas disciplina = new Disciplinas();
		disciplina.setCodigoDisciplina(1);
		disciplina.setNomeDisciplina("Defesa contra as artes das trevas");
		listaDisciplinas.add(disciplina);
		
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setCodigoDisciplina(2);
		disciplina2.setNomeDisciplina("Trato das criaturas magicas");
		listaDisciplinas.add(disciplina2);
		
		Aluno aluno = new Aluno();
		aluno.setCpfAluno("492.858.970-04");
		aluno.setNome("Harry Potter");
		aluno.setListaDisciplinas(listaDisciplinas);
		
		AlunoDAO alunoDao = new AlunoDAO();
		alunoDao.inserir(aluno);*/
		
		Aluno aluno = new Aluno();
		aluno.setCpfAluno("492.858.970-05");
		aluno.setNome("Ronnald Weasley");
		aluno.setTelefone("81987654321");
		
		AlunoDAO alunoDao = new AlunoDAO();
		alunoDao.inserir(aluno);
	}

}
