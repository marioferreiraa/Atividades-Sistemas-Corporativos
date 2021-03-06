package pscProject.model.dao;

import javax.persistence.EntityManager;


import pscProject.model.entity.IEntidade;
import pscProject.model.entity.UtilJPA;

public abstract class AbstractDAO<T> implements InterfaceDAO<T>{

	@Override
	public void inserir(T pEntidade) {
		inserir(pEntidade, UtilJPA.getEntityManager(), true);

	}
	
	private void inserir(T pEntidade, EntityManager pEM, boolean pFecharEM) {
		pEM.getTransaction().begin();
		
		pEM.persist(pEntidade);
		
		pEM.getTransaction().commit();
		
		if(pFecharEM) {
			pEM.close();
		}
		
	}
	
	@Override
	public T inserirMerge(T pEntidade) {
		return inserirMerge(pEntidade, UtilJPA.getEntityManager(), true);

	}
	
	private T inserirMerge(T pEntidade, EntityManager pEM, boolean pFecharEM) {
		pEM.getTransaction().begin();
		
		T retorno = pEM.merge(pEntidade);
		
		pEM.getTransaction().commit();
		
		if(pFecharEM) {
			pEM.close();
		}
		
		return retorno;
		
	}

	@Override
	public void alterar(T pEntidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirPorChavePrimaria(Class pClasse, Object pPrimarykey) {
		excluirPorChavePrimaria(pClasse, pPrimarykey, UtilJPA.getEntityManager(), true);
	}
	
	private void excluirPorChavePrimaria(Class pClasse, Object pPrimaryKey, EntityManager pEntityManager, boolean pFecharEntityManager) {
		
		pEntityManager.getTransaction().begin();
		
		Object registro = pEntityManager.find(pClasse, pPrimaryKey);
		
		pEntityManager.remove(registro);
		
		pEntityManager.getTransaction().commit();
		
		if( pFecharEntityManager) {
			pEntityManager.close();
		}
		
	}

	@Override
	public void excluirPorObjeto(T entidade) {
		excluirPorObjeto(entidade, UtilJPA.getEntityManager(), true);

	}
	
	private void excluirPorObjeto(T entidade, EntityManager pEntityManager, boolean pFecharEntityManager) {
		
		IEntidade ent = (IEntidade)entidade;
		
		pEntityManager.getTransaction().begin();
		
		Object registro = pEntityManager.find(entidade.getClass(), (T)ent.getChavePrimaria());
		
		pEntityManager.remove(registro);
		
		pEntityManager.getTransaction().commit();
		
		if(pFecharEntityManager) {
			pEntityManager.close();
		}
		
	}
	
	@Override
	public void excluirPorObjetoDireto(T entidade) {
		excluirPorObjeto(entidade, UtilJPA.getEntityManager(), true);

	}
	
	private void excluirPorObjetoDireto(T entidade, EntityManager pEntityManager, boolean pFecharEntityManager) {
		
		pEntityManager.getTransaction().begin();
		
		pEntityManager.remove(entidade);
		
		pEntityManager.getTransaction().commit();
		
		if(pFecharEntityManager) {
			pEntityManager.close();
		}
		
	}

	@Override
	public T consultarPorChavePrimaria(Class pClasse, Object pPrimaryKey) {
		return consultarPorChavePrimaria(pClasse, pPrimaryKey, UtilJPA.getEntityManager(), true);

	}
	
	private T consultarPorChavePrimaria(Class pClasse, Object pPrimaryKey, EntityManager pEntityManager, boolean pFecharEntityManager) {
		T registro = (T)pEntityManager.find(pClasse, pPrimaryKey);
		
		if (pFecharEntityManager) {
			pEntityManager.close();
		}
		
		return registro;
	}

	@Override
	public T consultarPorObjeto(T pEntidade) {
		return consultarPorObjeto(pEntidade, UtilJPA.getEntityManager(), true);

	}
	
	private T consultarPorObjeto(T pEntidade, EntityManager pEntityManager, boolean pFecharEntityManager) {
		
		IEntidade ent = (IEntidade)pEntidade;
		
		T registro = (T)pEntityManager.find(pEntidade.getClass(), ent.getChavePrimaria());
		
		if (pFecharEntityManager) {
			pEntityManager.close();
		}
		
		return registro;
		
	}
}