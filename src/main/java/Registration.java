import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Registration {
    private EntityManagerFactory factory;
    private EntityManager manager;

    public void smokeTest(){
        factory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        manager = factory.createEntityManager();

        try {

                manager.getTransaction().begin();
                User user = new User ("Andrei","admin", false);
                manager.persist(user);
                manager.getTransaction().commit();

        }finally{

                manager.close();
                factory.close();

        }
    }
}
