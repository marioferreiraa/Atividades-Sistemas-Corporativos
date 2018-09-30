package pscProject.model.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {
	
	private static EntityManagerFactory emf;
	
	public static void createEntityManageFactory() {
		if (emf == null ) {
			emf = Persistence.createEntityManagerFactory("psc");
		}
	}
	
	public static EntityManager getEntityManager() {
		if(emf==null) {
			createEntityManageFactory();
		}
		
		return emf.createEntityManager();
	}
	
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}