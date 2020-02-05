package Ui;
/*
import SomePackage.AddressBook;
import SomePackage.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame{

    private Controller controller;
    private AddressBook myModel;
    private JTextField buddyName;
    private JTextField buddyPhone;
    private JButton save;

    private JButton findByName;
    private JButton findbyId;

    private JTextField idFind;
    private JTextField nameFind;



    public HomeFrame()
    {
        Container grid = this.getContentPane();
        grid.setLayout(new GridLayout());

        JPanel mygrid = new JPanel();
        mygrid.setLayout(new GridLayout(1,6));


        buddyName = new JTextField("Enter buddy name");
        buddyPhone = new JTextField("Enter buddy phone");
        save = new JButton("Save buddy");

        findByName = new JButton("Find by Name");
        findbyId = new JButton("Find by Id");

        idFind = new JTextField("Id");
        nameFind  = new JTextField("nameFind");


        grid.add(buddyName);
        grid.add(buddyPhone);

        grid.add(save);
        grid.add(findByName);
        grid.add(findbyId);

        this.pack();
        this.init();
    }


    public void init() {

        this.setResizable(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));


        setState(Frame.NORMAL);
        setVisible(true);
    }

   public void setController(Controller control)
   {
       this.controller = control;
       this.save.addActionListener(this.controller);
       this.findByName.addActionListener(this.controller);
       this.findbyId.addActionListener(this.controller);
   }

   public void  setMyModel(AddressBook myModel)
   {
       this.myModel = myModel;
   }

   public int getPhoneNum()
   {
       return Integer.parseInt(this.buddyPhone.getText());
   }

   public String getName()
   {
       return this.buddyName.getText();
   }

   public int getIdFind()
   {
       return Integer.parseInt((this.idFind.getText()));
   }

   public  String getNameFind()
   {
       return this.nameFind.getText();
   }

   public static void main(String [] args)
   {





   }
}*/
