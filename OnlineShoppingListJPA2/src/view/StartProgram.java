package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListItem;

public class StartProgram {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("OnlineShoppingListJPA2");
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();	
		
		ListItem toAdd = new ListItem("Target", "Coffee");
		
		em.persist(toAdd);
		em.getTransaction().commit();
		
		em.close
		();
		emfactory.close();
		
	}

}
