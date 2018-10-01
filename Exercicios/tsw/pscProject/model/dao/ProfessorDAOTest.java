package pscProject.model.dao;

import org.junit.Test;

import pscProject.model.entity.Professor;

public class ProfessorDAOTest {
	
	@Test
	public void inserirProfessor(){
		Professor professor = new Professor();
		professor.setCodigoProfessor(1);
		professor.setNome("Severo Snape");
		professor.setSalarioProfessor(2.000);
		professor.setTelefone("81992812222");
		
		ProfessorDAO professorDao = new ProfessorDAO();
		professorDao.inserir(professor);
		
	}
	
	

}
