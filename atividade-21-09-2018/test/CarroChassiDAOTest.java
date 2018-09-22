package alyssonJava.modelo.dao.entidades;

import org.junit.Test;

public class CarroChassiDAOTest {

	@Test
	public void testCreateCarroChassiDAO(){
		CarroChassi carroChassi = new CarroChassi();
		carroChassi.setNumero(6666);
		carroChassi.setPrefixo("ZZZ");
		
		CarroChassi b = new CarroChassi();
		b.setNumero(6666);
		b.setPrefixo("ZZZ");
		
		CarroChassiDAO.inserir(carroChassi);
		CarroChassiDAO.inserir(b);
	}
	
}
