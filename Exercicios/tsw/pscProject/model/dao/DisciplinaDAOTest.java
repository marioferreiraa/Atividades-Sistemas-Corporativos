package pscProject.model.dao;

import org.junit.Test;

import pscProject.model.entity.Disciplinas;

public class DisciplinaDAOTest {

	@Test
	public void criarDisciplina(){
		/*Disciplinas disciplinas = new Disciplinas();
		disciplinas.setCodigoDisciplina(1);
		disciplinas.setNomeDisciplina("Defesa contra as artes das trevas");
		
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		disciplinaDAO.inserir(disciplinas);*/
		
		Disciplinas disciplinas = new Disciplinas();
		disciplinas.setCodigoDisciplina(2);
		disciplinas.setNomeDisciplina("Trato das criaturas magicas");
		
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		disciplinaDAO.inserir(disciplinas);
		
	}
	
}
