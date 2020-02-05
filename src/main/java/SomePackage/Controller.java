package SomePackage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@org.springframework.stereotype.Controller
public class Controller{
    //private AddressBook book;
    //private HomeFrame frame;

    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    private  AddressBookRepository bookRepository;

    private  BuddyInfoRepository buddyInfoRepository;


    @Autowired
    public Controller(AddressBookRepository bookRepository, BuddyInfoRepository buddyInfoRepository)
    {
        this.bookRepository = bookRepository;
        this.buddyInfoRepository = buddyInfoRepository;
    }

    @PostMapping("/newBook")
    @ResponseStatus(value = HttpStatus.OK)
    public void newAddressBookController(Model model)
    {
        AddressBook book = new AddressBook();
        bookRepository.save(book);
        //Integer id = book.getId();
        //model.addAttribute("bookId", id);
    }


    @PostMapping("/addBuddy")
    @ResponseStatus(value = HttpStatus.OK)
    public void addBuddyController( @RequestParam("name") String name, @RequestParam("num") Integer num,  Model model)
    {
        AddressBook book = bookRepository.findById(1);
        BuddyInfo buddy = new BuddyInfo(name,num);
        book.addBuddy(buddy);
        buddyInfoRepository.save(buddy);
        //model.addAttribute("Buddy", buddy);
        //model.addAttribute("book", book);
        //return "Success";
    }

    @PostMapping("/removeBuddy")
    @ResponseStatus(value = HttpStatus.OK)
    public void removeBuddyController(@RequestParam(value = "name", required = false, defaultValue = "") String name,
                                        @RequestParam("id") int id, Model model)
    {
        AddressBook book = bookRepository.findById(1);
        BuddyInfo buddy= buddyInfoRepository.findById(id);
        Integer buddyId = buddy.getId();
        //model.addAttribute("Buddy", buddy);
        book.removeBuddy(buddyId);
        bookRepository.save(book);
        //model.addAttribute("book",book);
        //return "Success";
    }

    @GetMapping("/showBuddies")
    public String showBuddies(Model model)
    {
        AddressBook book = bookRepository.findById(1);
        model.addAttribute("book", book);
        return "Success";
    }

}
