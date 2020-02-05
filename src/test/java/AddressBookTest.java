import SomePackage.AddressBook;
import SomePackage.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class AddressBookTest {
    AddressBook book;
    BuddyInfo buddy1, buddy2;
    @org.junit.Before
    public void setUp() {
        book = new AddressBook();
        buddy1 = new BuddyInfo("Hii", 12345);
    }

    @org.junit.After
    public void tearDown() {
        book = new AddressBook();
    }

    @org.junit.Test
    public void setBuddies()
    {
        Collection<BuddyInfo> mybuddies = new HashSet<>();
        mybuddies.add(buddy1);
        book.setBuddies(mybuddies);

        assert book.getBuddies().size() == 1;
    }

    @Test
    public void getBuddies()
    {
        assert book.getBuddies().size() == 0;
    }

    @Test
    public void perform() {

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

        AddressBook book = new AddressBook();

        Collection<BuddyInfo> mybuddies = new HashSet<>();
        mybuddies.add(buddy1);
        mybuddies.add(buddy2);

        book.setBuddies(mybuddies);

        em.persist(book);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT bud FROM AddressBook bud");

        @SuppressWarnings("unchecked")
        List<AddressBook> results = q.getResultList();

        System.out.println("List of products\n----------------");

        for (AddressBook bud : results) {

            System.out.println(bud.toString());
        }

        // Closing connection
        em.close();

        emf.close();
    }
}

