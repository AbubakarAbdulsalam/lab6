package SomePackage;

import SomePackage.AddressBook;
import org.hibernate.annotations.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Component
public class BuddyInfo {
    private String name;
    private int phoneNumber;


    @Id
    @GeneratedValue
    private  Integer id;


    public Integer getId()
    {
        return  this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public BuddyInfo()
    {

    }


    public BuddyInfo(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(int num)
    {
        this.phoneNumber = num;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public String toString()
    {
        return "Id: " + this.id + " Name: " + this.name + ", Phone Number: " + this.phoneNumber;
    }

}

