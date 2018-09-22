package alyssonJava.modelo.dao.entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class CarroChassiDAO {
	
	public static void inserir(CarroChassi carroChassi) {
		inserir(carroChassi, UtilJPA.getEntityManager(), true);
	}
	
	public static void inserir(CarroChassi carroChassi, EntityManager pEM, boolean pFecharEM) {
		pEM.getTransaction().begin();
		pEM.persist(carroChassi);
		pEM.getTransaction().commit();
		if ( pFecharEM ) {
			pEM.close();
		}
	}

}
