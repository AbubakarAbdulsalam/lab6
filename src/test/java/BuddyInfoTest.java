import SomePackage.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BuddyInfoTest {
    private BuddyInfo buddy;
    private String name;
    private int num;



    @Before
    public void setUp() throws Exception {
        name = "Ali";
        num = 12345;
        buddy = new BuddyInfo(name,num);
    }

    @After
    public void tearDown() throws Exception {
        buddy = null;
    }

    @Test
    public void getName() {
        assert(buddy.getName().equals(name));
    }

    @Test
    public void getPhoneNumber() {
        assert(buddy.getPhoneNumber() == num);
    }

    @Test
    public void setPhoneNumber()
    {
        int num = 9086;
        buddy.setPhoneNumber(num);
        assert(buddy.getPhoneNumber() == num);
    }

    @Test
    public void setName()
    {
        String newName = "Lime";
        buddy.setName(newName);
        assert (buddy.getName().equals(newName));
    }
    /*

    @Test
    public void performJPA() {

        // Creating objects representing some products
        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setId(1);
        buddy1.setName("Hello");
        buddy1.setPhoneNumber(12345678);

        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setId(2);
        buddy2.setName("Hi");
        buddy2.setPhoneNumber(9876543);

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(buddy1);
        em.persist(buddy2);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT bud FROM BuddyInfo bud");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of products\n----------------");

        for (BuddyInfo bud : results) {

            System.out.println(bud.getName() + " (id=" + bud.getId() + ")");
        }

        // Closing connection
        em.close();

        emf.close();
    }*/
}

