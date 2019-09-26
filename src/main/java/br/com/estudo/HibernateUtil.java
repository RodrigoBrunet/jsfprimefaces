package br.com.estudo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	
	private static void init() {
			
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("projetojsfprimefaces");
			}
			
		} catch (Exception e) {
			
		}
	}
	
	public static EntityManager getEntityManager() {//cria a persistencia
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) {//retorna a primary key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}
