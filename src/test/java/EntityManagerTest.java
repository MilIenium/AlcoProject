import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerTest {
    private EntityManagerFactory factory;
    private EntityManager manager;

    @Test
    public void smokeTest(){
        factory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        manager = factory.createEntityManager();

        try {

            manager.getTransaction().begin();
            User user = new User ("Andrei", "Lavrinovich", "Login", "Net", false);
            manager.persist(user);
            manager.getTransaction().commit();

        }finally{

            manager.close();
            factory.close();

        }
    }
}