package pscProject.model.dao;

import org.junit.Test;

import pscProject.model.entity.Correntista;

public class CorrentistaDAOTest {
	
	CorrentistaDAO correntistaDAO;
	
	@Test
	public void testarCreateCorrentistaDAO() {
		Correntista c = new Correntista();
		c.setCPF("123.123.123-98");
		c.setNome("Gildoso E Pah");
		
		correntistaDAO.inserir(c);
		
	}
	
}
