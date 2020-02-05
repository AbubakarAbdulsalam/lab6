package SomePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
@Component
public class AddressBook {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany
    private Collection<BuddyInfo> buddies;






    public AddressBook()
    {
        this.buddies = new HashSet<>();
    }

    public AddressBook(List<BuddyInfo> buddies)
    {
        this.buddies = buddies;
    }


    public  void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return this.id;
    }


    public Collection<BuddyInfo> getBuddies()
    {
        return this.buddies;
    }

    public void setBuddies(Collection<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    @Override
    public String toString() {
        String buddies = "";
        for (BuddyInfo buddy: this.buddies
        ) {
            buddies  =  buddies + " Name: " + buddy.getName() + " number " + buddy.getPhoneNumber() + " \n";
        }
        return  buddies;
    }

    public void addBuddy(BuddyInfo buddy)
    {
        this.buddies.add(buddy);

        System.out.println(buddy);
    }

    public void removeBuddy(Integer id)
    {
        this.buddies.removeIf(n -> (n.getId() == id));
    }

    public static void main(String[] args)
    {
        AddressBook book = new AddressBook();
        for(int i = 0; i < 4; i++)
        {
            BuddyInfo buddy = new BuddyInfo("Hello", 1234567);
            Collection<BuddyInfo> mybuddies = new HashSet<>();
            mybuddies.add(buddy);
            book.setBuddies(mybuddies);
        }

        System.out.println(book);
    }




}

 